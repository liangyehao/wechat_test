package com.test.wechat.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.wechat.dto.tuling.TulingReqDto;
import com.test.wechat.dto.tuling.TulingResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/tuling")
@RestController
public class TulingController {

    @Autowired
    private RestTemplate restTemplate;

    private String tulingUrl = "http://openapi.tuling123.com/openapi/api/v2";

    @PostMapping("/message")
    public Object test(@RequestBody TulingReqDto dto){
        String result = restTemplate.postForObject(tulingUrl, dto, String.class);
        JSONObject jsonObject = JSON.parseObject(result);
        TulingResDto tulingResDto = JSON.toJavaObject(jsonObject, TulingResDto.class);
        return tulingResDto;
    }
}
