package Practice.NestedClasses.AnonymousInnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }; //это все одно выражение
        System.out.println(math.doOperation(3,6));

        Math math2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a-b;
            }
        }; //это все одно выражение
        System.out.println(math2.doOperation(32,61));

    }

}

interface Math {
    int doOperation(int a, int b);
}
