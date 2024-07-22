public class Car {
    private String code;
    private Route route;
    private int maxCapacity;
    private int currentPassengers;

    public Car(String code, Route route, int maxCapacity) {
        this.code = code;
        this.route = route;
        this.maxCapacity = maxCapacity;
        this.currentPassengers = 0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    //method to add passenger
    public void addPassenger() throws Exception {
        if (currentPassengers >= maxCapacity) {
            throw new Exception("The car is full can not add passengers ");
        } else {
            currentPassengers++;
        }
    }


}

