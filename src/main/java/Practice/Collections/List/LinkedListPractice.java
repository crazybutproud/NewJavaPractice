package Practice.Collections.List;

import java.util.LinkedList;

public class LinkedListPractice { //хорош при частом использовании метода add/remove
    public static void main(String[] args) {
        Student st1 = new Student("Anna", 1);
        Student st2 = new Student("Lichi", 4);
        Student st3 = new Student("Chicha", 3);
        Student st4 = new Student("Mis", 3);
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        System.out.println("LinkedList = " + studentLinkedList);

        Student st5 = new Student("Hammu", 2);
        Student st6 = new Student("Bakar", 1);
        Student st7 = new Student("Kasip", 1);
        studentLinkedList.add(st5);
        studentLinkedList.add(3, st6);
        studentLinkedList.add(st7);
        System.out.println("LinkedList = " + studentLinkedList);
        studentLinkedList.remove(3); //объект не пропадает из памяти. просто перестает быть частью связной цепочки


    }

}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
