package pers.proxy.sampleCode;

public class Printer implements Printable{
    private String name;

    public Printer() {
        heavyJob("Priter的实例生成中 ");
    }

    /**
     * 构造方法
     * @param name 名字
     */
    public Printer(String name) {
        this.name = name;
        heavyJob("Printer的实例生成中（" + name +"）");
    }

    /**
     * 设置名字
     * @param name 名字
     */
    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    /**
     * 获取名字
     * @return 名字
     */
    @Override
    public String getPrinterName() {
        return name;
    }

    /**
     * 显示带打印机名字的文字
     * @param string 文字
     */
    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    /**
     * 重活
     * @param msg 消息
     */
    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("结束。");
    }
}
