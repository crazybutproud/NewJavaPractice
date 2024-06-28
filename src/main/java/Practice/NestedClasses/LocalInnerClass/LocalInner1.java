package Practice.NestedClasses.LocalInnerClass;

public class LocalInner1 { //редкая штука. не может быть static. область видимости - блок
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    public void getResult() {
        class Dividing {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe/delitel;
            }
            public int getOstatok() {
                return delimoe%delitel;
            }
        }

        Dividing dividing = new Dividing();
        dividing.setDelimoe(21);
        dividing.setDelitel(4);
        System.out.println(dividing.getDelimoe());
        System.out.println(dividing.getDelitel());
        System.out.println(dividing.getChastnoe());
        System.out.println(dividing.getOstatok());
    }
}
