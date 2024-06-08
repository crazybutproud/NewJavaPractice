package Practice.Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        //проверка на палиндром(не очень эффективный вариант)
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for ( char ch: s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> listIterator = list.listIterator(); // начинает с начала
        ListIterator<Character> reverseListIterator = list.listIterator(list.size()); // начинает с конца
        boolean isPalindrom = true;
        while (listIterator.hasNext() && reverseListIterator.hasPrevious()) {
            if (listIterator.next() != reverseListIterator.previous()) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
