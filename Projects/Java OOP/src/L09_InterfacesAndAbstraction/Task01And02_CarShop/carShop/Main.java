package L09_InterfacesAndAbstraction.Task01And02_CarShop.carShop;

public class Main {
    public static void main(String[] args) {
//        //Task 1:
//        Car seat = new Seat("Leon", "gray", 110, "Spain");
//
//        System.out.println(String.format(
//                "%s is %s color and have %s horse power",
//                seat.getModel(),
//                seat.getColor(),
//                seat.getHorsePower()));
//        System.out.println(seat.toString());
        //Task 2:
        Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Rentable audi = new Audi("A4", "Gray", 110, "Germany", 3, 99.9);

        printCarInfo(seat);
        printCarInfo(audi);
    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car.toString());

    }
}
