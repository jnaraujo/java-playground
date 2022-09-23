import Interfaces.UserInterface;

public class User implements UserInterface {
    private String name;
    private int age;
    private String gender;

    User(String name, String gender, int age){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }
}
