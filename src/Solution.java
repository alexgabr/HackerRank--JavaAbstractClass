//
//Copyright Alexandru Vrincianu
//2023
//

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.nextLine();
        MyBook book = new MyBook();

        book.setTitle(s);
        System.out.println(book);

        a.close();
    }
}

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }

    @Override
    public String toString() {
        return "The title is: " + getTitle();
    }
}