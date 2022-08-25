package pers.bridge.sampleCode;

public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    /**
     * 显示前处理
     */
    public void open() {
        impl.rawOpen();
    }

    /**
     * 显示处理
     */
    public void print() {
        impl.rawPrint();
    }

    /**
     * 显示后处理
     */
    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
