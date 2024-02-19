package org.example.FactoryMethod.idcard;

import org.example.FactoryMethod.framework.Product;

// IDCard의 인식번호를 나타내는 클래스
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
