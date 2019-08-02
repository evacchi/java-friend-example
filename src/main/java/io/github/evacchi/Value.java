package io.github.evacchi;

public class Value {

    private int value = 0;

    public int getValue() {
        return value;
    }

    public Internal acquire(Privileged self) {
        return internal;
    }

    private Internal internal = new Internal();

    public class Internal {
        private Internal() {}
        public void setValue(int value) {
            Value.this.value = value;
        }
    }




}
