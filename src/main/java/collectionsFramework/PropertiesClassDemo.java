package collectionsFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {


        Properties properties = new Properties();
        FileInputStream fs = new FileInputStream("M:\\QA\\Automation\\Java\\src\\main\\java\\collectionsFramework\\config.properties");
        properties.load(fs);
        properties.setProperty("username","mifras");
        String s = properties.getProperty("username");
        System.out.println(s);

        FileOutputStream fileOutputStream = new FileOutputStream("M:\\QA\\Automation\\Java\\src\\main\\java\\collectionsFramework\\config.properties");
        properties.store(fileOutputStream,"ok");




    }
}
