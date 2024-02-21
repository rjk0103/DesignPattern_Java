package org.example.Prototype;
import org.example.Prototype.framework.Product;

/*
*   decochar - 문자열을 장식처럼 에워싸는 문자
*   createCopy - 자기 자신을 복제하는 메소드
*   Cloneable의 경우 인터페이스를 구현하지 않은 경우 예외가 발생할수 있음 때문에 ClonenoeException을 사용하여 처리 해주어야 함
*/
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
