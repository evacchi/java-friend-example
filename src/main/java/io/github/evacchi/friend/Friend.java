package io.github.evacchi.friend;

import io.github.evacchi.Privileged;
import io.github.evacchi.Value;

public class Friend implements Privileged {

    public void changeValue(Value value) {
        value.acquire(this).setValue(100);
    }
}
