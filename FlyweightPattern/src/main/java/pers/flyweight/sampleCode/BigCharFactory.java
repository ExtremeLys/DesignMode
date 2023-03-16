package pers.flyweight.sampleCode;

import java.util.HashMap;

public class BigCharFactory {
    /**
     * 管理生成的BigChar的实例
     */
    private HashMap pool = new HashMap();

    /**
     * Singleton模式
     */
    private static BigCharFactory singleton = new BigCharFactory();

    /**
     * 构造方法
     */
    private BigCharFactory() {
    }

    /**
     * 获取唯一实例
     * @return BigCharFactory
     */
    public static BigCharFactory getInstance() {
        return singleton;
    }

    /**
     * 生成（共享）BigChar类的实例
     * @param charName char
     * @return BigChar
     */
    public synchronized BigChar getBigChar(char charName){
        BigChar bc = (BigChar) pool.get("" + charName);
        if (bc == null) {
            bc = new BigChar(charName);
            pool.put("" + charName,bc);
        }
        return bc;
    }
}
