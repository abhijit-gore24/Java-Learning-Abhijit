class Car {
    public void drive() { // Now  we dont need to use the drive method we just have to declared it but we dont want to use it and no one will create the object of it 
        System.out.println("In drive");
    }

    public void playMusic() {
        System.out.println("Play Music");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {

        Car obj = new Car();
        obj.drive();
        obj.playMusic();

    }
}



