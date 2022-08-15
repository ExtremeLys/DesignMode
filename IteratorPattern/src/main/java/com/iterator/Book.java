package com.iterator;

/**
 * @author LiYongSheng
 * book类
 */
public class Book {
    /**
     * 书名
     */
    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
