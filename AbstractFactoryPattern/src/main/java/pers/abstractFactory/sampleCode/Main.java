package pers.abstractFactory.sampleCode;

import pers.abstractFactory.sampleCode.factory.Factory;
import pers.abstractFactory.sampleCode.factory.Link;
import pers.abstractFactory.sampleCode.factory.Page;
import pers.abstractFactory.sampleCode.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            //pers.abstractFactory.sampleCode.listfactory.ListFactory
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 1: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.people.com.cn/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
