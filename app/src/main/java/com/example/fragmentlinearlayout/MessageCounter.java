package com.example.fragmentlinearlayout;

public final class MessageCounter {
    private MessageCounter() {}

    public static int countCharacters(String text) {
        return text == null ? 0 : text.length();
    }
}
