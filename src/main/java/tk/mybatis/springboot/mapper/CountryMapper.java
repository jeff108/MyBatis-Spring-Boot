package tk.mybatis.springboot.mapper;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.springboot.model.Country;
import tk.mybatis.springboot.util.MyMapper;

public interface CountryMapper extends MyMapper<Country> {

    @Select("select * from country limit 1")
    Country findOne();
}