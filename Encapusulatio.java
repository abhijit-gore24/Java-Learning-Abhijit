class Human {
    private int age; // The lots of data are direclty accessible so one way to do that is make the
                     // variable as private if we make it private then vaarible is accessible in the
                     // same class only outside the class we cannot access that data. Like that in
                     // Human class only we are access the private variable only
    private String name = "Manish"; // Everytime we can create a instance varaible then make it private no one form
                                    // outside the world will able to use it They can't be able to access it
                                    // directly there is some indirect way to access the private varaible

    public int getAge() { // This is the getter method where we get the data.
        return age; // We can access age variable inside the method of same class
    }

    public void setAge(int a) { // This is the setter method where we set the data.
        age = a; // Here we set the age
    }

    public void setName(String n) {  //This is the setter method where we set the data. 
                name = n; // here we set the name

    }

    public String getName() { // This is the getter method where we get the data.
        return name; // We can access name variable inside the method of same class
    }
}

public class Encapusulatio {
    public static void main(String args[]) {
        Human h = new Human();
        h.setAge(30);
        h.setName("Abhijit Gore Bhai ");
        // h.age = 90;
        // h.name = "Abhijit";
        System.out.println(h.getAge() + ":" + h.getName()); // this is how we can access that

    }
}
