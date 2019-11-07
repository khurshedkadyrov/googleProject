package learningfiles;

public class WhileLoops { // Цикл While
    public static void main(String[] args) {
        int value = 0;
        boolean t = 5==1; // boolean результат может быть только true или False
                          // для сравнения используем 2 знака ==
                          // цикл while выполняется до тех пор, пока какое то из условий не даст true
        while (value <5){
            System.out.println("Hello "+value);
            value = value+1;
        }
            }
}


