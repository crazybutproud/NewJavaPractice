package Practice.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();

        People p1 = new People(123, "Anna", "Hanna", 50_000);
        People p2 = new People(22, "Licha", "Chicha", 150_000);
        People p3 = new People(36, "Vladimir", "Lot", 10_000);
        People p4 = new People(47, "Anna", "Chapman", 44_000);
        People p5 = new People(59, "Viktor", "Vinnikov", 1_000);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        System.out.println("Перед сортировкой: ");
        System.out.println(list);

        //сортировка произойдет с помощью метода compareTo
        System.out.println("После сортировки: ");
        Collections.sort(list);
        System.out.println(list);

    }
}


class People implements Comparable<People> { //интерфейс использует естественный порядок
    int id;
    String name;
    String surname;
    int salary;

    public People(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(People anotherP) { //метод для сравнени

        if (this.id == anotherP.id) {
            return 0;
        } else if (this.id < anotherP.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
