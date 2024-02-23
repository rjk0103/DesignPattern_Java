package org.example.Abstract_Factory.listfactory;

import org.example.Abstract_Factory.factory.Tray;
import org.example.Abstract_Factory.factory.Item;

/*
*   구체적인 부품: Link나 Tray를 모은 클래스
*/
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption);
        sb.append("\n<ul>\n");
        for (Item item: tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
