package com.simplon;


import java.lang.*;

public class LowerUpperString {

    public static void main(String[] args) {
        String str = new String();
    }

    public static void changeCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (c > 64 && c < 91) {
                c = c + 32;
            } else if (c > 96 && c < 123) {
                c = c - 32;
            } else {
                c == 32;
            }
            System.out.println("");
        }
        return 0;
    }
}
