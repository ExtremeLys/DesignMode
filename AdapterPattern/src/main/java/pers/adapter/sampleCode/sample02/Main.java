package pers.adapter.sampleCode.sample02;

/**
 * @author LiYongSheng
 * Client 请求者
 */
public class Main {
    public static void main(String[] args) {
        PrintBanner p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
