package org.example.Decorate;

/*
*   1행으로 구성된 문자열 표시용 클래스
*/
public class StringDisplay extends Display {
    private String string;  // 표시 문자열

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1;   // 행수는 1
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return string;
    }
}