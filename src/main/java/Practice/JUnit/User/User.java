package Practice.JUnit.User;

import java.util.Map;

public class User {
    private int id;
    private String name;
    private int age;
    private String sex;
    private static Map<Integer, User> allUsers;
    private static int countId = 0;

    public User(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }
}
