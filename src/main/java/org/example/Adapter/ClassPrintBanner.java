package org.example.Adapter;

/*
 *  인스턴스를 사용한 Adapter 패턴
 *  상속의 방법이 아닌 '위임'을 사용
 */
public class ClassPrintBanner extends ClassPrint {
    private Banner banner;

    public ClassPrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
