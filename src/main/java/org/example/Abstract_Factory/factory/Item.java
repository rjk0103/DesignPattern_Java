package org.example.Abstract_Factory.factory;

/*
*   Link와 Tray를 통일적으로 다루기 위한 클래스
*   caption은 표 제어 역할
*/
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
