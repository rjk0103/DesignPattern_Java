package org.example.Prototype;

import org.example.Prototype.framework.Manager;
import org.example.Prototype.framework.Product;

/*
*   prototype - 인스턴스를 복사하여 새로운 인스턴스 만들기 위한 메소드 결정 -> Product
*   ConcreatePrototype - 인스턴스를 복사하여 새로운 인스턴스를 만드는 메소드 구현 -> MessageBox
*   Client - 인스턴스를 복사하는 메소드를 이용해 새로운 인스턴스 만듬. -> Manager*/
public class Main {
    public static void main(String[] args) {
        // 준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        // 등록
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 생성과 사용
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }
}
