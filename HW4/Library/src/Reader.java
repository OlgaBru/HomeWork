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

        int counter = 0; //счетчик книг массиве

        for (int i = 0; i < books.length - 1; i++){
            if (books [i] != null) { //книга есть в массиве взятых книг
                counter++; //кол-во книг в массиве
            }
            if (counter > 1) {
                System.out.println(readerName + " взял " + counter + " книг(-и): " + books[i].nameBook + ", ");
            } else if (counter==1) {
                    System.out.println(readerName + " взял " + counter + " книгу: " + books[i].nameBook);
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
        for (int i = 0; i < books.length - 1; i++) {
            if (books [i] != null && !isNotReturn) { //книги нет в массиве взятых книг и не хранится у читателя (вернул)
                books[i] = null; //убираем книгу из массива взятых книг
                System.out.println(readerName + " вернул книгу " + b.nameBook);
            }

            if (isNotReturn) { //читатель не вернул книгу
                System.out.println(readerName + " не вернул книгу " + b.nameBook);
            }
        }
    }
}
