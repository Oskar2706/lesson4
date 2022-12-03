public class vehicle {
    String tape;
    String model;
    String color;
    double price;

    vehicle(){

    }
    vehicle(String tape, String model, String color, double price){
        this.tape=tape;
        this.color=color;
        this.model=model;
        this.price=price;
    }

    public static void main(String[] args) {
        vehicle car = new vehicle();
        System.out.println(car);

    }
    @Override
    public String toString() {
        return "vehicle{" +
                "tape='" + tape + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
