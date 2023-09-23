public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("Bicycle2", 2);

        SimpleTransport[] simpleTransports = {bicycle, bicycle2};

        Car car = new Car("Car1", 4, 110);
        Car car2 = new Car("Car2", 4, 130);

        Car[] cars = {car, car2};

        Truck truck = new Truck("Truck1", 6, 300);
        Truck truck2 = new Truck("Truck2", 8, 600);

        Truck[] trucks = {truck, truck2};

        ComplexTransport[] complexTransport = new ComplexTransport[cars.length + trucks.length];

        for (int i = 0; i < cars.length; i++) {
            complexTransport[i] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            complexTransport[i + cars.length] = trucks[i];
        }

        for (int i = 0; i < simpleTransports.length; i++) {
            SequenceWorkPrint.serviceNotice(simpleTransports[i]);
            SimpleTransport.updateTyre(simpleTransports[i]);
            System.out.println();
        }

        for (int i = 0; i < complexTransport.length; i++) {
            SequenceWorkPrint.serviceNotice(complexTransport[i]);
            ComplexTransport.updateTyre(complexTransport[i]);
            ComplexTransport.checkEngine(complexTransport[i]);
            if (i > cars.length - 1) {
                System.out.println(complexTransport[i]);
            }
            System.out.println();
        }
    }
}

