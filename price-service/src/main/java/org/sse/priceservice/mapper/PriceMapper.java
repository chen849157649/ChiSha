package org.sse.priceservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author HPY
 */
@Component
@Mapper
public interface PriceMapper {

    /**
     * search avg price in one month by ingredient id
     * @param id ingredient id
     * @return avg price
     */
    @Select("SELECT \n" +
            "    AVG(price)\n" +
            "FROM\n" +
            "    price_history\n" +
            "WHERE\n" +
            "    DATE_SUB(CURDATE(), INTERVAL 30 DAY) <= DATE(date)\n" +
            "        AND ingredient_id = #{id}")
    double searchAvgPriceInOneMonth(@Param("id") long id);

    /**
     * search avg price in one week by ingredient id
     * @param id
     * @return
     */
    @Select("SELECT \n" +
            "    AVG(price)\n" +
            "FROM\n" +
            "    price_history\n" +
            "WHERE\n" +
            "    DATE_SUB(CURDATE(), INTERVAL 30 DAY) <= DATE(date)\n" +
            "        AND ingredient_id = #{id}")
    double searchAvgPriceInOneWeek(@Param("id") long id);



}
