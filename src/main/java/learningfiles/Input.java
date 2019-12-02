package learningfiles;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);      // Scanner это класс, s это новый объект класса Scanner, nextLine это метод объекта s
        System.out.println("введите что-нибудь");
        String string = s.nextLine();
        System.out.println("вы ввели " +string);
    }
/* пример 2 с использованием int переменной
        System.out.println("введите какое-нибудь число");
        int x = s.nextInt();
        System.out.println("вы ввели " +x);*/
}
