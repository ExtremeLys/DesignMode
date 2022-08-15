package pers.templateMethod.sampleCode;

public class StringDisplay extends AbstractDisplay{

    private String string;

    private int width;

    public StringDisplay(String string) {
        this.string = string;
        width = string.getBytes().length;
    }

    /**
     * 交给子类实现的抽象方法 open()
     */
    @Override
    public void open() {
        printLine();
    }

    /**
     * 交给子类实现的抽象方法 print()
     */
    @Override
    public void print() {
        System.out.print("|" + string + "|");
    }

    /**
     * 交给子类实现的抽象方法 close()
     */
    @Override
    public void close() {
        printLine();
    }

    public void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
