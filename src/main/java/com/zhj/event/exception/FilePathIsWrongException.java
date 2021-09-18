package com.zhj.event.exception;

/**
 * @program: rghomework
 * @description: 文件路径错误异常
 * @author: 周华娟
 * @create: 2021-09-18 09:24
 **/
public class FilePathIsWrongException extends Exception{
    private static final long serialVersionUID = 1L;

    public FilePathIsWrongException(){
        super("文件路径错误，无法写入",null);
    }
}
