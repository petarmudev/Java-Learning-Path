package L09_InterfacesAndAbstraction.Task01And02_CarShop.carShop;

public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();

}
