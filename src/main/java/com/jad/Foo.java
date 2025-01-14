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
    }

    public List<Baz> getBazs() {
        return bazs;
    }

    public void addBaz(final Baz baz) {
        bazs.add(baz);
    }

    public Qux getQux() {
        return qux;
    }

    public List<Grault> getGraults() {
        return graults;
    }

    public void addGrault() {
        Grault grault= new Grault(this);
        graults.add(grault);
    }

    public Corge getCorge() {
        return corge
    }

    public void setCorge(final Corge firstCorge) {
        this.corge= firstCorge;
    }
}
