package com.zhj.event.main;

import com.zhj.event.exception.FilePathIsWrongException;
import com.zhj.event.utils.FileUtil;
import com.zhj.event.utils.HammingDistanceUtil;
import com.zhj.event.utils.SimHashUtil;

/**
 * @program: rghomework
 * @description: mian方法
 * @author: 周华娟
 * @create: 2021-09-17 10:51
 **/
public class Solution {

    /**
     *  论文查重的核心实现部分：
     *      1.读取文件txt
     *      2.计算simHash值
     *      3.由simHash值算出海明距离，继而求出相似度
     *      4.将结果写入文件
     * @param args 各个文件路径的值组成的一个String类型的数组
     */
    public static void main(String[] args) {
        //读取文件
        String s1 = FileUtil.readFile(args[0]);
        String s2 = FileUtil.readFile(args[1]);
        String similarityFile = args[2];
        //计算simHash值
        String simHash0 = SimHashUtil.getSimHash(s1);
        String simHash1 = SimHashUtil.getSimHash(s2);
        //计算相似度
        double similarity = HammingDistanceUtil.getSimilarity(simHash0, simHash1);
        //将结果写入文件
        try {
            FileUtil.writeFile(similarity, similarityFile);
            throw new FilePathIsWrongException();
        } catch (FilePathIsWrongException e) {
            e.printStackTrace();
        }

    }
}
