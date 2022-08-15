package pers.templateMethod.sampleCode;

public class CharDisplay extends AbstractDisplay{
    private char aChar;

    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }

    /**
     * 交给子类实现的抽象方法 open()
     */
    @Override
    public void open() {
        System.out.print("<<");
    }

    /**
     * 交给子类实现的抽象方法 print()
     */
    @Override
    public void print() {
        System.out.print(aChar);
    }

    /**
     * 交给子类实现的抽象方法 close()
     */
    @Override
    public void close() {
        System.out.println(">>");
    }
}
