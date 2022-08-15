package pers.adapter.sampleCode.sample01;

import pers.adapter.sampleCode.Banner;

/**
 * @author LiYongSheng
 * Adapter 适配
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }


    /**
     * 打印弱化字符串
     */
    @Override
    public void printWeak() {
        showWithParen();
    }

    /**
     * 打印强化字符串
     */
    @Override
    public void printStrong() {
        showWithAster();
    }
}
