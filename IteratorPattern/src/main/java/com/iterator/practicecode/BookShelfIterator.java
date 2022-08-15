package com.iterator.practicecode;

import com.iterator.Book;
import com.iterator.Iterator;

/**
 * @author LiYongSheng
 * 书架的迭代器
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;

    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    /**
     * 当集合中存在下一个元素时返回 true，遍历到结尾不存在下一个元素时返回false
     * hasNext()方法主要用于循环终止条件
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 方法返回类型时 Object 类型，这表明该方法返回的是集合中的一个元素。
     * 为了能够在下次调用next()方法时，该方法还隐含了将迭代器移动至下一个元素的处理。
     *
     * @return Object
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index ++ ;
        return book;
    }
}
