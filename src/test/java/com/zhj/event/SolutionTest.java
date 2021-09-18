package com.zhj.event;

import com.zhj.event.utils.FileUtil;
import com.zhj.event.utils.HammingDistanceUtil;
import com.zhj.event.utils.SimHashUtil;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

/**
 * @program: rghomework
 * @description: 测试Solution类，也就是计算各个文件与原文件的相似度并记录下来
 * @author: 周华娟
 * @create: 2021-09-17 10:49
 **/
public class SolutionTest {
    DecimalFormat df = new DecimalFormat("0.00");

    //测试所有的抄袭文件与原文件的相似度，并将结果写入一个similarity.txt文件
    @Test
    public void allTest(){
        String[] str = new String[6];
        str[0] = FileUtil.readFile("E:/rg/orig.txt");
        str[1] = FileUtil.readFile("E:/rg/orig_0.8_add.txt");
        str[2] = FileUtil.readFile("E:/rg/orig_0.8_del.txt");
        str[3] = FileUtil.readFile("E:/rg/orig_0.8_dis_1.txt");
        str[4] = FileUtil.readFile("E:/rg/orig_0.8_dis_10.txt");
        str[5] = FileUtil.readFile("E:/rg/orig_0.8_dis_15.txt");
        String similarityFile = "E:/rg/similarity.txt";
        for(int i = 0; i <= 5; i++){
            double similarity = HammingDistanceUtil.getSimilarity(SimHashUtil.getSimHash(str[0]),
                    SimHashUtil.getSimHash(str[i]));
            FileUtil.writeFile(similarity, similarityFile);
        }
    }

    //测试原文件与原文件的相似度
    @Test
    public void origTest(){
        String str0 = FileUtil.readFile("E:/rg/orig.txt");
        String str1 = FileUtil.readFile("E:/rg/orig.txt");
        double similarity = HammingDistanceUtil.getSimilarity(SimHashUtil.getSimHash(str0),
                SimHashUtil.getSimHash(str1));
        System.out.println("相似度为：" + df.format(similarity));
    }

    //测试原文件与orig_0.8_add.txt的相似度
    @Test
    public void addTest(){
        String str0 = FileUtil.readFile("E:/rg/orig.txt");
        String str1 = FileUtil.readFile("E:/rg/orig_0.8_add.txt");
        double similarity = HammingDistanceUtil.getSimilarity(SimHashUtil.getSimHash(str0),
                SimHashUtil.getSimHash(str1));
        System.out.println("相似度为：" + df.format(similarity));
    }

    //测试原文件与orig_0.8_del.txt的相似度
    @Test
    public void delTest(){
        String str0 = FileUtil.readFile("E:/rg/orig.txt");
        String str1 = FileUtil.readFile("E:/rg/orig_0.8_del.txt");
        double similarity = HammingDistanceUtil.getSimilarity(SimHashUtil.getSimHash(str0),
                SimHashUtil.getSimHash(str1));
        System.out.println("相似度为：" + df.format(similarity));
    }

    //测试原文件与orig_0.8_dis_1.txt的相似度
    @Test
    public void dis1Test(){
        String str0 = FileUtil.readFile("E:/rg/orig.txt");
        String str1 = FileUtil.readFile("E:/rg/orig_0.8_dis_1.txt");
        double similarity = HammingDistanceUtil.getSimilarity(SimHashUtil.getSimHash(str0),
                SimHashUtil.getSimHash(str1));
        System.out.println("相似度为：" + df.format(similarity));
    }

    //测试原文件与orig_0.8_dis_10.txt的相似度
    @Test
    public void dis10Test(){
        String str0 = FileUtil.readFile("E:/rg/orig.txt");
        String str1 = FileUtil.readFile("E:/rg/orig_0.8_dis_10.txt");
        double similarity = HammingDistanceUtil.getSimilarity(SimHashUtil.getSimHash(str0),
                SimHashUtil.getSimHash(str1));
        System.out.println("相似度为：" + df.format(similarity));
    }

    //测试原文件与orig_0.8_dis_15.txt的相似度
    @Test
    public void dis15Test(){
        String str0 = FileUtil.readFile("E:/rg/orig.txt");
        String str1 = FileUtil.readFile("E:/rg/orig_0.8_dis_15.txt");
        double similarity = HammingDistanceUtil.getSimilarity(SimHashUtil.getSimHash(str0),
                SimHashUtil.getSimHash(str1));
        System.out.println("相似度为：" + df.format(similarity));
    }
}
