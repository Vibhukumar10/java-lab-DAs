interface Newspaper{
    void news();
}

class Magazine implements Newspaper{
    String title;
    int ISBN;
    String editor;
    Magazine(String a, int b, String c){
        this.title = a;
        this.ISBN = b;
        this.editor = c;
    }
    public void news(){
        System.out.println("Title pf book = "+title);
        System.out.println("ISBN = "+ISBN);
        System.out.println("Editor of magazine = "+editor);
    }
}

class Brochure implements Newspaper{
    String title;
    int page_no;
    int year;
    Brochure(String a, int b, int c){
        this.title = a;
        this.page_no = b;
        this.year = c;
    }
    public void news(){
        System.out.println("Title of brochure ="+ title);
        System.out.println("Page no of brochure = "+page_no);
        System.out.println("Year of brochure = "+year);
    }
}

public class Q3{
    public static void main(String[] args) {
        Magazine ob1 = new Magazine("Vogue",25,"Vibhu kumar Singh");
        Brochure ob2 = new Brochure("Maxim",2019,7);
        System.out.println("In Magazine Class: ");
        ob1.news();
        System.out.println("\n");
        System.out.println("In Brochure Class: ");
        ob2.news();
    }
}