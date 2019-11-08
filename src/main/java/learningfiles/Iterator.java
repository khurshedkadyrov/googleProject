package learningfiles;

import java.util.Iterator;
import java.util.LinkedList;

 class yourclass {
    public static void main(String[ ] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it = animals.iterator();
        String value = it.next();
        System.out.println(value);
    }
}
//Outputs "fox"