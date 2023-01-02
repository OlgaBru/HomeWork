import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Ford", "C", 2500, 250, 178,
                "Иванов И.И.", 5);

        Lorry lorry = new Lorry("МАЗ", "N1", 5000, 350,
                225, "Петров П.П.", 10, 2700);

        SportCar sportCar = new SportCar("Supercar", "F", 1700, 370, 195,
                "Сидоров С.С", 6, 250);

        Car[] array = new Car[3];
        array[0] = car;
        array[1] = lorry;
        array[2] = sportCar;

        for (Car c : array) {
            System.out.println(c.toString());
        }
        сar.start();

}