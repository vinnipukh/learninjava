public class arrays {
    public static void main(String[] args) {
       // String[] cars = {"Camaro","Corvette","Tesla","BMW"};
        //cars[0] = "Mustang";
        //System.out.println(cars[3]);
        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (String car : cars) {
            System.out.println(car);

        }

    }
}
