package org.example.Iterator;

/*
    Book 즉, 책을 나타내는 클래스
    책 이름을 getName메소드로 얻는 역할을 함
    책 이름은 생성자에서 인스턴스를 초기화할 때 인수로 지정.
*/
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
