package com.example.hello;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {


    @Select(" select * from t_role  ")
    List<Role> getAllRole();

    @Delete(" delete t_role where id=#{id} ")
    void Delete(Integer id);
}
