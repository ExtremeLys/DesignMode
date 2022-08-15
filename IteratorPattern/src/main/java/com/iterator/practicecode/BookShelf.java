package com.iterator.practicecode;

import com.iterator.Aggregate;
import com.iterator.Book;
import com.iterator.Iterator;

import java.util.ArrayList;

/**
 * @author LiYongSheng
 * 书架类
 */
public class BookShelf implements Aggregate {

    private final ArrayList<Book> arrayList;

    public BookShelf() {
        arrayList = new ArrayList<>();
    }

    public Book getBookAt(int index){
        return arrayList.get(index);
    }

    public void appendsBook(Book book){
        arrayList.add(book);
    }

    public int getLength(){
        return arrayList.size();
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
