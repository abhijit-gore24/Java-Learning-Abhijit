    public class Array {
        public static void main(String args[]){
        int num[] = new int[4];
        num[0] = 10;  // here we set the values to each position like we we print the value of the 1st index then we got the 20 here
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        System.out.println(num[1]); // so if we try to print the index then we get the 0 here (here we got the 4 boxes but the values are zero)
        for (int i = 0; i<4; i++){
            System.out.println("loop printed "+ num[i]);
        }
    }
    }