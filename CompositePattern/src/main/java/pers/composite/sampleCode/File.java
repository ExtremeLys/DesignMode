package pers.composite.sampleCode;

public class File extends Entry{
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
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
        return size;
    }

    /**
     * 为一览加上前缀并显示目录条目一览
     * 显示代表类的文字
     *
     * @param prefix
     */
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
