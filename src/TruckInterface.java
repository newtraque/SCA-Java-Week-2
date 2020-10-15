
//Interface 2

interface TruckInterface {
    public void vehicleHonkSound();
    public void vehicleEngine();
}

// implements the Truck interface
class Truck implements TruckInterface {
    public void vehicleHonkSound() {
        System.out.println("Truck sound: honk honk");
    }
    public void vehicleEngine() {
        System.out.println("Truck Engine: 2.5-liter turbocharged diesel engine ");
    }
    static void truckBrand() {
        System.out.println("Truck Brand: Nissan");
    }
    static void truckModel() {
        System.out.println("Truck Model: Navara D40");
    }
    static void wheelBase() {
        System.out.println("Wheel Type: Wolf VE Black With Stainless Lip Wheel");
    }
    static void numOfTyres() {
        System.out.println("Number of Tyres: 4");
    }

}
