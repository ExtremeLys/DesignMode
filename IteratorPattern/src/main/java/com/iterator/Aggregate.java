package com.iterator;

/**
 * @author LiYongSheng
 * 代表集合的接口
 */
public interface Aggregate {

    /**
     * 生成用于遍历集合的迭代器
     * @return 迭代器
     */
    public abstract Iterator iterator();

}
