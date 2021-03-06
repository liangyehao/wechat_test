package com.test.wechat.menu;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxButton;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.module.user.WxUser;
import com.mxixm.fastboot.weixin.module.web.WxRequest;
import lombok.extern.slf4j.Slf4j;



@WxController
@Slf4j
public class WxMenuLeftController {





    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.LEFT, main = true, name = "关于我")
    public void left() {
    }

    /**
     * 定义微信菜单，并接受事件
     * @return
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.FIRST,
            url = "http://123.57.177.220:8080",
            name= "个人简历")
    @WxAsyncMessage
    public void leftmySelf(WxRequest wxRequest, WxUser wxUser) {
//        saveUserInfo(wxUser, CommonConstant.CLICK_CSDN_VIEW);
       /* return WxMessage.newsBuilder()
                .addItem("测试图文消息",
                        "测试",
                        "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/logo_white.png",
                        "http://zhifa.free.idcfengye.com/")
                .build();*/
    }



    /**
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.SECOND,
            url = "https://mp.csdn.net/console/article",
            name= "CSDN博客")
    public void leftCSDN(WxRequest wxRequest, WxUser wxUser) {
       /* wxUserEventService.save(
                WxUserEvent.builder()
                        .event(CommonConstant.CLICK_CSDN_VIEW)
                        .openId(wxUser.getOpenId())
                        .createTime(new Date())
                        .build());*/
//        saveUserInfo(wxUser, CommonConstant.CLICK_CSDN_VIEW);
        log.info("CSDN博客：{}",wxUser);
    }
    /**
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.THIRD,
            url = "https://github.com/liangyehao",
            name= "GitHub仓库")
    public void leftGitHub(WxRequest wxRequest, WxUser wxUser) {
       /* wxUserEventService.save(
                WxUserEvent.builder()
                        .event(CommonConstant.CLICK_GitHub_VIEW)
                        .openId(wxUser.getOpenId())
                        .createTime(new Date())
                        .build());*/
//        saveUserInfo(wxUser, CommonConstant.CLICK_GitHub_VIEW);
        log.info("GitHub：{}",wxUser);
    }
 /**
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.FORTH,
            url = "https://gitee.com/xiaozhiZhiShui",
            name= "码云仓库")
    public void leftgitee(WxRequest wxRequest, WxUser wxUser) {
       /* wxUserEventService.save(
                WxUserEvent.builder()
                        .event(CommonConstant.CLICK_GitHub_VIEW)
                        .openId(wxUser.getOpenId())
                        .createTime(new Date())
                        .build());*/
//        saveUserInfo(wxUser, CommonConstant.CLICK_GitEE_VIEW);
        log.info("gitee：{}",wxUser);
    }


//    @Async
//    public void saveUserInfo(WxUser wxUser,String event) {
//        Date date = new Date();
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");
//        System.out.println(sdf.format(date));
//        wxUserEventService.save(
//                WxUserEvent.builder()
//                        .event(event)
//                        .openId(wxUser.getOpenId())
//                        .createTime(date)
//                        .build());
//        log.info("个人简历：{}",wxUser);
//    }

}
