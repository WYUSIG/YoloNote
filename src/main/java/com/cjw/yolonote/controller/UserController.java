package com.cjw.yolonote.controller;

import com.cjw.yolonote.config.ResultDto;
import com.cjw.yolonote.pojo.TbFriend;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author 陈家婉
 * @Date 2019/12/17 0017
 * @Version V1.0
 **/
@Api(tags = "用户接口")
@Controller
@RequestMapping("/user")
public class UserController {



    @ResponseBody
    @RequestMapping("/test")
    @ApiOperation(value = "测试",notes = "此方法用于测试")
    public ResultDto test(TbFriend friend){
        return new ResultDto(200,"success","test");
    }
}
