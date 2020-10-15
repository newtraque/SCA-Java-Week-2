
//SuperClass
class Vehicle {
    public static void main(String[] args) {
        Car myCamry = new Car();  //creates a an object for class Car
        Car.carBrand();
        Car.carModel();
        Car.numOfTyres();
        Car.wheelBase();
        myCamry.vehicleHonkSound();//Abstract methods called
        myCamry.vehicleEngine();

        System.out.println("\n");

        Truck myNissan = new Truck();  // creates a an object for class Truck
        Truck.truckBrand();
        Truck.truckModel();
        Truck.numOfTyres();
        Truck.wheelBase();
        myNissan.vehicleHonkSound();//Abstract methods called
        myNissan.vehicleEngine();
    }
}
