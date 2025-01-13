package com.jad;

public class Corge {
    private Foo foo;
    public Corge(final Foo foo) {
        this.foo=foo;
    }

    public Foo getFoo() {
        return foo;
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setFoo(final Foo foo) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
