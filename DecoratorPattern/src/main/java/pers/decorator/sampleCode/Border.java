package pers.decorator.sampleCode;

public abstract class Border extends Display{
    /**
     * 被装饰物
     */
    protected Display display;

    /**
     * 在生成实例时通过参数指定被装饰物
     * @param display 被装饰物
     */
    public Border(Display display) {
        this.display = display;
    }
}
