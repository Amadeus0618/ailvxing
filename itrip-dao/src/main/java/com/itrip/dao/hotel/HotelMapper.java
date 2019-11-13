package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;
import com.itrip.utils.PageData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 酒店的数据访问接口
 */
public interface HotelMapper {

    /**
     * 根据城市ID  分页查找信息
     *
     * @param cityId 城市ID
     * @return
     */
    List<Hotel> getListHotelByCityId(@Param("cityId") Integer cityId,
                                     @Param("from") int from,
                                     @Param("pageSize") int pageSize);
    /**
     * 根据城ID 查找酒店个数
     *
     * @param cityId
     * @return
     */
    int getCountHotelByCityId(@Param("cityId") Integer cityId);
}
