import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class Reader implements Serializable {

    String readerName; //ФИО
    int number; //номер чит. билета
    String faculty;
    String birthday;
    String phoneNumber;

    //LikedList - т.к. часто вставляю/удаляю элемент
    LinkedList<String>books = new LinkedList<>();//вместо Book[] books = new Book [10]; //массив взятых книг

    Reader() {
    }

    Book b = new Book();
    public void printStatus() {
        int counter = 0; //счетчик книг массиве взятых книг
        for (int i = 0; i < books.size()-1; i++) {
            if (books.get(i) != null) { //книга есть в массиве взятых книг
                counter++; //кол-во книг в массиве
            }
            if (counter > 1) {
                System.out.println(readerName + " взял " + counter + " книг(-и): " + b.nameBook + ", ");
            } else if (counter==1) {
                System.out.println(readerName + " взял " + counter + " книгу: " + b.nameBook);
            }
        }
    }

    public void takeBook() {
        for (int i = 0; i < books.size()-1; i++){
            if (books.get(i) == null) { //книги нет в массиве взятых книг; .get() - получить эл-т
                books.set(i, b.toString()); //берем книгу из Book; .set() - изменить эл-т
                break;
            }
        }
        System.out.println(readerName + " взял книгу " + b.nameBook);
    }

    public void returnBook() {
        boolean isNotReturn = true; //читатель не вернул книгу
        for (int i = 0; i < books.size()-1; i++) {
            if (books.get(i) != null && !isNotReturn) { //книга есть в массиве взятых книг и не хранится у читателя (вернул)
                books.set(i, null); //убираем книгу из массива взятых книг
                System.out.println(readerName + " вернул книгу " + b.nameBook);
            }

            if (isNotReturn) { //читатель не вернул книгу
                System.out.println(readerName + " не вернул книгу " + b.nameBook);
            }
        }
    }

    @Override
    public String toString() {
        return readerName + " № чит. бил.: " + number + " " + faculty + " Дата рождения: " + birthday +
                "№ тел.: " + phoneNumber;
    }
}
