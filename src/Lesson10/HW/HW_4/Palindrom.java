package Lesson10.HW.HW_4;

public class Palindrom {
    public Palindrom() {
    }

    public void checkPalindrom (String word) {
        if (word.length()%2 != 0) {
            int counter = 0;
            for (int i = 0; i< word.length()/2; i++) {
                if (word.charAt(i) == word.charAt(word.length()-1-i)) {
                    counter++;
                }
            }
            if (counter == (int) word.length()/2) {
                System.out.println(word + ": Palindrom!");
            } else {
                System.out.println(word + ": Not palindrom!");
            }
        } else System.out.println(word + ": Not palindrom!");
    }
}
