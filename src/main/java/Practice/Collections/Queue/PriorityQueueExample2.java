package Practice.Collections.Queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        Student st1 = new Student("Anna",4);
        Student st2 = new Student("Alex",3);
        Student st3 = new Student("Mouse",2);
        Student st4 = new Student("Anna",1);
        Student st5 = new Student("Lichi",4);

        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>();
        studentPriorityQueue.add(st1);
        studentPriorityQueue.add(st2);
        studentPriorityQueue.add(st3);
        studentPriorityQueue.add(st4);
        studentPriorityQueue.add(st5);

        System.out.println(studentPriorityQueue);

        System.out.println(studentPriorityQueue.poll());
        System.out.println(studentPriorityQueue);

    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }
}
