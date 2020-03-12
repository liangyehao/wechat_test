package com.test.wechat.dto;

import lombok.Data;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/11 9:57
 * @content
 */
@Data
public class AccessToken {
    /**
     * 令牌名称
     */
    private String tokenName;

    /**
     * 有效时间 单位:秒
     */
    private int expireSecond;
}
