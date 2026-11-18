package org.mql;

public class StringTests {
     private int  count;

     public StringTests(int count) {
        this.count = count;
     }

     public String testString(){
        String s = "";
        for (int i = 0; i < count; i++) {
            s += "a";
        }
        return s;
     }

    public String testStringBuilder(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append("a");
        }
        return s.toString();
     } 

     public String testStringBuffer(){
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < count; i++) {
            s.append("a");
        }
        return s.toString();
     } 


}
