package pers.observer.sampleCode;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
    /**
     * 随机数生成器
     */
    private Random random = new Random();

    /**
     * 当前数值
     */
    private int number;

    /**
     * 获取当前数值
     * @return 随机数
     */
    public int getNumber() {
        return number;
    }
    public void execute() {
        for (int i = 0; i < 20; i ++) {
            number = random.nextInt(20);
            notifyObservers();
        }
    }
}
