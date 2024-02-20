package org.example.Singleton;

/*
*   인스턴스를 제한하는 이유 -> 인스턴스가 여러개 존재시 서로에게 영향을 미쳐 버그를 만들어 낼 확률이 있기 때문에
*   만약, 하나만 존재하게 된다면 이라는 전제조건을 갖고 프로그래밍을 할 수 있기에 오류를 덜 범할수 있다.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("obj1과 obj2는 같은 인스턴스가 아닙니다.");
        }
        System.out.println("End.");
    }
}
