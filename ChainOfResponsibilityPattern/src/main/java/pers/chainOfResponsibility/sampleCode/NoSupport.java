package pers.chainOfResponsibility.sampleCode;

public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    /**
     * 解决问题的方法
     * 自己什么也不处理
     * @param trouble 问题
     * @return true 解决  false 未解决
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
