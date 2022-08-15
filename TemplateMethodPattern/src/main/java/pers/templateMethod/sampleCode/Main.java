package pers.templateMethod.sampleCode;

public class Main {
    public static void main(String[] args) {
        // 生成一个持有'A'的CharDisplay类的实例
        AbstractDisplay d1 = new CharDisplay('A');
        // 生成一个持有"hello,world."的StringDisplay类的实例
        AbstractDisplay d2 = new StringDisplay("hello,world.");
        // 生成一个持有"你好，世界。"的StringDisplay类的实例
        AbstractDisplay d3 = new StringDisplay("你好，世界。");
        /*
        * 由于d1、d2、d3都是AbstractDisplay的子类
        * 可以调用display方法
        * 实际程序运行的行为取决与CharDisplay类和StringDisplay类的具体实现
        * */
        d1.display();
        d2.display();
        d3.display();
    }
}
