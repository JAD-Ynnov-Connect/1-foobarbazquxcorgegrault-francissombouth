package com.jad;

import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corage corge;
    private List<Grault> graults;

    public Foo(final Bar bar) {
        this.bar=bar;
        this.bazs= new ArrayList<>();
        this.graults=new ArrayList<>()
    }

    public Bar getBar() {
        return bar;
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Baz> getBazs() {
        return bazs;
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void addBaz(final Baz baz) {
        bazs.add(baz);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Qux getQux() {
        return qux;
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Grault> getGraults() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void addGrault() {
        Grault grault= new Grault(this);
        graults.add(grault);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Corge getCorge() {
        return corge
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setCorge(final Corge firstCorge) {
        this.corge= firstCorge;
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
