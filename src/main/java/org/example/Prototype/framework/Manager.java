package org.example.Prototype.framework;

import java.util.HashMap;
import java.util.Map;

/*
*   코드안에 클래스 이름을 기술하면 그 클래스와 밀접한 관계가 생김 -> 개별 클래스 이름 언급x, 인터페이스 이름만 사용
*   Product 인터페이스만이 Manager 클래스와 다른 클래스를 연결하는 다리 역할을 함.
*/
public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        return p.createCopy();
    }
}
