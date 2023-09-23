public abstract class ComplexTransport extends SimpleTransport {

    public int enginePower;

    public ComplexTransport(String modelName, int wheelsCount, int enginePower) {
        super(modelName, wheelsCount);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public static void checkEngine(ComplexTransport complexTransport) {
        System.out.println("Проверяем двигатель мощностью " + complexTransport.getEnginePower() + " л.с. на " + complexTransport.getModelName());
    }

    @Override
    public String toString() {
        return "ComplexTransport{" +
                "enginePower=" + enginePower +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}




