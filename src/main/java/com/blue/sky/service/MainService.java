package com.blue.sky.service;

import com.blue.sky.mapper.MainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MainService {
    @Autowired
    MainMapper mainMapper;

    public List<Map<String, Object>> login(Map<String, Object> map) {

        List<Map<String, Object>> returnParam = mainMapper.login(map);

        return returnParam;

    }
}
