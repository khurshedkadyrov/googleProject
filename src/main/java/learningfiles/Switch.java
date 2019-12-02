package learningfiles;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи количество классов, которые мы прошли по твоему мнению");
        String numberOfClassesTaken = scanner.nextLine();
        switch (numberOfClassesTaken) {
            case "-1":
                System.out.println("Совершенно отсутствует образование начальных классов");
                break;
            case "0":
                System.out.println("не в ту сторону");
                break;
            case "13":
                System.out.println("снова ошибаешься");
                break;
            case "12":
                System.out.println("прямо в точку");
                break;
            default:
                System.out.println("Меньше ковыряйся в телефоне во время занятий");
        }


    }
}
