package pers.decorator.sampleCode;

public class StringDisplay extends Display{
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    /**
     * 获取横向字符数
     *
     * @return 字符数量
     */
    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    /**
     * 获取纵向行数
     *
     * @return 行数
     */
    @Override
    public int getRows() {
        return 1;
    }

    /**
     * 获取第row行的字符串
     *
     * @param row
     * @return 字符串
     */
    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        }else {
            return null;
        }
    }
}
