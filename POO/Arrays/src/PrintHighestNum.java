import java.util.Scanner;

public class PrintHighestNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[5];



        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introduzca num " + (i+1));
            nums[i] = entrada.nextInt();
        }
        int numAux = 0;
        for (int i = 0; i < nums.length; i++){
            if(numAux < nums[i]){
                numAux = nums[i];
            }
        }
        System.out.println("el numero mayor es: " + numAux);
    }
}
