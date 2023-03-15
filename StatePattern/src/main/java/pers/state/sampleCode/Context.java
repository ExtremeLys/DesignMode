package pers.state.sampleCode;

public interface Context {
    /**
     * 设置时间
     * @param hour 时间
     */
    public abstract void setClock(int hour);

    /**
     * 改变状态
     * @param state 状态
     */
    public abstract void changState(State state);

    /**
     * 联系报警中心
     * @param msg 消息
     */
    public abstract void callSecurityCenter(String msg);

    /**
     * 在报警中心留下记录
     * @param msg 消息记录
     */
    public abstract void recordLog(String msg);
}
