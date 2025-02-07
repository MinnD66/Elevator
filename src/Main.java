import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CargoTransportation cargoTransportation = new CargoTransportation(24, 10, "Moscow", true,"А292ОУ",false);
        cargoTransportation.changeAddress("Kazan");
        System.out.println(CargoTransportation.isCopied);



        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}