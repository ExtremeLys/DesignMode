package pers.templateMethod.sampleCode;

public abstract class AbstractDisplay {
    /**
     * 交给子类实现的抽象方法 open()
     */
    public abstract void open();

    /**
     * 交给子类实现的抽象方法 print()
     */
    public abstract void print();

    /**
     * 交给子类实现的抽象方法 close()
     */
    public abstract void close();

    /**
     * 本抽象类中实现的 display()
     */
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
