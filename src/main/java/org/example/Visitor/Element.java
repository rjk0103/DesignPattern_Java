package org.example.Visitor;

public interface Element {
    public abstract void accept(Visitor v);
}
