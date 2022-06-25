package activities;

abstract class Book{

    String s;

    abstract void setTitle(String s);

    public String getTitle(){

        return s;
    }
}

class MyBook extends Book {

    public void setTitle(String title) {

        s=title;
        System.out.println("Title is set to:" + title);
    }

}
public class Activity5{
    public static void main(String[] args) {

       MyBook obj = new MyBook();
       obj.setTitle("Harry Potter");
       String finalTitle=obj.getTitle();

       System.out.println("Retrieving title:"+finalTitle);
    }
}
