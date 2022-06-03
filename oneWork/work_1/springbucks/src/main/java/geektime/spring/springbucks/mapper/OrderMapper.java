package geektime.spring.springbucks.mapper;

import geektime.spring.springbucks.model.Order;
import org.apache.ibatis.annotations.*;

public interface OrderMapper {

    @Insert("insert into t_order (customer, coffeeId, state, create_time, update_time) values (#{customer}, #{coffeeId}, #{state}, now(), now())")
    @Options(useGeneratedKeys = true, keyProperty="id") //自动生成主键，并可将自动生成的主键id返回
    int save(Order order);

    @Select("select * from t_order where id = #{id}")
    Order findById(@Param("id") Long id);

    @Update("update t_order set state = #{state}, update_time = #{update_time} where id = #{id}")
    int upd(Order order);

    @Delete("delete from t_order where id = #{id}")
    int del(@Param("id") Long id);

}
