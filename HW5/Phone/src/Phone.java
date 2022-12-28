public class Phone {
    String number; //тип Str, т.к. никаких арифм. действ. и чтобы можно было ввод. номер с разн. кол. цифр
    String model;
    double weight;
    String name;

    public Phone() { //пустой конструктор
    }

    public Phone (String number, String model) {//конструктор, который принимает два параметра
        this.number = number;
        this.model = model;
    }


    public Phone (String number, String model, double weight) {//вызов конструктора с 2-мя параметрами.
                                                               //отд. с 3-мя парам. не пропис., т.к будет повторением
        this (number, model);
        this.weight = weight;
    }

    public void receiveCall (String name) {
        System.out.println("Звонит: " + name);
    }

    public void receiveCall (String name, String number) {
        System.out.println("Звонит: " + name + ", номер: " + number);
    }

    public String getNumber () {
        return  "Номер: " + number;
    }

    public void sendMessage (String ... numbers) {
        for (String n : numbers) {
            System.out.println("Сообщение для номера: " + n);
        }
    }
}


