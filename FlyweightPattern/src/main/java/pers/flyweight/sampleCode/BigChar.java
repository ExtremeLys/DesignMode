package pers.flyweight.sampleCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    /**
     * 字符名字
     */
    private char charName ;

    /**
     * 大型字符对应的字符串（由'#' '.' '\n' 组成 ）
     */
    private String fontDate;

    /**
     * 构造函数
     * @param charName 字符名
     */
    public BigChar(char charName) {
        this.charName = charName;

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("FlyweightPattern/src/main/java/pers/flyweight/sampleCode/big" + charName + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontDate = buf.toString();
        } catch (IOException e) {
            this.fontDate = charName + "?";
        }
    }

    /**
     * 显示大型字符
     */
    public void print() {
        System.out.println(fontDate);
    }
}
