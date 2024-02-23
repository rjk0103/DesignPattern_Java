package org.example.Abstract_Factory.listfactory;

import org.example.Abstract_Factory.factory.Link;

/*
*   구체적인 부품: HTML 링크를 나타내틑 클래스
*/
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
