package org.example.Abstract_Factory.listfactory;

import org.example.Abstract_Factory.factory.Factory;
import org.example.Abstract_Factory.factory.Link;
import org.example.Abstract_Factory.factory.Page;
import org.example.Abstract_Factory.factory.Tray;
/*
* 구체적인 공장을 나타내는 클래스(ListLink, ListTray, ListPage를 만든다)
*/
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
