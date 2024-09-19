package Assignment2;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person (String name, int age, String address) {
        this.name = name;
        setAge(age);  
        this.address = address;
    }

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
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person person = new Person("Gaurav Gupta", 20, "Noida");

        System.out.println("Name: " + person.getName());       
        System.out.println("Age: " + person.getAge());         
        System.out.println("Address: " + person.getAddress()); 

   
        person.setName("Varun");
        person.setAge(22);
        person.setAddress("Delhi");

        System.out.println("Updated Name: " + person.getName());       
        System.out.println("Updated Age: " + person.getAge());         
        System.out.println("Updated Address: " + person.getAddress()); 
      
        person.setAge(-5); 
        System.out.println("Final Age: " + person.getAge()); ; 

    }

}
