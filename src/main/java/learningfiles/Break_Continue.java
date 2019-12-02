package learningfiles;

public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) { // помещая true в условия - мы создаём бесконечный цикл
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Вы вышли их цикла");
    }

    public static void main2(String[] args) {
        for (int i = 0; i <= 15; i++){
            if (i % 2 == 0) { // % значит - подели на число которое идет за знаком % и посмотри остаток. У любого четного числа остаток при делении на 2 равен нулю
                continue; // то есть условие у нас выполняется только тогда, когда i целое число
            }
        System.out.println("это нечётное число " + i);
    }
}
}


