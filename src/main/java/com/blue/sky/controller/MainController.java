package com.blue.sky.controller;

import com.blue.sky.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    MainService service;

    @RequestMapping(value = "/")
    public String main() {
        logger.debug("메인 페이지 시작");

        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/loginMain")
    public List<Map<String, Object>> login(@RequestParam Map<String, Object> map) {

        logger.debug("로그인 페이지 시작");

        List<Map<String, Object>> returnParam = service.login(map);

        return returnParam;
    }
}
