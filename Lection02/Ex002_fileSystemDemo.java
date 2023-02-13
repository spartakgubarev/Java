package Lection02;
import java.io.File;

public class Ex002_fileSystemDemo {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file666.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        System.out.println(pathFile);
        File f1 = new File("file.txt");
        File f2 = new File("G:/Учеба/Разработчик/repo/Java/Lection02/file666.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}