package pers.adapter.sampleCode;

/**
 * @author LiYongSheng
 * Adaptee 被适配
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    /**
     * 显示用括号
     */
    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    /**
     * 显示用星号
     */
    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
