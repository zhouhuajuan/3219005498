package com.zhj.event.exception;

/**
 * @program: rghomework
 * @description: 处理各种文件异常
 * @author: 周华娟
 * @create: 2021-09-17 20:22
 **/
public class SimHashException extends Exception{

    public SimHashException() {
        super("文本1和文本2的SimHash值长度不相等，不能计算汉明距离",null);
    }
}
