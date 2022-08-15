package pers.adapter.practiceCode;

import java.io.IOException;

/**
 * @author LiYongSheng
 * 定义一个接口
 */
public interface FileIO {
    /**
     * 读取文件
     * @param fileName 文件名称
     * @throws IOException IO异常
     */
    public void readFromFile(String fileName) throws IOException;

    /**
     * 写入文件
     * @param fileName 文件名称
     * @throws IOException IO异常
     */
    public void writeToFile(String fileName) throws IOException;

    /**
     * 设置值
     * @param key key
     * @param value value
     */
    public void setValue(String key,String value);

    /**
     * 获取值
     * @param key key
     */
    public void getValue(String key);
}
