package com.zhj.event;

import com.zhj.event.utils.FileUtil;
import org.junit.jupiter.api.Test;

/**
 * @program: rghomework
 * @description: 测试文件的读入，写入是否有错，也就是测试FileUtils类的方法
 * @author: 周华娟
 * @create: 2021-09-18 09:04
 **/
public class FileUtilTest {
    //测试是否能正常读取存在的文件，并打印在控制台
    @Test
    public void readFileTest() {
        String str = FileUtil.readFile("E:/rg/orig.txt");
        System.out.println(str);
    }

    //测试是否能正常写入数据进一个新建的文件.txt
    @Test
    public void writeFileTest() {
        double similarity = 0.24;
        FileUtil.writeFile(similarity,"E:/rg/test_write_file.txt");
    }
}
