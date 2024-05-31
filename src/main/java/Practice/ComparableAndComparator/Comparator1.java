package Practice.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
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
        Collections.sort(list, new NameComparator());  //сортируем, используя компаратор
        System.out.println(list);

    }
}


class People { //интерфейс использует естественный порядок
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
        return "People{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", salary=" + salary + '}';
    }

}

class IdComparator implements Comparator<People> {

    @Override
    public int compare(People people1, People people2) { //отличие в том, что нет текущего работника. сравниваются просто два работника
        if (people1.id == people2.id) {
            return 0;
        } else if (people1.id < people2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<People> {

    @Override
    public int compare(People people1, People people2) {
        return people1.name.compareTo(people2.name);
    }
}
class SalaryComparator implements Comparator<People> {

    @Override
    public int compare(People people1, People people2) {
        return people1.salary-people2.salary;
    }
}
