import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int action;
        Reader[] readers = new Reader[10];

        do {
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статусы всех читателей");
            System.out.println("6 -- Выйти из программы");
            System.out.println("Введите номер действия: ");
            action = sc.nextInt();
            sc.nextLine(); //холостой, чтобы программа не пропускала след. воод
            Reader rd = new Reader();
            Book b = new Book();
            switch (action) {

                case 1: {
                    boolean isFull = true; //true, если в массиве нет места
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] == null) {

                            //просим ввести данные, создаем читателя и вписываем его в readers[i]
                            System.out.println("Введите Фамилию И.О.: ");
                            rd.readerName = sc.nextLine();

                            System.out.println("Введите номер читательского билета: ");
                            rd.number = sc.nextInt();

                            System.out.println("Введите факультет: ");
                            rd.faculty = sc.nextLine();

                            System.out.println("Введите дату рождения: ");
                            rd.birthday = sc.nextLine();

                            System.out.println("Введите номер телефона: ");
                            rd.phoneNumber = sc.nextLine();

                            isFull = false; //т.к. нашли место и добавили читателя
                            break; //выходим из цикла, т.к. добавили читателя
                        }
                    }
                    if (isFull) {
                        System.out.println("Количество читателей уже максимальное");
                    }
                    break;
                    }

                case 2: {
                    //просим ввести данные книги и создаем книгу, просим ввести номер билета
                    System.out.println("Введите название книги: ");
                    b.nameBook = sc.nextLine();

                    System.out.println("Введите автора книги: ");
                    b.autherName = sc.nextLine();

                    System.out.println("Введите содержание книги: ");
                    b.text = sc.nextLine();
                    if (b.text.isEmpty()) {
                    System.out.println("");
                    }

                    System.out.println("Введите номер читательского билета: ");

                    int number = sc.nextInt();
                    sc.nextLine();
                    boolean found = false; //если не удалось найти пользователя
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].number == number) {
                            //даем книгу читателю
                            rd.takeBook();

                            found = true; //т.к. нашли читателя с введенным номером
                            break; //выходим из цикла
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 3: {
                    //просим ввести название книги и номер билета
                    System.out.println("Введите название книги: ");
                    b.nameBook = sc.nextLine();

                    System.out.println("Введите номер читательского билета: ");

                    int number = sc.nextInt();
                    sc.nextLine();
                    boolean found = false; //если не удалось найти пользователя
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].number == number) {
                            //берем книгу у читателя
                            rd.returnBook();

                            found = true; //т.к. нашли читателя с введенным номером
                            break; //выходим из цикла
                        }
                    }
                    if (found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 4: {
                    //просим ввести номер билета
                    System.out.println("Введите номер читательского билета: ");
                    rd.number = sc.nextInt();

                    int number = sc.nextInt();
                    sc.nextLine();
                    boolean found = false; //если не удалось найти пользователя
                    for (int i = 0; i < readers.length - 1; i++) {
                        if (readers[i] != null && readers[i].number == number) {
                            //вызываем у пользователя printStatus
                            rd.printStatus();

                            found = true; //т.к. нашли читателя с введенным номером
                            break; //выходим из цикла
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }

                case 5: {
                    for (Reader r : readers) {
                        if (r != null) {
                            //вызываем r.printStatus();
                            r.printStatus();
                        }
                    }
                }

                case 6: {
                    System.out.println("Завершаем программу");
                    break;
                }

                default: {
                    System.out.println("Нет такой команды");
                }
            }
        }while (action !=6);
    }
}