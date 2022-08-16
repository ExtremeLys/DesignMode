package pers.factoryMethod.sampleCode;

import pers.factoryMethod.sampleCode.framework.Factory;
import pers.factoryMethod.sampleCode.framework.Product;
import pers.factoryMethod.sampleCode.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create(" 小明 ");
        Product card2 = factory.create(" 小红 ");
        Product card3 = factory.create(" 小刚 ");
        card1.use();
        card2.use();
        card3.use();
    }
}
