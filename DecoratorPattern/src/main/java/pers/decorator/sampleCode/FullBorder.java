package pers.decorator.sampleCode;

public class FullBorder extends Border{
    public FullBorder(Display display) {
        super(display);
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
        return 1 + display.getRows() + 1;
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
            return "+" + makeLine('-',display.getColumns()) + "+" ;
        } else if (row == display.getRows() + 1){
            return "+" + makeLine('-',display.getColumns()) + "+" ;
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch,int count){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            stringBuffer.append(ch);
        }
        return stringBuffer.toString();
    }
}
