package pers.abstractFactory.sampleCode.factory;

public abstract class Link extends Item{
    /**
     * 超链接的地址
     */
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
