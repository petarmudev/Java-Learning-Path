package L09_InterfacesAndAbstraction.Task01And02_CarShop.carShop;

import java.io.Serializable;

public interface Car extends Serializable {
    public static final int TIRES = 4;

    public abstract String getModel();
    public abstract String getColor();
    public abstract Integer getHorsePower();
    public abstract String countryProduced();

}
