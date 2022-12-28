import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Phone onePhone = new Phone("253539579", "Huawei", 75.1);
        Phone twoPhone = new Phone("297592692", "Xiaomi", 86.9);
        Phone threePhone = new Phone("295555555", "Apple", 101.0);

        System.out.println();
        System.out.println("Phone 1: " + "number " + onePhone.number + "; " +
                "model " + onePhone.model + "; weight " + onePhone.weight);
        System.out.println("Phone 2: " + "number " + twoPhone.number + "; " +
                "model " + twoPhone.model + "; weight " + twoPhone.weight);
        System.out.println("Phone 3: " + "number " + threePhone.number + "; " +
                "model " + threePhone.model + "; weight " + threePhone.weight);

        onePhone.name = "Agata";
        twoPhone.name = "Yanina";
        threePhone.name = "Stanislaw";

        onePhone.receiveCall(onePhone.name);
        twoPhone.receiveCall(twoPhone.name);
        threePhone.receiveCall(threePhone.name);

        System.out.println(onePhone.getNumber());
        System.out.println(twoPhone.getNumber());
        System.out.println(threePhone.getNumber());

        onePhone.receiveCall(onePhone.name, onePhone.number);
        twoPhone.receiveCall(twoPhone.name, twoPhone.number);
        threePhone.receiveCall(threePhone.name, threePhone.number);

        onePhone.sendMessage(onePhone.number);
        twoPhone.sendMessage(twoPhone.number);
        threePhone.sendMessage(threePhone.number);
    }
}