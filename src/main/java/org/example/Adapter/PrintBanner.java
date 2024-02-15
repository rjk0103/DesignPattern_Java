package org.example.Adapter;

/*
 *   어댑터 역할을 하는 printBanner 클래스
 *   Banner 클래스를 확장하여 showWithParen 메소드와 showWithAster 메소드 상속
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
