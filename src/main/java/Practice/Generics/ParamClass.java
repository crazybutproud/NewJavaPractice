package Practice.Generics;

public class ParamClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet"); //прописываем необходимый тип,который подставляется в класс
        System.out.println(info1);
        String v1 = info1.getValue();
        System.out.println(v1);
        Info<Integer> info2 = new Info<>(20); //прописываем необходимый тип,который подставляется в класс
        System.out.println(info2);
        Integer v2  = info2.getValue();
        System.out.println(v2);
    }
}

class Info<T> {
    private T value;
    public Info(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return
                "( ( (" + value +
                        ") ) )";
    }

    public T getValue() {
        return value;
    }
}