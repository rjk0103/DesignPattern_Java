package org.example.Singleton;

/*
*   인스턴스를 하나만 만들 수 있음
*   초기화는 로드할 때만 한번 실행됨
*   생성자가 private로 설정한 이유 -> 외부에서 생성자 호출을 금지 하기 위함.
*   개발자가 new 하지만 않으면 private로 설정하지 않아도 되지만 조금더 안전하고 견고하게 하기 위해서 생성자에 private를 설정함.
*   */
public class Singleton {

    // 2. static 필드가 초기화되며 유일한 인스턴스 만들어짐.
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    // 1. getInstance메서드 호출할 때 Singleton클래스 초기화
    public static Singleton getInstance() {
        return singleton;
    }
}
