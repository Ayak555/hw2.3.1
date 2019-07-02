import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) throws IllegalNameLengthException, IllegalAgeException {

        User user = new User();

        user.setName("Иванов Иван Иванович");
        user.setAge(50);

        if (user.getAge() > 0 && user.getAge() < 100) {
            try {
                Scanner scanner = new Scanner(System.in);
                int age = scanner.nextInt();
                String name = scanner.next();
                System.out.println("Имя - " + name + "//" + "Возраст - " + age);
            } catch (Exception excep) {
                System.out.println("ОШИБКА");
            }
        } else {
        }


    }
}
