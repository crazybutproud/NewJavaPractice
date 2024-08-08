package Practice.JUnit.User;

import java.util.*;

public class User {
    private int id;
    private String name;
    private int age;
    private Sex sex;
    private static Map<Integer, User> allUsers = new HashMap<>();
    private static int countId = 0;

    public User(String name, int age, Sex sex) {
        if (name != null && !name.isEmpty() && age > 0 && sex != null) {
            this.name = name;
            this.age = age;
            this.sex = sex;

            if (!hasUser()) {
                countId++;
                this.id = countId;
                allUsers.put(id, this);
            }
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    private boolean hasUser() {
        for (User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static List<User> getAllUsers() { // Формировать список всех пользователей
        return new ArrayList<>(allUsers.values());
    }

    public static List<User> getAllUsers(Sex sex) { // Формировать список пользователей по полу(MALE/FEMALE).
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()) {
            if (user.sex == sex) {
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }

    public static int getHowManyUsers() { // Возвращать количество пользователей в общем списке
        return allUsers.size();
    }

    public static int getHowManyUsers(Sex sex) { // Посчитать количество по признаку пола пользователя.
        return getAllUsers(sex).size();
    }

    public static int getAllAgeUsers() { // Посчитать общую сумму по возрасту пользователей, так же учесть по признаку пола
        int countAge = 0;
        for (User user : allUsers.values()) {
            countAge += user.age;
        }
        return countAge;
    }

    public static int getAllAgeUsers(Sex sex) { // Возраст пользователей по запрашиваемому полу

        int countAge = 0;
        for (User user : getAllUsers(sex)) {
            countAge += user.age;
        }
        return countAge;
    }

    public static int getAverageAgeOfAllUsers() { // Посчитать средний возраст
        return getAllAgeUsers() / getHowManyUsers();
    }

    public static int getAverageAgeOfAllUsers(Sex sex) { // Посчитать средний возраст по признаку пола
        return getAllAgeUsers(sex) / getHowManyUsers(sex);
    }
    public static void newUser() {

    }

}
