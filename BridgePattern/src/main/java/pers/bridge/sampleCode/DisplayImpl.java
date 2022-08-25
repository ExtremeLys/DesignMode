package pers.bridge.sampleCode;

public abstract class DisplayImpl {
    /**
     * 显示前处理
     */
    public abstract void rawOpen();

    /**
     * 显示处理
     */
    public abstract void rawPrint();

    /**
     * 显示后处理
     */
    public abstract void rawClose();
}
