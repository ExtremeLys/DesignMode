package pers.adapter.practiceCode;

import java.io.*;
import java.util.Properties;

/**
 * @author LiYongSheng
 */
public class FileProperties extends Properties implements FileIO{
    /**
     * 读取文件
     *
     * @param fileName 文件名称
     * @throws IOException IO异常
     */
    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }

    /**
     * 写入文件
     *
     * @param fileName 文件名称
     * @throws IOException IO异常
     */
    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(fileName),"written by FileProperties");
    }

    /**
     * 设置值
     *
     * @param key   key
     * @param value value
     */
    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    /**
     * 获取值
     *
     * @param key key
     */
    @Override
    public void getValue(String key) {
        getProperty(key);
    }
}
