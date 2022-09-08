package pers.composite.sampleCode;

public abstract class Entry {
    /**
     * 获取名字
     * @return 名字
     */
    public abstract String getName();

    /**
     * 获取大小
     * @return 大小
     */
    public abstract int getSize();

    /**
     * 加入目录条目一览
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    /**
     * 显示目录一览
     */
    public void printList() {
        printList("");
    }

    /**
     * 为一览加上前缀并显示目录条目一览
     * 显示代表类的文字
     * @param prefix
     */
    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + "（" + getSize() + "）";
    }
}
