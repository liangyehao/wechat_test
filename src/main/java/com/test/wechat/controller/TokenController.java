package com.test.wechat.controller;

import com.test.wechat.util.CheckUtils;
import com.test.wechat.util.MessageUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/11 9:26
 * @content
 */
@RestController
@RequestMapping("/liang")
public class TokenController {

    @GetMapping()
    public String check(
            @RequestParam("signature") String signature,
            @RequestParam("timestamp") String timestamp,
            @RequestParam("nonce") String nonce,
            @RequestParam("echostr") String echostr){

        //自定义token, 用作生成签名,从而验证安全性
        String token = "liang";
        // 将token、timestamp、nonce三个参数进行字典序排序并拼接为一个字符串
        String sortStr = CheckUtils.sort(token,timestamp,nonce);
        //字符串进行shal加密
        String mySignature = CheckUtils.shal(sortStr);
        if(!"".equals(signature) && !"".equals(mySignature) && signature.equals(mySignature)){
            System.out.println("-----签名校验通过-----");
            return echostr;
        }else {
            System.out.println("-----校验签名失败-----");
            return "";
        }
    }

    @PostMapping()
    public String check(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println("请求进入");
        String result = "";
        try {
            Map<String,String> map = MessageUtils.parseXml(req);

            System.out.println("开始构造消息");
            result = MessageUtils.buildXml(map);
            System.out.println(result);

            if("".equals(result)){
                result = "未正确响应";
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("发生异常："+ e.getMessage());
        }
        return result;
    }
}
