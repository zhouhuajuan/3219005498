package com.zhj.event.exception;

/**
 * @program: rghomework
 * @description: 文件文本过短异常
 * @author: 周华娟
 * @create: 2021-09-18 09:36
 **/
public class FileIsShortException extends Exception{
    public FileIsShortException(){
        super("文本内容过短",null);
    }
}
