package org.example.Abstract_Factory.factory;

import java.util.ArrayList;
import java.util.List;

/*
*   추상적인 부품: Link나 Tray를 모은 클래스
*   add메서드에서 Link와 Tray의 상위 클래스인 Item을 인수로 받음.
*/
public abstract class Tray extends Item {
    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
