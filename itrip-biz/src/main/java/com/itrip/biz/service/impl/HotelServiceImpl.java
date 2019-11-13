package com.itrip.biz.service.impl;

import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.HotelService;
import com.itrip.dao.hotel.HotelMapper;
import com.itrip.utils.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Resource
    private HotelMapper hotelMapper;
    @Override
    public PageData<Hotel> getPageHotelByCityId(int cityId, int pageIndex, int pageSize) {
        int from = (pageIndex - 1) * pageSize;
        List<Hotel> list = hotelMapper.getListHotelByCityId(cityId, from, pageSize);
        int cnt = hotelMapper.getCountHotelByCityId(cityId);
        PageData<Hotel> page = new PageData<>(pageIndex, pageSize, cnt, list);
        return page;
    }
}
