package learningfiles;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {  /* For - оператор, затем блок условий в круглых скобках и затем тело цикла в фигурных скобках {}
                       Делим условие for  на 3 блока. В первом блоку у нас декларируется и инициализируется переменная счётчика,
                       То есть та переменная, которвая будет меняться с каждой итирацией этого цикла. Традиционно оа называется i.
                       Второй блок - это бок условия, то есть до каких пор у нас будет выполняться цикл. Третий блок - это блок изменнеия
                       переменной i, кокое действие будет выполняться каждую итирацию этого цикла (что будет происходить с переменной i каждый раз проходя через цикли)
                        i++ == i+1
                        Итого цикл выполнился 11 раз начиная с нуля
                       */
            System.out.println("Hello " + i);
        }
            /* пример 2 - for (int i = 0; i <= 10; i= i+ 5) {
            System.out.println("Hello " + i);
            пример 3 - for (int i = 10; i >= 0; i= i-5) {
            System.out.println("Hello " + i);
            */
        }
    }

