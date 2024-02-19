package org.example.FactoryMethod.framework;

public abstract class Factory {

    // Product 인스턴스를 생성하는 것
    // 인스턴스를 생성하는 메소드를 호출함으로 클래스 이름에 의한 속박에서 헤딩 클래스를 자유롭게 할수 있음.
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 제품을 만드는 추상 메서드
    protected abstract Product createProduct(String number);

    // 만든 제품을 등록하는 추상 메서드
    protected abstract void registerProduct(Product product);
}
