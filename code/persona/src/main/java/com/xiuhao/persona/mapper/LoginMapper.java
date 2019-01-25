package com.xiuhao.persona.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface LoginMapper {
    @Select("SELECT local_product FROM special_local_product WHERE province_id = #{provinceId}")
    public List<String> getLocalProduct(@Param("provinceId") Integer provinceId);

    @Select("SELECT province FROM user_info WHERE username = #{userName}")
    public int getProvinceId(@Param("userName")String userName);

}
