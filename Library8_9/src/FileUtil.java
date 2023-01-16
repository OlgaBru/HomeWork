import java.io.*;
import java.util.List;

public class FileUtil {
    FileUtil() {
    }

    //М-д, который принимает в себя список читателей и сохраняет его в файл
    public static boolean saveReadersList(List <Reader> readers) {
        //создаем файл, в кот. будем сохр. список читателей
        try {
            File f = new File("D:\\CourseJava\\projects\\HomeWork\\Library8_9\\listReaders.txt");

            if (!f.exists()) //если такого файла нет

                f.createNewFile(); //создаем новый файл

        } catch (IOException ex) {
            System.out.println("Файл не создан");
        }

        //сохр. список в файл (сериализация, чтобы получить программу, кот. не теряет данные после ее вкл./выкл.),
        //в Reader допис. "implements Serializable" и переопр. м-д toString, кот. возвращ. все поля объекта Reader
        // (т.к. не создавала геттеры)

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\CourseJava\\projects\\" +
                "HomeWork\\Library8_9\\listReaders.txt"))) {
            Reader r = new Reader();
            oos.writeObject(r);

        } catch (IOException ex) {
            System.out.println("Сохранить список в файл не удалось");
            ex.printStackTrace();
        }
        return false;
    }

    //М-д, который считывает список читателей из файла
    public static List <Reader> restoreReadersList() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\CourseJava\\projects\\" +
                "HomeWork\\Library8_9\\listReaders.txt"))) {
            Reader r = (Reader) ois.readObject();

            System.out.println(r.toString());

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Файла (списка) не существует");
        }
        return null;
    }
}


