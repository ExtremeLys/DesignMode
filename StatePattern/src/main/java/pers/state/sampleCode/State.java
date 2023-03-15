package pers.state.sampleCode;

public interface State {
    /**
     * 设置时间
     * @param context
     * @param hour 时间
     */
    public abstract void doClock(Context context,int hour);

    /**
     * 设置金库
     * @param context
     */
    public abstract void doUse(Context context);

    /**
     * 按下警铃
     * @param context
     */
    public abstract void doAlarm(Context context);

    /**
     * 正常通话
     * @param context
     */
    public abstract void doPhone(Context context);
}
