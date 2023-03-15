package pers.state.sampleCode;

public class NightState implements State{

    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance(){
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
        if (9 <= hour && hour < 17) {
            context.changState(DayState.getInstance());
        }
    }

    /**
     * 设置金库
     *
     * @param context
     */
    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急：晚上使用金库！ ");
    }

    /**
     * 按下警铃
     *
     * @param context
     */
    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    /**
     * 正常通话
     *
     * @param context
     */
    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话记录");
    }

    public String toString(){
        return "[晚上]";
    }
}
