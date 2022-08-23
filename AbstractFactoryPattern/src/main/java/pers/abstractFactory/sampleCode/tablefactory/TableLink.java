package pers.abstractFactory.sampleCode.tablefactory;

import pers.abstractFactory.sampleCode.factory.Link;

public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    /**
     * 返回HTML文件的内容
     *
     * @return 文件名
     */
    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
