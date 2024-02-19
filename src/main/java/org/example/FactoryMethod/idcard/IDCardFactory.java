package org.example.FactoryMethod.idcard;

import org.example.FactoryMethod.framework.Product;
import org.example.FactoryMethod.framework.Factory;

// createProduct와 registerProduct 메소드 구현
public class IDCardFactory extends Factory {

    // 제품 만들기
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    // 제품 등록
    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
