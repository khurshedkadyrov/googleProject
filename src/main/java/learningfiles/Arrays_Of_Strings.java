package learningfiles;

public class Arrays_Of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();

        for (String string : strings) ;
        System.out.println(strings);
    }
    }





