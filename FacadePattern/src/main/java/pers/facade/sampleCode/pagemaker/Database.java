package pers.facade.sampleCode.pagemaker;

import java.io.FileInputStream;
import java.util.Properties;

public class Database {
    // 防止外部new出Database的实例，所以声明为private
    private Database() {
    }

    /**
     * 根据数据库名获取 Properties
     * @param dbname 数据库名称
     * @return
     */
    public static Properties getProperties(String dbname) { // 根据数据库名获取 Properties
        String filename = "FacadePattern/src/main/java/pers/facade/sampleCode/" + dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (Exception e) {
            System.out.println("提示：" + filename + "不存在");
        }
        return prop;
    }
}
