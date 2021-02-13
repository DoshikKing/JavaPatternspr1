package com.company;

import java.util.function.Consumer;

public class Cons implements Consumer {
    public void accept(Object o) {
        String o_string = o.toString();
        StringBuilder newString = new StringBuilder(o_string);
        for (int i = 0; i < o_string.length(); i= i + 2)
        {
            char b = o_string.charAt(i);
            newString.setCharAt(i, b = Character.toUpperCase(b));
        }
        System.out.println(newString);
    }
}
