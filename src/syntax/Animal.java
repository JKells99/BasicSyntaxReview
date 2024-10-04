package syntax;

public class Animal {

    // POJO
    // Structure

    // Fields
    private String name;

    private int age;

    private String gender;

    // Constructor(s)
    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Animal() {

    }


    // Getters And Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Any Methods You Have Created
    public void makeSound(){
        System.out.println("Animal Noises");
    }

    public String makeNoise(String noise){

        return "animal sound........"+ noise;
    }

    // ToString
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
