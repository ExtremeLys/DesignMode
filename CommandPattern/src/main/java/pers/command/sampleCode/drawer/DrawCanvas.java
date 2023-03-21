package pers.command.sampleCode.drawer;

import pers.command.sampleCode.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    /**
     * 颜色
     */
    private Color color = Color.red;

    /**
     * 要绘制的原点半径
     */
    private int radius = 6;

    /**
     * 命令的历史记录
     */
    private MacroCommand history;

    /**
     * 构造函数
     */
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    /**
     * 重新全部绘制
     * @param g
     */
    public void paint(Graphics g) {
        history.execute();
    }

    /**
     * 绘制
     * @param x x
     * @param y y
     */
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
