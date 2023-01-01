public class ParkingSystem {
    public static void main(String[] args) {
        ParkingSystem ob = new ParkingSystem(1, 1, 0);
        System.out.print(ob.addCar(1) + " ");
        System.out.print(ob.addCar(2) + " ");
        System.out.print(ob.addCar(3) + " ");
        System.out.print(ob.addCar(1) + " ");

    }

    int[] cars = new int[3];

    ParkingSystem(int big, int medium, int small) {
        this.cars[0] = big;
        this.cars[1] = medium;
        this.cars[2] = small;

    }

    public boolean addCar(int carType) {
        carType--;
        // System.out.println(cars[carType]);
        if (cars[carType] > 0) {
            cars[carType]--;
            // System.out.println(cars[carType]);
            return true;
        } else {
            // System.out.println("no space");
            return false;
        }
    }

}
