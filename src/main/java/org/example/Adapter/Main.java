package org.example.Adapter;

public class Main {
    public static void main(String[] args) {
        // 상속을 사용한 패턴(클래스)
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        // 위임을 사용한 패턴(인스턴스)
        ClassPrint cp = new ClassPrintBanner("Hello");
        cp.printWeak();
        cp.printStrong();
    }
}
