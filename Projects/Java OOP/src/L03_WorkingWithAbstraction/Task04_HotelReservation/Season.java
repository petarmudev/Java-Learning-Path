package L03_WorkingWithAbstraction.Task04_HotelReservation;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    public int getMultiplier() {
        return multiplier;
    }

    private int multiplier;

    Season(int multiplier) {
        this.multiplier = multiplier;
    }
}
