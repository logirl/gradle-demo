package cc.logirl.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by xinxi on 2017/5/18.
 */
public class TestIt {
    public static void main(String[] args) throws Exception {
        Abc i = new Abc();
        Constructor constructor = Abc.class.getConstructor(null);
        int modifiers = constructor.getModifiers();
        System.out.println(Modifier.isPublic(modifiers));

        Field modifiersField = Constructor.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(constructor, modifiers & ~Modifier.PUBLIC); // 去除public
        modifiers = constructor.getModifiers();
        modifiersField.setInt(constructor, modifiers | Modifier.PRIVATE); // 增加private

        System.out.println(Modifier.isPublic(constructor.getModifiers()));
        System.out.println(Modifier.isPrivate(constructor.getModifiers()));

    }
}
class Abc {
    public Abc() {
        System.out.println("6666666666666666666666666666");
    }
}
