package org.example.Composite;

import java.util.ArrayList;
import java.util.List;

/*
*   디렉터리를 나타내는 클래스
*   Entry 클래스의 하위 클래스로 선언
*/
public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다.
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
