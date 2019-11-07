package learningfiles;

public class Enum {
}

enum Rank {
    SOLDIER,
    SERGEANT,
    CAPTAIN;

    public static void main(String[] args) {
        Rank a = Rank.CAPTAIN;

        switch (a) {
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
        }
    }
}