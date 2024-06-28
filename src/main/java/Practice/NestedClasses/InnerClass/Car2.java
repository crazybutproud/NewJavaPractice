package Practice.NestedClasses.InnerClass;

public class Car2 { //внешний класс

    String colour;
    int doorCount;
    Engine2 engine;

    public Car2(String colour, int doorCount, int horsePower) {
        this.colour = colour;
        this.doorCount = doorCount;
        //создается объект inner class(всегда завязан на внешнем классе)
        this.engine = this.new Engine2(horsePower); //присваиваем переменной новый текущий объект(двигатель)
    }

    @Override
    public String toString() {
        return "Car2{" +
                "colour='" + colour + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine2 { // static nested class(привязан к классу CAR)
        int horsePower;

        public Engine2(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine2{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car2 car2 = new Car2("red", 2, 300);
        System.out.println(car2);
    }
}
