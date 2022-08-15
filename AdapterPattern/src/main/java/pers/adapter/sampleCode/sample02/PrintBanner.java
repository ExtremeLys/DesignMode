package pers.adapter.sampleCode.sample02;

import pers.adapter.sampleCode.Banner;

/**
 * @author LiYongSheng
 * Adapter 适配
 */
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }


    /**
     * 打印弱化字符串
     */
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    /**
     * 打印强化字符串
     */
    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
