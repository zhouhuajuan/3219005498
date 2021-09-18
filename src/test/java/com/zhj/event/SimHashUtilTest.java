package com.zhj.event;

import com.zhj.event.utils.FileUtil;
import com.zhj.event.utils.SimHashUtil;
import org.junit.jupiter.api.Test;

/**
 * @program: rghomework
 * @description: 测试计算文本哈希码
 * @author: 周华娟
 * @create: 2021-09-18 09:07
 **/
public class SimHashUtilTest {
    //测试将文本转化得到哈希码
    @Test
    public void getHashTest(){
        String str = "大娟";
        String hash = SimHashUtil.getHash(str);
        System.out.print("哈希码为："+hash+"\n"+"长度为："+hash.length());
    }

    //测试读取文件，将文件内容转为SimHash码
    @Test
    public void getSimHashTest(){
        String str0 = FileUtil.readFile("E:/rg/orig.txt");
        String str1 = FileUtil.readFile("E:/rg/orig_0.8_add.txt");
        System.out.println(SimHashUtil.getSimHash(str0));
        System.out.println(SimHashUtil.getSimHash(str1));
    }
}
