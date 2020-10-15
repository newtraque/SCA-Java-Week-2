
//Interface 1

interface CarInterface {
    public void vehicleHonkSound();
    public void vehicleEngine();
}

// implements the Car interface
class Car implements CarInterface {
    public void vehicleHonkSound() {
        System.out.println("Car sound: honk honk");
    }
    public void vehicleEngine() {
        System.out.println("Car Engine: 2.0 L 1AZ-FE I4 (gasoline)");
    }
    static void carBrand() {
        System.out.println("Car Brand: Toyota");
    }
    static void carModel() {
        System.out.println("Car Model: Camry XV40");
    }
    static void wheelBase() {
        System.out.println("Wheel Type: 2,776 mm (109.3 in)");
    }
    static void numOfTyres() {
        System.out.println("Number of Tyres: 4");
    }
}


