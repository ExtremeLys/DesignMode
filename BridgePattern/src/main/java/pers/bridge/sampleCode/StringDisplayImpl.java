package pers.bridge.sampleCode;

public class StringDisplayImpl extends DisplayImpl{
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    /**
     * 显示前处理
     */
    @Override
    public void rawOpen() {
        printLine();
    }

    /**
     * 显示处理
     */
    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    /**
     * 显示后处理
     */
    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
