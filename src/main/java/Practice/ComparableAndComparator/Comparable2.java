package Practice.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee employee1 = new Employee(123, "Anna", "Hanna", 50_000);
        Employee employee2 = new Employee(22, "Licha", "Chicha", 150_000);
        Employee employee3 = new Employee(36, "Vladimir", "Lot", 10_000);
        Employee employee4 = new Employee(47, "Anna", "Chapman", 44_000);
        Employee employee5 = new Employee(59, "Viktor", "Vinnikov", 1_000);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        System.out.println("Перед сортировкой: ");
        System.out.println(list);

        //сортировка произойдет с помощью метода compareTo
        System.out.println("После сортировки: ");
        Collections.sort(list);
        System.out.println(list);

    }
}


class Employee implements Comparable<Employee> { //интерфейс использует естественный порядок
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) { //метод для сравнения
        //первый вариант
        //по id

//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }
        //второй вариант

//        return this.id-anotherEmp.id;

        //третий вариант
        //возможность использовать метод compareTo класса обертки, если сделать переменную Integer(!!!),а не int

//        return this.id.compareTo(anotherEmp.id);
        //возможно заменить в таком варианте Integer на String, и сравнивать по строкам

        //Четвертый вариант
        //проверка по имени. Если имя одинаковое, проверка по фамилии

        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}