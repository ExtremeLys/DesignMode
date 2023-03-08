package pers.memento.sampleCode.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    /**
     * 所持金钱
     */
    int money;

    /**
     * 获得的水果
     */
    ArrayList fruits;

    /**
     * 获取当前所持有金钱
     * @return 金钱
     */
    public int getMoney(){
        return money;
    }

    /**
     * 构造函数
     * @param money 金钱
     */
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    /**
     * 添加水果
     * @param fruit 水果
     */
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    /**
     * 获取当前所持所有水果
     * @return 所有水果
     */
    List getFruits() {
        return (List) fruits.clone();
    }
}
