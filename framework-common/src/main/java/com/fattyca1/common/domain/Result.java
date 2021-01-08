package com.fattyca1.common.domain;

import com.fattyca1.common.util.JsonUtils;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * <br>返回对象</br>
 *
 * @author fattyca1
 * @version 1.0
 * @date 2020/1/20 11:34
 * @since 1.0
 */
@Data
@AllArgsConstructor
public class Result<T> implements Serializable {


    private String requestId;
    /**
     * 状态码
     */
    private Object code;

    /***
     * 说明信息
     */
    private String message;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 成功
     */
    public static final boolean SUCCESS = true;
    /**
     * 失败
     */
    public static final boolean FAILURE = false;



    @Override
    public String toString() {
        return JsonUtils.toJson(this);
    }

}