package pers.vistitor.sampleCode;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
    private String name;
    private ArrayList dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    /**
     * 获取文件名字
     *
     * @return 文件名字
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * 获取文件大小
     *
     * @return 文件大小
     */
    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = dir.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    /**
     * 增加目录条目
     *
     * @param entry 条目
     * @return 条目
     * @throws FileTreatmentException 文件处理异常
     */
    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        dir.add(entry);
        return this;
    }

    /**
     * 生成Iterator
     *
     * @return 迭代器
     * @throws FileTreatmentException 文件处理异常
     */
    @Override
    public Iterator iterator() throws FileTreatmentException {
        return dir.iterator();
    }


    @Override
    public void accept(Visitor v) {
        v.visitor(this);
    }
}
