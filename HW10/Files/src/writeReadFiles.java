import java.io.*;
import java.util.ArrayList;

public class writeReadFiles {
    public static void main(String[] args) throws IOException {
        //создаем файлы
        try (BufferedWriter bw1 = new BufferedWriter(new FileWriter("D:\\CourseJava\\projects\\HomeWork\\Files" +
                "\\textFiles\\text1.txt"));
             BufferedWriter bw2 = new BufferedWriter(new FileWriter("D:\\CourseJava\\projects\\HomeWork\\Files" +
                     "\\textFiles\\text2.txt"));
             BufferedWriter bw3 = new BufferedWriter(new FileWriter("D:\\CourseJava\\projects\\HomeWork\\Files" +
                     "\\textFiles\\text3.txt"));
        ) {
            String text1 = "The key to success ";
            String text2 = "is to focus on goals, ";
            String text3 = "not obstacles";
            //записываем текст в созданные файлы
            bw1.write(text1);
            bw2.write(text2);
            bw3.write(text3);

        } catch (IOException ex) {
            System.out.println("Файл не существует");
            ex.printStackTrace();
        }

        //опред. объект д/каталога
        try {
            File f = new File("D:\\CourseJava\\projects\\HomeWork\\Files\\textFiles\\textResult.txt");

            if (!f.exists()) //если такого файла нет

                f.createNewFile(); //создаем новый файл

        } catch (IOException ex) {
            System.out.println("Файл не создан");
        }

        ArrayList<String> threeFiles = new ArrayList<>();//созд. пустой список
        //читаем файлы
        try (BufferedReader br1 = new BufferedReader(new FileReader("D:\\CourseJava\\projects\\HomeWork\\Files" +
                "\\textFiles\\text1.txt"));
             BufferedReader br2 = new BufferedReader(new FileReader("D:\\CourseJava\\projects\\HomeWork\\Files" +
                     "\\textFiles\\text2.txt"));
             BufferedReader br3 = new BufferedReader(new FileReader("D:\\CourseJava\\projects\\HomeWork\\Files" +
                     "\\textFiles\\text3.txt"));
        ) {

            String line;

            //добавляем в список строки из прочитанных файлов
            while ((line = br1.readLine()) != null) {//в перем. line запис. строка, кот. считывается с файла, если она не пустая, то чтение далее
                threeFiles.add(line);
                threeFiles.add(br2.readLine());
                threeFiles.add(br3.readLine());
            }
            /*System.out.println(threeFiles);*/

        } catch (IOException ex) {
            System.out.println("Файл не существует");
            ex.printStackTrace();
        }

            //пишем текст в новый файл
        try (BufferedWriter resultBW = new BufferedWriter(new FileWriter("D:\\CourseJava\\projects\\HomeWork\\Files" +
                 "\\textFiles\\textResult.txt"))) {
             for (String files : threeFiles) {
                    resultBW.write(files);
                }

        } catch (IOException ex) {
            System.out.println("Файл не существует");
            ex.printStackTrace();
            }

            //читаем текст из итогового файла
        try (BufferedReader resultBR = new BufferedReader(new FileReader("D:\\CourseJava\\projects\\HomeWork" +
                "\\Files\\textFiles\\textResult.txt"))) {
            String s;
            StringBuilder sb = new StringBuilder();
            while ((s = resultBR.readLine()) !=null) {
                sb.append(s);
        }
            System.out.println(sb.toString());
            return;

        } catch (IOException ex) {
        System.out.println("Файл не существует");
        ex.printStackTrace();
        }
    }
}






