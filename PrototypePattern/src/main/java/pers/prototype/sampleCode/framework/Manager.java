package pers.prototype.sampleCode.framework;

import java.util.HashMap;

public class Manager {
    /**
     * 用来保存实例的容器
     */
    private HashMap showcase = new HashMap();

    /**
     * 将实例保存到容器中
     * @param name 实例名
     * @param proto 实例
     */
    public void register(String name, Product proto){
        showcase.put(name,proto);
    }

    /**
     * clone新实例
     * @param protoName 原型名
     * @return 实例
     */
    public Product create(String protoName){
        Product p = (Product) showcase.get(protoName);
        return p.createClone();
    }
}
