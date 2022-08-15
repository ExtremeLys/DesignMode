package com.iterator.samplecode;

import com.iterator.Aggregate;
import com.iterator.Book;
import com.iterator.Iterator;

/**
 * @author LiYongSheng
 * 书架类
 */
public class BookShelf implements Aggregate {

    private Book[] books;

    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendsBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }
    /**
     * 生成用于遍历集合的迭代器
     *
     * @return 迭代器
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
