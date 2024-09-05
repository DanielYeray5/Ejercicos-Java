public class Ejer8 {
    public static void main(String[] args) {
        double x = 1;
        for(int i = 0; x <= 100; i++){
            if(x % 2 == 0 || x % 3 == 0){
                System.out.println(x);
            }
            x++;
        }
    }
}
