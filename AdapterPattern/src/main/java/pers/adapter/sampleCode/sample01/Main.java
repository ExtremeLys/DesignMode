package pers.adapter.sampleCode.sample01;

/**
 * @author LiYongSheng
 * Client 请求者
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
