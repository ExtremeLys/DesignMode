package pers.vistitor.sampleCode;

import java.util.Iterator;

public abstract class Entry implements Element{
    /**
     * 获取文件名字
     * @return 文件名字
     */
    public abstract String getName();

    /**
     * 获取文件大小
     * @return 文件大小
     */
    public abstract int getSize();

    /**
     * 增加目录条目
     * @param entry 条目
     * @return 条目
     * @throws FileTreatmentException 文件处理异常
     */
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    /**
     * 生成Iterator
     * @return 迭代器
     * @throws FileTreatmentException 文件处理异常
     */
    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    /**
     * 显示字符串
     * @return 文件详情
     */
    public String toString(){
        return getName() + "(" + getSize() + ")";
    }
}
