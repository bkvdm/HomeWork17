public class Truck extends ComplexTransport {
    public Truck(String modelName, int wheelsCount, int enginePower) {
        super(modelName, wheelsCount, enginePower);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп транспортного средства: " + getModelName());
    }

    @Override
    public String toString() {
        return "Проверяем прицеп транспортного средства: " + getModelName();
    }
}