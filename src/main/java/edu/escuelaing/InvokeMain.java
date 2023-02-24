package edu.escuelaing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class InvokeMain {
    public static void main(String... args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> c = Class.forName(args[0]);
            Class[] argTypes = new Class[] { String[].class, int.class };
            Method main = c.getDeclaredMethod("getev", argTypes);
            String[] mainArgs = Arrays.copyOfRange(args, 1, args.length);
            System.out.format("invoking %s.main()%n", c.getName());
            main.invoke(null, (Object) mainArgs, 1);

        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (NoSuchMethodException x) {
            x.printStackTrace();
        }
    }
}