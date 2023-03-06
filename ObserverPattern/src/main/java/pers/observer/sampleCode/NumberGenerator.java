package pers.observer.sampleCode;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    /**
     * 保存Observer们
     */
    private ArrayList observers = new ArrayList();

    /**
     * 注册Observer
     * @param observer observer
     */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除observer
     * @param observer observer
     */
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * 向Observer发送通知
     */
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer o = (Observer) iterator.next();
            o.update(this);
        }
    }

    /**
     * 获取数值
     * @return 数值
     */
    public abstract int getNumber();

    /**
     * 生成数值
     */
    public abstract void execute();
}
