package pers.chainOfResponsibility.sampleCode;

public class Trouble {
    /**
     * 问题编号
     */
    private int number;

    /**
     * 生成问题
     * @param number 问题编号
     */
    public Trouble(int number) {
        this.number = number;
    }

    /**
     * 获取问题编号
     * @return 问题编号
     */
    public int getNumber() {
        return number;
    }

    /**
     * 代表问题的字符串
     * @return
     */
    @Override
    public String toString() {
        return "[Trouble " + number + ']';
    }
}
