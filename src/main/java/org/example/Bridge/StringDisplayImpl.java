package org.example.Bridge;

/*
*   구현의 클래스 계층으로 '문자열을 사용해서 표시' 클래스
*/
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i=0; i < width; i++){
            System.out.print("-");
        }

        System.out.println("+");
    }
}
