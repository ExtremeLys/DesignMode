package pers.Strategy.sampleCode;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
