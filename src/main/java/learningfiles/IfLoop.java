package learningfiles;

public class IfLoop {
    public static void main(String[] args) {
       int myInt = 15;
        if (myInt <10){  /*если условие в круглых скобках верное true, то мы выполняем условия в фигурных скобках
                    если условие в круглых скобака неверное false, то мы используем опертаор else (иначе)
           При выполнении всех условий одновременно - выводится первое условие, так как java считает условия сверху вниз
           */

           System.out.println("да, верно");
    }else if (myInt>20) {
            System.out.println("нет, не верно");
        }else{
            System.out.println("ни один из предыдущих случаев");
            }
       }

}

