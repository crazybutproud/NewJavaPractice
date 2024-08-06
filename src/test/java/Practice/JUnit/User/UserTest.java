package Practice.JUnit.User;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest extends TestCase {

    @Test
    public void testGetAllUsers() {
        //создаем тестовые данные
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        //создаем список expected и заполняем его данными нашего метода
        List<User> expected = User.getAllUsers();

        //создаем список actual в него помещаем данные для сравнения
        //то что мы предполагаем метод должен вернуть
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_NO_NULL() {
        //добавим проверку на null
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }

    public void testTestGetAllUsers_MALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAllUsers_MALE_NO_NULL() {
        //добавим проверку на null
        List<User> expected = User.getAllUsers(Sex.MALE);
        Assert.assertNotNull(expected);
    }

    public void testTestGetAllUsers_FEMALE() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        List<User> expected = User.getAllUsers(Sex.FEMALE);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAllUsers_FEMALE_NO_NULL() {
        //добавим проверку на null
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void testGetHowManyUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        int expected = User.getHowManyUsers();

        int actual = 3;

        Assert.assertEquals(expected,actual);
    }

    public void testTestGetHowManyUsers() {
    }

    public void testGetAllAgeUsers() {
    }

    public void testTestGetAllAgeUsers() {
    }

    public void testGetAverageAgeOfAllUsers() {
    }

    public void testTestGetAverageAgeOfAllUsers() {
    }
}