public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i%4==0){
                System.out.println("PI");
            }else{
                System.out.printf("%s%n",i);
            }
        }
    }
}