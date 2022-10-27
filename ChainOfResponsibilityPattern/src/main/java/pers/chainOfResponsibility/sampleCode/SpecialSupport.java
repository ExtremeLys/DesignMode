package pers.chainOfResponsibility.sampleCode;

public class SpecialSupport extends Support{
    /**
     * 只能解决指定编号的问题
     */
    private int numble;

    public SpecialSupport(String name, int numble) {
        super(name);
        this.numble = numble;
    }

    /**
     * 解决问题的方法
     *
     * @param trouble 问题
     * @return true 解决  false 未解决
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == numble){
            return true;
        }else {
            return false;
        }
    }
}
