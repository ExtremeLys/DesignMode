package pers.builder.sampleCode;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder{
    /**
     * 文件名
     */
    private String filename;
    /**
     * 用于编写文件的 PrintWriter
     */
    private PrintWriter writer;

    /**
     * 编写标题
     * @param title 标题
     */
    @Override
    public void makeTitle(String title) {
        // 标题作为文件名
        filename = title + ".html";
        try {
            // 生成 PrintWriter
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
        writer.println("<title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    /**
     * HTML 文件中输出的字符串
     * 用<p>标签输出
     * @param str 字符串
     */
    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    /**
     * HTML 文件中的条目
     * 用 <ul> 和 <li> 输出
     * @param items 字符串数组
     */
    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    /**
     * 完成文档
     * 关闭标签
     * 关闭文件
     */
    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    /**
     * 编写完成的文档
     * 返回文件名
     * @return 文件名
     */
    public String getResult(){
        return filename;
    }
}
