import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Route route1 = new Route("123 Main St", "456 Elm St", 100.0);
            Route route2 = new Route("789 Oak St", "101 Pine St", 150.0);


            Car car1 = new Car("Car01", route1, 2);
            Car car2 = new Car("Car02", route2, 0);


            Passenger[] passengers = new Passenger[2];
            passengers[0] = new SubscriberPassenger("Shahad", "001");
            passengers[1] = new NonSubscriberPassenger("Nora", "002", true);
            //passengers[2] = new SubscriberPassenger("Amal", "003");

            passengers[0].reservedCar(car1);
            passengers[1].reservedCar(car1);
           // passengers[2].reservedCar(car1);


            for (Passenger passenger : passengers) {
                passenger.displayInformation();
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
