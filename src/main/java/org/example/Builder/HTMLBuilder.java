package org.example.Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
*   HTML 파일을 이용하여 문서를 만드는 클래스
*   Builder의 인터페이스를 구현하는 클래스
*   인스턴스 생성으로 호출되는 메소드 정의
*/
public class HTMLBuilder extends Builder {
    private String filename = "untitled.html";
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html>\n");
        sb.append("<head><title>");
        sb.append(title);
        sb.append("</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>");
        sb.append(title);
        sb.append("</h1>\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("<p>");
        sb.append(str);
        sb.append("</p>\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        sb.append("<ul>\n");
        for (String s: items) {
            sb.append("<li>");
            sb.append(s);
            sb.append("<li>\n");
        }
        sb.append("</ul>\n\n");
    }

    @Override
    public void close() {
        sb.append("</body>");
        sb.append("</html>\n");
        try {
            Writer writer = new FileWriter(filename);
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e)  {
            e.printStackTrace();
        }
    }

    public String getHTMLResult() {
        return filename;
    }
}
