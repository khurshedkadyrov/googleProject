import org.junit.Assert;
import org.junit.Test;

public class Zoo {
    @Test
    public void verifyConstructorOfChipmunk() {
Chipmunk myChipmunk = new Chipmunk(251);
        System.out.println(myChipmunk.getAge());
        Assert.assertEquals("Chipmunk age",25, myChipmunk.getAge());
    }
}


   /* public static void main(String[] args) {
        Chipmunk a = new Chipmunk();
        Chipmunk b = new Chipmunk();
        a.setName("Cucumber");
        a.setAge(25);
        a.setWeight(12.2);

        b.setName("Caviar");
        b.setAge(12);
        b.setWeight(15.12);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getWeight());
        System.out.println(b.getName());
        System.out.println(b.getAge());
        System.out.println(b.getWeight());
        System.out.println();

        Chipmunk myChipmunk = new Chipmunk("Bubblegum");
        System.out.println("Name:\t" + myChipmunk.getName());

        Chipmunk myChipmunk2 = new Chipmunk(12);
        System.out.println("Age:\t" + myChipmunk.getAge());

        Chipmunk myChipmunk3 = new Chipmunk(12.1);
        System.out.println("Weight:\t" + myChipmunk.getWeight());

        Chipmunk myChipmunk4 = new Chipmunk("Bubblegum", 12);
        System.out.println("Name:\t" + myChipmunk4.getName());
        System.out.println("Age:\t" + myChipmunk4.getAge());

        Chipmunk myChipmunk5 = new Chipmunk("Bubblegum",12.1);
        System.out.println("Name:\t" + myChipmunk5.getName());
        System.out.println("Weight:\t" + myChipmunk5.getWeight());

        Chipmunk myChipmunk6 = new Chipmunk(12, 12.1);
        System.out.println("Age:\t" + myChipmunk6.getAge());
        System.out.println("Weight:\t" + myChipmunk6.getWeight());

        Chipmunk myChipmunk1 = new Chipmunk("Bubblegum", 21, 12.1);
        System.out.println("Age:\t" + myChipmunk.getAge());
        System.out.println("Name:\t" + myChipmunk.getName());
        System.out.println("Weight:\t" + myChipmunk.getWeight());
    }
}
*/





