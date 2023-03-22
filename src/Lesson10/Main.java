package Lesson10;

import Lesson6.Car;

public class Main {
    public static void main(String[] args) {
        String str = "123";
        int asd = 0;
        String str1 = "456";
        String str2 = str.concat(str1);
        System.out.println(str2);

        String str3 = String.valueOf(asd);

        String str4 = String.join("/", str1,str2);

        str1.getChars(0,1, str2.toCharArray(),2);

        StringBuilder sb = new StringBuilder("123456");
        System.out.println(sb.charAt(2));


    }
}
