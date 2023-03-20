package Lesson10.HW.HW_1;

import java.util.StringJoiner;

public class DocumentNumber {


    public DocumentNumber() {
    }

    public static void getFirst2Blocks4Numbers(String document) {
        String[] partsOfNumber = document.split("-");
        int counterBlocks = 0;
        StringJoiner joiner = new StringJoiner(" ");
        for (String part : partsOfNumber) {
            if (part.length() == 4) {
                int counterNumbers = 0;
                for (int i = 0; i < 4; i++) {
                    if (Character.isDigit(part.charAt(i))) {
                        counterNumbers++;
                    }
                }
                if (counterNumbers == 4) {
                    joiner.add(part);
                    counterBlocks++;
                }
            }
            if (counterBlocks == 2) {
                break;
            }
        }
        System.out.println(joiner);
    }

    public static void replaceBlock3(String document) {
        String[] partsOfNumber = document.split("-");

        StringJoiner joiner = new StringJoiner("-");

        for (String part : partsOfNumber) {
            if (part.length() == 3) {
                String str = part.replace(part, "***");
                joiner.add(str);
            } else {
                joiner.add(part);
            }
        }
        System.out.println(joiner);
    }

    public static void getAllLettersLowerCase(String document) {
        StringBuilder chars = new StringBuilder();
        for (int i = 0; i < document.length(); i++) {
            if ((!Character.isDigit(document.charAt(i))) && (document.charAt(i) != '-')) {
                    chars.append(document.charAt(i));
                } else {
                if ((!chars.toString().endsWith("/")) && (chars.toString().length()>0)) {
                    chars.append("/");
                }
            }
        }
        System.out.println(chars.toString().toLowerCase());
    }

    public static void getAllLettersUpperCase(String document) {
        StringBuilder chars = new StringBuilder();
        for (int i = 0; i < document.length(); i++) {
            if ((!Character.isDigit(document.charAt(i))) && (document.charAt(i) != '-')) {
                chars.append(document.charAt(i));
            } else {
                if ((!chars.toString().endsWith("/")) && (chars.toString().length()>0)) {
                    chars.append("/");
                }
            }
        }
        System.out.println(chars.toString().toUpperCase());
    }

    public static void getABC (String document) {
        int counter = 0;
        for (int i=0; i<document.length()-3;i++) {
            if (document.substring(i,i+2).equalsIgnoreCase("abc")) {
                counter++;
            }
        }
        if (document.substring((document.length()-3)).equalsIgnoreCase("abc")) {
            counter++;
        }
        if (counter > 0) {
            System.out.println("ABC exist!");
        } else {
            System.out.println("No ABC!");
        }
    }

    public static void checkStart555 (String document) {
        if (document.startsWith("555")) {
            System.out.println("Document starts with 555!");
        } else {
            System.out.println("Document doesn't start with 555!");
        }
    }

    public static void checkFinish1a2b (String document) {
        if (document.endsWith("1a2b")) {
            System.out.println("Document ends with 1a2b!");
        } else {
            System.out.println("Document doesn't end with qa2b!");
        }
    }
}