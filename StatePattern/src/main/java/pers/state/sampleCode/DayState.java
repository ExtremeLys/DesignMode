package pers.state.sampleCode;

public class DayState implements State{

    private static DayState singleton = new DayState();

    /**
     * 构造函数的可见性为private
     */
    private DayState(){
    }

    /**
     * 获取唯一实例
     * @return
     */
    public static State getInstance() {
        return singleton;
    }

    /**
     * 设置时间
     *
     * @param context
     * @param hour    时间
     */
    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changState(NightState.getInstance());
        }
    }

    /**
     * 设置金库
     *
     * @param context
     */
    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库（白天）");
    }

    /**
     * 按下警铃
     *
     * @param context
     */
    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（白天）");
    }

    /**
     * 正常通话
     *
     * @param context
     */
    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话（白天）");
    }

    public String toString() {
        return "[白天]";
    }
}
