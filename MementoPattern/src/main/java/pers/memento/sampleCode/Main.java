package pers.memento.sampleCode;

import pers.memento.sampleCode.game.Gamer;
import pers.memento.sampleCode.game.Memento;


public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100); // 最初的所持金钱数为 100
        Memento memento = gamer.createMemento(); // 保存最初的状态
        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i); // 显示投掷骰子的次数
            System.out.println("当前状态：" + gamer); // 显示主人公现在的状态

            gamer.bet(); //进行游戏

            System.out.println("所持金钱为" + gamer.getMoney() + "元。");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("   (所持金钱增加了许多，因此保存游戏当前状态) ");
                memento = gamer.createMemento();
            }else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("   (所持金钱减少了许多，因此游戏状态恢复以前的状态) ");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
