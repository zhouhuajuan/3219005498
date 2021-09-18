package com.zhj.event;

import com.zhj.event.utils.FileUtil;
import com.zhj.event.utils.HammingDistanceUtil;
import com.zhj.event.utils.SimHashUtil;
import org.junit.jupiter.api.Test;

/**
 * @program: rghomework
 * @description: 测试计算海明距离的方法
 * @author: 周华娟
 * @create: 2021-09-18 09:10
 **/
public class HammingDistanceUtilTest {

    //读取两个文本得到SimHash码计算得到海明距离
    @Test
    public void getHammingDistanceTest() {
        String str0 = FileUtil.readFile("E:/rg/orig.txt");
        String str1 = FileUtil.readFile("E:/rg/orig_0.8_add.txt");
        int distance = HammingDistanceUtil.getHammingDistance(SimHashUtil.getSimHash(str0),
                SimHashUtil.getSimHash(str1));
        System.out.println("海明距离：" + distance);
    }

    //读取两个文本得到SimHash码计算得到相似度
    @Test
    public void getSimilarityTest() {
        String str0 = FileUtil.readFile("E:/rg/orig.txt");
        String str1 = FileUtil.readFile("E:/rg/orig_0.8_add.txt");
        double similarity = HammingDistanceUtil.getSimilarity(SimHashUtil.getSimHash(str0),
                SimHashUtil.getSimHash(str1));
        System.out.println("str0和str1的相似度:" + similarity);
    }
}
