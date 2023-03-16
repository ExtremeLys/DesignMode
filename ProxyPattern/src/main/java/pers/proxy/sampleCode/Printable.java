package pers.proxy.sampleCode;

public interface Printable {
    /**
     * 设置名字
     * @param name 名字
     */
    public abstract void setPrinterName(String name);

    /**
     * 获取名字
     * @return 名字
     */
    public abstract String getPrinterName();

    /**
     * 显示文字（ 打印输出 ）
     * @param string 文字
     */
    public abstract void print(String string);
}
