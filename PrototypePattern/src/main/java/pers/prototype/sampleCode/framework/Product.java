package pers.prototype.sampleCode.framework;


public interface Product extends Cloneable {
    /**
     * 使用的方法
     * @param s 使用
     */
    public abstract void use(String s);

    /**
     * 用于复制实例的方法
     * @return 实例
     */
    public abstract Product createClone();
}
