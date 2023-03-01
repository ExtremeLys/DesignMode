package pers.mediator.sampleCode;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    /**
     * 保存 Mediator
     * @param mediator 中介者
     */
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 下达启用/禁用的指示
     * @param enabled true 启用 / false 禁用
     */
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
