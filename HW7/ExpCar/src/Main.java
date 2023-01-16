import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Car cars = new Car();

        Car[] array = new Car[3];
        array[0] = new Car("Ford", "C", 2500, 250, 178,
                "Иванов И.И.", 5);
        array[1] = new Lorry("МАЗ", "N1", 5000, 350,
                225, "Петров П.П.", 10, 2700);
        array[2] = new SportCar("Supercar", "F", 1700, 370, 195,
                "Сидоров С.С", 6, 250);

        for (Car c : array) {
            c.car();
        }
        cars.start();
        cars.stop();
        cars.turnRight();
        cars.turnLeft();
    }
}