package pers.abstractFactory.sampleCode.factory;

public abstract class Item {
    /**
     * 标题
     */
    protected String caption;

    public Item(String caption){
        this.caption = caption;
    }

    /**
     * 返回HTML文件的内容
     * @return 文件名
     */
    public abstract String makeHTML();
}
