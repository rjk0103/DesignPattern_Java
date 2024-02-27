package org.example.Bridge;

/*
*   기능의 클래스 계층으로 '지정 횟수만큼 표시' 기능 추가 클래스
*/
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
