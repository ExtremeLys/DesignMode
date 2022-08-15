package com.iterator.samplecode;

import com.iterator.Book;
import com.iterator.Iterator;

/**
 * @author LiYongSheng
 * main方法
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendsBook(new Book("环游世界80天"));
        bookShelf.appendsBook(new Book("圣经"));
        bookShelf.appendsBook(new Book("灰姑娘"));
        bookShelf.appendsBook(new Book("长腿爸爸"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
