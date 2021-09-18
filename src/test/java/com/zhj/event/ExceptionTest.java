package com.zhj.event;

import com.zhj.event.exception.*;
import com.zhj.event.utils.FileUtil;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @program: rghomework
 * @description: 测试Exception包下的几种异常情况
 * @author: 周华娟
 * @create: 2021-09-18 09:08
 **/
public class ExceptionTest {
    //测试当两个文本的哈希码长度不等的情况
    @Test
    public void simHashExceptionTest(){
        String simHash1 = "0000";
        System.out.println(simHash1.length());
        String simHash2 = "00000";
        System.out.println(simHash2.length());
        try {
            throw new SimHashException();
        } catch (SimHashException e) {
            e.printStackTrace();
        }
    }

    //测试文件路径不存在的异常
    @Test
    public void filePathNoExistExceptionTest(){
        try {
            String s = FileUtil.readFile("E:/rg/null.txt");
            throw new FilePathIsWrongException();
        } catch (FilePathIsWrongException e) {
            e.printStackTrace();
        }
    }

    //测试错误路径的异常
    @Test
    public void filePathIsWrongExceptionTest(){
        try {
            double similarity = 0.24;
            FileUtil.writeFile(similarity,"F:/rg/test_write_file.txt");
            throw new FilePathIsWrongException();
        } catch (FilePathIsWrongException e) {
            e.printStackTrace();
        }

    }

    //测试文件文本内容为空的情况
    @Test
    public void fileIsNullExceptionTest(){
        String s = FileUtil.readFile("E:/rg/file_is_null.txt");
        try {
            if (s.length() == 0){
                throw new FileIsNullException();
            }
        } catch (FileIsNullException e) {
            e.printStackTrace();
        }
    }

    //测试文件文本过短异常，否则取不到关键字
    @Test
    public void fileIsShortException(){
        String s = FileUtil.readFile("E:/rg/file_is_short.txt");
        try {
            if (s.length() > 15 && s.length() < 150)
            throw new FileIsShortException();
        } catch (FileIsShortException e) {
            e.printStackTrace();
        }
    }

    //测试文件文本过短异常导致分配权重错误
    @Test
    public void weightIsWrongException(){
        try {
            String s = "广东工业大学";
            if (s.length() < 15){
                throw new WeightIsWrongException();
            }
        } catch (WeightIsWrongException e) {
            e.printStackTrace();
        }
    }
}
