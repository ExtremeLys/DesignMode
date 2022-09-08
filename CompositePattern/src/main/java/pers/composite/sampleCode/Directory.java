package pers.composite.sampleCode;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
    private String name;
    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    /**
     * 获取名字
     *
     * @return 名字
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * 获取大小
     *
     * @return 大小
     */
    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }


    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    /**
     * 为一览加上前缀并显示目录条目一览
     * 显示代表类的文字
     *
     * @param prefix
     */
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" +this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
