public class Chipmunk {
    String name;
    int age;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    Chipmunk() {
    }

    Chipmunk(String name) {
        this.name = name;
    }

    Chipmunk(int age) {
        this.age = age;
    }

    Chipmunk(double weight) {
        this.weight = weight;
    }

    Chipmunk(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    Chipmunk(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Chipmunk(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    Chipmunk(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
}
