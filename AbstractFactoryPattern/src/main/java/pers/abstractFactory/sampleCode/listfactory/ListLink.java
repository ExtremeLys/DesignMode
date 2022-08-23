package pers.abstractFactory.sampleCode.listfactory;

import pers.abstractFactory.sampleCode.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    /**
     * 返回HTML文件的内容
     *
     * @return 文件名
     */
    @Override
    public String makeHTML() {
        return "<li><a href = \"" + url + "\">" + caption + "</a></li>\n";
    }
}
