public class SubscriberPassenger extends Passenger{

    public SubscriberPassenger(String name, String id) {
        super(name, id);
    }

    @Override
    public void reservedCar(Car cars) throws Exception {
      cars.addPassenger();
      this.reservedCar=cars;
      this.tripCost=cars.getRoute().getPrice()*0.5;

    }

    @Override
    public void displayInformation() {
        System.out.println("Passenger Name: "+name);
        System.out.println("Passenger Id: "+id);
        System.out.println("Car code : "+reservedCar.getCode());
        System.out.println(" Trip cost: "+tripCost);
        System.out.println("Route pric: "+reservedCar.getRoute().getPrice());
    }
}
