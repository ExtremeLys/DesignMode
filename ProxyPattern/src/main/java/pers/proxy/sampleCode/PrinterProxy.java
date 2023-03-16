package pers.proxy.sampleCode;

public class PrinterProxy implements Printable{
    /**
     * 名字
     */
    private String name;

    /**
     * "本人"
     */
    private Printer real;

    /**
     * 构造方法
     */
    public PrinterProxy() {
    }

    /**
     * 构造方法
     * @param name 名字
     */
    public PrinterProxy(String name) {
        this.name = name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    @Override
    public void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    /**
     * 获取名字
     *
     * @return 名字
     */
    @Override
    public String getPrinterName() {
        return name;
    }

    /**
     * 显示文字（ 打印输出 ）
     *
     * @param string 文字
     */
    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
