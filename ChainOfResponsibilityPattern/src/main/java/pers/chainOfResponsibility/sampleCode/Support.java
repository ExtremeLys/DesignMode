package pers.chainOfResponsibility.sampleCode;

public abstract class Support {

    /**
     * 解决问题的实例的名字
     */
    private String name;
    /**
     * 要推卸给的对象
     */
    private Support next;

    /**
     * 生成的问题实例
     * @param name 问题名字
     */
    public Support(String name) {
        this.name = name;
    }

    /**
     * 设置要推卸给的对象
     * @param next 要推卸给的对象
     * @return 要推卸的对象
     */
    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    /**
     * 解决问题的步骤
     * @param trouble 问题
     */
    public final void support(Trouble trouble){
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null){
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    /**
     * 解决问题的方法
     * @param trouble 问题
     * @return true 解决  false 未解决
     */
    protected abstract boolean resolve(Trouble trouble);

    /**
     * 解决
     * @param trouble 问题
     */
    protected void done(Trouble trouble){
        System.out.println(trouble + "is resolved by " + this + ".");
    }

    /**
     * 未解决
     * @param trouble 问题
     */
    protected void fail(Trouble trouble){
        System.out.println(trouble + "cannot be resolved.");
    }
}
