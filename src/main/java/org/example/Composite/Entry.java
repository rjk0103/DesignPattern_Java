package org.example.Composite;

/*
*   File과 Directory를 동일시하는 추상 클래스
*   추상 클래스로서 디렉터리 엔트리를 표현
*   getName을 준비하고, 하위 클래스에 구현을 하는 형식
*/
public abstract class Entry {
    // 이름을 얻는다.
    public abstract String getName();

    // 크기를 얻는다.
    public abstract int getSize();

    // 목록을 표시한다.
    public void pirntList() {
        printList("");
    }

    // prefix를 앞에 붙여서 목록을 표시한다.
    protected abstract void printList(String prefix);

    // 문자열 표시
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
