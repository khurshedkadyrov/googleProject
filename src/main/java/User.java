public class User {
    String firstName;
    String lastName;
    int phoneNumber;
    String state;

    public void setState(String state) {
     System.out.println(state);
        this.state = state;
    }

       public String getState() {
        return state;
    }


}
