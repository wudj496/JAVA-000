package demo.cl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author : Wu.D.J
 * @Create : 2020.10.20
 */
public class HelloClassLoader extends ClassLoader {

    public static void main(String[] args) {
        try {
            Object obj = new HelloClassLoader().loadClass("Hello").newInstance();
            Method method = obj.getClass().getMethod("hello");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Class<?> loadClass(String name) {
        String path = "/Users/wudj/Workspace/DJIN/JAVA-000/Week_01/src/main/java/demo/cl/Hello.xlass";
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get(new File(path).toURI()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (255 - bytes[i]);
        }
        return defineClass(name, bytes, 0, bytes.length);
    }
}
