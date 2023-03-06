package pers.decorator.practiceCode;


import java.util.ArrayList;
import java.util.List;

public class Splitter {

    public static List<String> split(String text, String delimiter) {
        List<String> tokens = new ArrayList<>();
        String[] words = text.split(delimiter); // 使用传入的分割符对文本进行分割
        for (String word : words) {
            // 将分割后的字符串去除首尾空格并添加到列表中
            tokens.add(word.trim());
        }
        // 如果文本以分割符结尾，则添加一个空字符串到列表中
        if (text.endsWith(delimiter)) {
            tokens.add("");
        }
        return tokens;
    }

    public static void main(String[] args) {
        String text = "a\u007F^b\u007F^\u007F^\u007F^d\u007F^";
        String delimiter = "\u007F^"; // 设置分割符为" ^"（注意：需要使用转义字符\来表示空格）
        List<String> tokens = split(text, delimiter);
        System.out.println(tokens);
    }
}