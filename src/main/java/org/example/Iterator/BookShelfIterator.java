package org.example.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
*   Iterator<Book>인터페이스를 구현하고 있으므로, Iterator<Book>형으로 다룰 수 있음.
*   bookShelf 필드는 BookShelfIterator가 검색할 책장
*   index 필드는 현재 보고 있고, 보고 있는 책을 가리키는 첨자.
*/

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /*
        Iterator<Book> 인터페이스에서 선언된 메소드를 구현한 것
        다음 책이 있으면 true, 없으면 false
    */
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    /*
        현재 주목하고 있는 책을 반환
        '다음'으로 진행시키는 메서드
        1. 반환값으로 돌려줄 book 값을 저장하고
        2. index를 다음으로 진행시킨 후 book을 return 한다.
    */
    @Override
    public Book next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
