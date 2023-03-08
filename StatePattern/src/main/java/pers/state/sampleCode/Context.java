package pers.state.sampleCode;

public interface Context {
    public abstract void setClock(int hour);
    public abstract void changState(State state);
    public abstract void callSecurityCenter(String msg);
    public abstract void recordLog(String msg);
}
