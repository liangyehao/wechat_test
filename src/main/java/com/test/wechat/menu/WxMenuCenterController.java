package com.test.wechat.menu;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxButton;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.module.web.WxRequest;


@WxController
public class WxMenuCenterController {


    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.MIDDLE, main = true, name = "学习工具")
    public void center() {
    }

    /**
     * 图像识别
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.PIC_PHOTO_OR_ALBUM,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.FIRST,
            name = "照片转url")
    @WxAsyncMessage
    public void PIC_PHOTO_OR_ALBUM(WxRequest wxRequest) {
        //  WxRequest.Body body = wxRequest.getBody();

    }


    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.SECOND,
            url = "https://fanyi.baidu.com/?aldtype=16047#auto/zh",
            name = "百度翻译")
    @WxAsyncMessage
    public void youdaofanyi(WxRequest wxRequest) {
    }


}
