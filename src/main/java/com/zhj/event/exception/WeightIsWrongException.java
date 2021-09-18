package com.zhj.event.exception;

/**
 * @program: rghomework
 * @description:
 * @author: 周华娟
 * @create: 2021-09-18 09:48
 **/
public class WeightIsWrongException extends Exception{
    public WeightIsWrongException(){
        super("文本内容过短导致加权重错误",null);
    }
}
