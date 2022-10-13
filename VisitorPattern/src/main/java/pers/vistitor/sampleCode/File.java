package pers.vistitor.sampleCode;

public class File extends Entry{
    /**
     * 文件名
     */
    private String name;
    /**
     * 文件大小
     */
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
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
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visitor(this);
    }
}
