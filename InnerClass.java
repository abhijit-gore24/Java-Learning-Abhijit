class A {
    int age;
    public void show(){
        System.out.println("In Show");
    }
   static class B{ // If we make the inner class as a static then we can do A.B() to access it 
        public void config() {
            System.out.println("In Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();
        obj1.config();
    }
}
