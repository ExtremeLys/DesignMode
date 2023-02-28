package pers.facade.sampleCode.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    /**
     * 构造函数
     * @param writer
     */
    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    /**
     * 输出标题
     * @param title 标题
     * @throws IOException
     */
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    /**
     * 输出段落
     * @param msg massage
     * @throws IOException
     */
    public void paragraph (String msg) throws IOException {
        writer.write("<p> " + msg + " </p>\n");
    }

    /**
     * 输出超链接
     * @param href 链接
     * @param caption 链接标题
     * @throws IOException
     */
    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    /**
     * 输出邮件地址
     * @param mailaddr 邮件地址
     * @param username 用户名称
     * @throws IOException
     */
    public void mailto (String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, username);
    }

    /**
     * 结束输出HTML
     * @throws IOException
     */
    public void close () throws IOException {
        writer.write("</body>");
        writer.write("</html> \n");
        writer.close();
    }
}
