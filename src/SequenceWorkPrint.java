public interface SequenceWorkPrint {
    static void serviceNotice(SimpleTransport simpleTransports) {
        System.out.println("Обслуживается транспортное средство марки: " + simpleTransports.getModelName());
    }
}
