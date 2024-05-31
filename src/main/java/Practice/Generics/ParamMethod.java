package Practice.Generics;

import java.util.ArrayList;

public class ParamMethod {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(154);
        integerArrayList.add(251);
        integerArrayList.add(7891);
        int a = GenMethod.getSecondElement(integerArrayList);
        System.out.println(a);

    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> a1) {
        return a1.get(1);
    }
}
