package com.cjw.yolonote.config;

/**
 * @ClassName ResultDto
 * @Description: TODO
 * @Author 陈家婉
 * @Date 2019/12/20 0020
 * @Version V1.0
 **/
public class ResultDto {

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    // 数据长度
    private Integer count;

    public ResultDto(Integer status, String msg, Object data, Integer count) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }

    public ResultDto(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.count = 0;
    }

    public ResultDto(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
        this.data = null;
        this.count = 0;
    }

    public ResultDto(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
        this.count = 0;
    }

    public ResultDto() {

    }

    public static ResultDto ok(Object data) {
        return new ResultDto(data);
    }

    public static ResultDto ok() {
        return new ResultDto(null);
    }

    public static ResultDto error(){
        return new ResultDto(500, "error");
    }
    public static ResultDto failure(){
        return new ResultDto(500, "failure");
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
