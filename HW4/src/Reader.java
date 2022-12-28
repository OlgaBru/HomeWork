public class Reader {
    String readerName; //ФИО
    int number; //номер чит. билета
    String faculty;
    String birthday;
    String phoneNumber;
    Book[] books = new Book [10]; //массив взятых книг

    Reader() {
    }

    Book b = new Book();
    public void printStatus() {
        int counter = 0; //счетчик книг в массиве
        for (Book b : books) {
            if (b != null) { //книга есть в массиве взятых книг
                counter++; //кол-во книг в массиве
                System.out.println(readerName + " взял " + counter + " книг(-и): " + b.nameBook + ", ");
            }
            if (b != null) {
                counter = 1; //книга в массиве одна
                    System.out.println(readerName + " взял " + counter + " книгу: " + b.nameBook);
            }
        }
    }

    public void takeBook() {
         for (int i = 0; i < books.length - 1; i++){
            if (books [i] == null) { //книги нет в массиве взятых книг
                books [i] = b; //берем книгу из Book
                break;
             }
         }
        System.out.println(readerName + " взял книгу " + b.nameBook);
    }

    public void returnBook() {
        boolean isNotReturn = true; //читатель не вернул книгу
        int count = 0; //счетчик книг, которые перебираем
        for (int i = 0; i < books.length - 1; i++) {
            if (books [i] != null && isNotReturn) { //книга числится в массиве, но читатель ее не вернул
                books [i] = null; //тогда книги в массиве нет
                count++;
                System.out.println(readerName + " не вернул книгу " + b.nameBook);
                break; //выходим  из цикла, если нашли нужную книгу
            }

            if (books [i] != null && !isNotReturn) { //книга числится, но читатель не брал
                System.out.println(readerName + " не хранит книгу " + b.nameBook);
            }
        }
    }
}
