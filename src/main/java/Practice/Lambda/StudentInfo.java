package Practice.Lambda;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {

    }

    void printStudentOverGrade(ArrayList<Student> arrayList, double grade) {
        for (Student s : arrayList) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> arrayList, int age) {
        for (Student s : arrayList) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> arrayList, double grade, int age, char sex) {
        for (Student s : arrayList) {
            if (s.avgGrade < grade && s.age < age && s.sex == sex) {
                System.out.println(s);
            }
        }
    }

}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 1, 4.23);
        Student st2 = new Student("Anna", 'f', 25, 5, 5.00);
        Student st3 = new Student("Alex", 'm', 19, 1, 4.78);
        Student st4 = new Student("Hanna", 'f', 18, 2, 3.76);
        Student st5 = new Student("Masha", 'f', 20, 3, 2.54);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);

        StudentInfo studentInfo = new StudentInfo();
        System.out.println("/////////////////////");
        studentInfo.printStudentOverGrade(studentArrayList, 3.00);
        System.out.println("/////////////////////");
        studentInfo.printStudentUnderAge(studentArrayList, 20);
        System.out.println("/////////////////////");
        studentInfo.printStudentsMixCondition(studentArrayList, 3.00, 20, 'f');
    }
}
