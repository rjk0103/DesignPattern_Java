package org.example.Prototype.framework;

/*
*   Cloneable의 경우 인터페이스가 구현되지 않은경우 예외 처리를 해주어야 함
*   but, 그러나 인터페이스를 확장하여 구현하였으므로 예외 처리를 해주지 않아도 됨.*/
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
}
