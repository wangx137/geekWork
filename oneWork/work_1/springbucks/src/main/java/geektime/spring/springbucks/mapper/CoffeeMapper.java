package geektime.spring.springbucks.mapper;

import geektime.spring.springbucks.model.Coffee;
import org.apache.ibatis.annotations.*;

public interface CoffeeMapper {

    @Insert("insert into t_coffee (name, price, create_time, update_time) values (#{name}, #{price}, now(), now())")
    @Options(useGeneratedKeys = true, keyProperty="id") //自动生成主键，并可将自动生成的主键id返回
    int save(Coffee coffee);

    @Select("select * from t_coffee where id = #{id}")
    Coffee findById(@Param("id") Long id);

    @Update("update t_coffee set name = #{name}, update_time = #{update_time} where id = #{id}")
    int upd(Coffee coffee);

    @Delete("delete from t_coffee where id = #{id}")
    int del(@Param("id") Long id);

}
