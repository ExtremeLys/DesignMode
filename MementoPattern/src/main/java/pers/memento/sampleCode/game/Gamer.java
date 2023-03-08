package pers.memento.sampleCode.game;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    /**
     * 所持金钱
     */
    private int money;

    /**
     * 获得的水果
     */
    private List fruits = new ArrayList();

    /**
     * 随机数生成器
     */
    private Random random = new Random();

    /**
     * 表示水果种类的数组
     */
    private static String[] fruitsName = {
            "苹果","葡萄","香蕉","橘子"
    };

    /**
     * 构造方法
     * @param money 金额
     */
    public Gamer(int money) {
        this.money = money;
    }

    /**
     * 获取当前所持金钱
     * @return 金钱
     */
    public int getMoney() {
        return money;
    }

    /**
     * 投掷骰子进行游戏
     */
    public void bet() {
        // 投骰子
        int dice = random.nextInt(6) + 1;

        if (dice == 1) { //结果为1时，增加所持金钱
            money += 100;
            System.out.println("所持金钱增加。");
        } else if (dice == 2) { //结果为2时，减少所持金钱
            money /= 2;
            System.out.println("所持金钱减少。");
        }else if (dice == 6) { //结果为6时，获得水果
            String f = getFruit();
            fruits.add(f);
        }else { // 结果为3、4、5时什么都不会发生
            System.out.println("什么都没有发生。。。");
        }
    }

    /**
     * 拍摄快照
     * @return 快照
     */
    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String) it.next();
            if (f.startsWith(" 好吃的 ")) { //只保存好吃的水果
                m.addFruit(f);
            }
        }
        return m;
    }

    /**
     * 撤销
     * @param memento 快照
     */
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    /**
     * 用字符串表示主人公的状态
     * @return 主人公状态
     */
    public String toString() {
        return "[money = " + money + ",fruits = " + fruits + " ]";
    }

    /**
     * 获得一个水果
     * @return 水果
     */
    private String getFruit() {
        String preFix = "";
        if (random.nextBoolean()) {
            preFix = " 好吃的 ";
        }
        return preFix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
