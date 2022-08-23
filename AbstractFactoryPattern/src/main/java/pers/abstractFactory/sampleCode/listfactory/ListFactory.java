package pers.abstractFactory.sampleCode.listfactory;

import pers.abstractFactory.sampleCode.factory.Factory;
import pers.abstractFactory.sampleCode.factory.Link;
import pers.abstractFactory.sampleCode.factory.Page;
import pers.abstractFactory.sampleCode.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
