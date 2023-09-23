public abstract class SimpleTransport {
    private String modelName;
    public int wheelsCount;

    public SimpleTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public static void updateTyre(SimpleTransport simpleTransport) {
        System.out.println("Замена покрышек на " + simpleTransport.getModelName());
        int totalTires = simpleTransport.getWheelsCount();
        for (int i = 0; i < totalTires; i++) {
            System.out.println("Меняем покрышку №: " + (i + 1) + " колеса из " + totalTires + " колёс");
        }
    }

    @Override
    public String toString() {
        return "SimpleTransport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}

