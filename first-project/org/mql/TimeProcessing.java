package org.mql;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class TimeProcessing {
    public static void process(Object obj) {
        // reflextion = introspectio
        Method methods[] = obj.getClass().getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(" - " + m.getName());
            try {
                Instant i1 = Instant.now();
                m.invoke(obj);
                Instant i2 = Instant.now();
                long between =  Duration.between(i1, i2).toMillis();
                System.out.println("Method " + m.getName() +  " Execution time  " + between + " ms");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
