package Practice.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {
        List<PeopleС> list = new ArrayList<>();

        PeopleС p1 = new PeopleС(123, "Anna", "Hanna", 50_000);
        PeopleС p2 = new PeopleС(22, "Licha", "Chicha", 150_000);
        PeopleС p3 = new PeopleС(36, "Vladimir", "Lot", 10_000);
        PeopleС p4 = new PeopleС(47, "Anna", "Chapman", 44_000);
        PeopleС p5 = new PeopleС(59, "Viktor", "Vinnikov", 1_000);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        System.out.println("Перед сортировкой: ");
        System.out.println(list);

        //сортировка произойдет с помощью метода compareTo
        System.out.println("После сортировки: ");
        Collections.sort(list, new NameComparator2());  //сортируем, используя компаратор
        System.out.println(list);

    }
}


class PeopleС implements Comparable<PeopleС> { //используем такой вариант,
    // когда подразумеваем способ естественной сортировки(обычный,стандартный)
    // можно не использовать второй параметр в методе sort
    int id;
    String name;
    String surname;
    int salary;

    public PeopleС(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "People{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(PeopleС o) {
        if (this.id == o.id) { // метод equals тоже должен возвращать true
            return 0;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 1;
        }
    }
}


class NameComparator2 implements Comparator<PeopleС> {

    @Override
    public int compare(PeopleС people1, PeopleС people2) {
        return people1.name.compareTo(people2.name);
    }
}
class SalaryComparator2 implements Comparator<PeopleС> {

    @Override
    public int compare(PeopleС people1, PeopleС people2) {
        return people1.salary-people2.salary;
    }
}
