package com.example.homework.dto;

import lombok.Data;

/**
 * 数据传输对象
 * @param <T>
 */
@Data
public class ResultDto<T> {

    /**
     * 状态码
     */
    private int code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 是否成功
     */
    private String success;
    /**
     * 数据
     */
    private T data;

    @Override
    public String toString() {
        return "ResultDto{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", success='" + success + '\'' +
                ", data=" + data +
                '}';
    }

    public ResultDto() {
    }

    /*public ResultDto(int code, String msg, String success, T data) {
        this.code = code;
        this.msg = msg;
        this.success = success;
        this.data = data;
    }*/

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
