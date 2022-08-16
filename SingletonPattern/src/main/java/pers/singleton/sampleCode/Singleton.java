package pers.singleton.sampleCode;

public class Singleton {

    private static Singleton singleton = new Singleton();

    public Singleton() {
        System.out.println("生成了一个实例。");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
