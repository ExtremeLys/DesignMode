package pers.decorator.sampleCode;

public class SideBorder extends Border {
    /**
     *
     */
    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    /**
     * 获取横向字符数
     *
     * @return 字符数量
     */
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    /**
     * 获取纵向行数
     *
     * @return 行数
     */
    @Override
    public int getRows() {
        return display.getRows();
    }

    /**
     * 获取第row行的字符串
     *
     * @param row
     * @return 字符串
     */
    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
