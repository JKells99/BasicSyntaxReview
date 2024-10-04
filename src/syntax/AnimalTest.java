package syntax;

public class AnimalTest {

    public static void main(String[] args) {


        // Declare a new animal object
        Animal animal = new Animal("Jordan",5,"Male");

        // Edit
        animal.setAge(46);
        animal.setName("Brandon");
        animal.setGender("Male");


        System.out.println(animal.toString());
    }
}
