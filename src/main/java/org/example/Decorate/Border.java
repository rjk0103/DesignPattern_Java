package org.example.Decorate;

/*
*   '장식틀'을 나타내는 추상 클래스
*/
public abstract class Border extends Display {
    protected Display display;      // 이 장식들이 감싸는 '내용물'

    // 인스턴스 생성시 '내용물'을 인수로 지정
    protected Border(Display display) {
        this.display = display;
    }
}
