package org.example.Abstract_Factory.factory;

/*
*   추상적인 공장을 나타내는 클래스(Link, Tray, Page)를 만듬
*   getFactory 안에서 일어나는 일
*   1. Class 클래스의 forName 메서드를 사용하여 해당 클래스를 동적으로 가져옴.
*   2. getDeclaredConstructor 메서드로 생성자를 얻어 newInstance 메서드로 인스턴스를 만듬.
*/
public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println(classname + " 클래스가 발견되지 않았습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
