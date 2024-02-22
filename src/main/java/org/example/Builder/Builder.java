package org.example.Builder;

/*
*   문서를 구성하기 위한 메소드를 규정한 추상 클래스
*   인스턴스를 생성하기 위한 인터페이스 결정 역할
*   인스턴스의 각 부분을 만드는 메소드 준의
*/
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
