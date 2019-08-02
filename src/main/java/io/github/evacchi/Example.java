package io.github.evacchi;

import io.github.evacchi.friend.Friend;

public class Example {

    public static void main(String[] args) {
        Value value = new Value();

        Friend friend = new Friend();
        System.out.println(value.getValue());
        friend.changeValue(value);
        System.out.println(value.getValue());
    }
}
