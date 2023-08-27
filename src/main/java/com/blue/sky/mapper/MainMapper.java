package com.blue.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface MainMapper {
    List<Map<String, Object>> login(Map<String, Object> map);
}
