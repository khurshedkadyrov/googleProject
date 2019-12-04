package learningfiles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{                      //цикл doWhile сначала выполянет инструкции и потом уже проверяет условия
            System.out.println("Введи 5");
            value = scanner.nextInt();
        }while (value!=5);


        /*System.out.println("Введи 5"); Цикл while сначала проверяет условия и потом выполняет иснтрукции
        int value = scanner.nextInt();
        while (value != 5) { //мы создаём цикл while и он будет крутиться до тех пор, пока не будет равен 5
            System.out.println("Введи 5");
            value = scanner.nextInt();

                }
        System.out.println("Вы ввели 5"); //в хорошей программе не должно быть дублирования кода, поэтому вместо этого мы используем цикл do/while*/
    }
}
