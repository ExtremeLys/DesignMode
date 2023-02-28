package pers.facade.sampleCode.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    /**
     * 防止外部生成实例
     */
    private PageMaker() {
    }
    public static void makeWelcomePage(String mailaddr,String filename) {
        try {
            Properties maildata = Database.getProperties("maildata");
            String username = maildata.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to" + username + "'s page!'");
            writer.paragraph(username + "欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailaddr,username);
            writer.close();
            System.out.println(filename + "is created for" + mailaddr + "  (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
