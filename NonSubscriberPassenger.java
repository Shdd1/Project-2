public class NonSubscriberPassenger extends Passenger{
    private boolean discountCoupon;

    public NonSubscriberPassenger(String name, String id, boolean discountCoupon) {
        super(name, id);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }


    @Override
    public void reservedCar(Car cars)throws Exception {
        cars.addPassenger();
        this.reservedCar=cars;
        if(discountCoupon){
            this.tripCost=cars.getRoute().getPrice()*0.9;
        }else {
            this.tripCost=cars.getRoute().getPrice();
        }
    }

    @Override
    public void displayInformation() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger ID: " + id);
        System.out.println("Reserved Car Code: " + reservedCar.getCode());
        System.out.println("Trip Cost: $" + tripCost);
        System.out.println("Route Price: $" + reservedCar.getRoute().getPrice());
    }
}
