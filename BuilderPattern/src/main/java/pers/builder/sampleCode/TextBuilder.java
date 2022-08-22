package pers.builder.sampleCode;

public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();

    /**
     * 编写标题
     * @param title 标题
     */
    @Override
    public void makeTitle(String title) {
        buffer.append("==========================\n");
        buffer.append("「" + title + "」");
        buffer.append("\n");
    }

    /**
     * 编写字符串
     * @param str 字符串
     */
    @Override
    public void makeString(String str) {
        buffer.append("◼︎" + str + "\n");
        buffer.append("\n");
    }

    /**
     * 编写条目
     * @param items 条目
     */
    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("·" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    /**
     * 完成文档编写
     */
    @Override
    public void close() {
        buffer.append("==========================\n");
    }

    /**
     * 完成的文档
     * @return String
     */
    public String getResult() {
        return buffer.toString();
    }
}
