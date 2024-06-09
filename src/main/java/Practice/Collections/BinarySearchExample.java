package Practice.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        //простой пример
//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        integerArrayList.add(0);
//        integerArrayList.add(-1);
//        integerArrayList.add(134);
//        integerArrayList.add(23);
//        integerArrayList.add(-78);
//        integerArrayList.add(22);
//        integerArrayList.add(1432);
//        integerArrayList.add(-734);
//        integerArrayList.add(585);
//        Collections.sort(integerArrayList); //после сортировки можно использовать бинарный поиск
//        int index1 = Collections.binarySearch(integerArrayList,-78); //если выдается отрицательное значение,то искомый элемент не найден
//        System.out.println(index1); // вывод позиции искомого числа

//        //пример с сортировкой по полям класса
//        Employee employee1 = new Employee(1, "Anna", 14500);
//        Employee employee2 = new Employee(59, "Hanna", 500);
//        Employee employee3 = new Employee(34, "Mark", 3300);
//        Employee employee4 = new Employee(12, "Alex", 61202);
//        Employee employee5 = new Employee(1, "Mush", 17234);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList.add(employee3);
//        employeeList.add(employee4);
//        employeeList.add(employee5);
//        System.out.println(employeeList);
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//
//        int index2 = Collections.binarySearch(employeeList, new Employee(34, "Mark", 3300));
//        System.out.println(index2);

        //пример с бинарной версткой массива
        int[] array = {-3, 78, 234, 827, -284, 0, 12, 87, 34, 99, 294, 10, 8};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 0);
        System.out.println(index3);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        int result = this.id - anotherEmployee.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmployee.name);
        }
        return result;
    }
}
