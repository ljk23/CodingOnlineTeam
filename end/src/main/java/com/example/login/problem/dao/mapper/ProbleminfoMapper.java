package com.example.login.problem.dao.mapper;

import com.example.login.problem.dao.entity.Probleminfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProbleminfoMapper {
    int deleteByPrimaryKey(Integer problemid);

    int insert(Probleminfo record);

    int insertSelective(Probleminfo record);

    Probleminfo selectByPrimaryKey(Integer problemid);

    int updateByPrimaryKeySelective(Probleminfo record);

    int updateByPrimaryKey(Probleminfo record);

    List<Probleminfo> selectByQuery(Probleminfo record);
}