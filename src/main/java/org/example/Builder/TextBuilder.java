package org.example.Builder;

/*
*   텍스트를 이용하여 문서를 만드는 클래스
*   Builder의 인터페이스를 구현하는 클래스
*   인스턴스 생성으로 호출되는 메서드 정의
*/
public class TextBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("===============================\n");
        sb.append("[");
        sb.append(title);
        sb.append("]\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("@");
        sb.append(str);
        sb.append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String s: items) {
            sb.append(" .");
            sb.append(s);
            sb.append("\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("================================\n");
    }

    public String getTextResult() {
        return sb.toString();
    }
}
