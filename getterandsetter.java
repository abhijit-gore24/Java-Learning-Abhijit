class Human {
    private int age;     // The lots of data are direclty accessible so one way to do that is make the variable as private if we make it private then vaarible is accessible in the same class only outside the class we cannot access that data. Like that in Human class only we are access the private variable only
    private String name = "Manish"; // Everytime we can create a instance varaible then make it private no one form outside the world will able to use it They can't be able to access it directly there is some indirect way to access the private varaible  
 
  
     public int getAge(){
         return age;  // We can access age variable inside the method of same class 
     }
     public void setAge(int a){ // Here we set the age 
         age = a;
        }
        public void setName(String n){ // here we set the name
         name = n;
        }
        
     public String getName() {
         return name; // We can access name variable inside the method of same class
     }
 }
 
 public class getterandsetter {
     public static void main (String args[]){
         Human h = new Human();
         h.setAge(30);
         h.setName("Abhijit Gore Bhai ");
         // h.age = 90;
         // h.name = "Abhijit";
         System.out.println(h.getAge() + ":" + h.getName()); // this is how we can access that 
 
     }
 }
 