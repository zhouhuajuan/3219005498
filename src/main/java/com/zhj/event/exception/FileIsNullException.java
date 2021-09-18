package com.zhj.event.exception;

/**
 * @program: rghomework
 * @description: 文件内容为空的异常
 * @author: 周华娟
 * @create: 2021-09-18 09:12
 **/
public class FileIsNullException extends Exception{

    private static final long serialVersionUID = 1L;

    public FileIsNullException(){
        super("文件文本内容为空",null);
    }
}
