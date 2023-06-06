
import java.util.Scanner;

public class Funcaoprocedimento {

    public static void volumeCubo (String[] args) {
        double lcubo, vcubo;
        Scanner input;
        input = new Scanner(System.in);
       
        System.out.println("Digite o valor do lado do cubo: ");
        lcubo = input.nextDouble();
        vcubo = volumeCubo(lcubo);
        System.out.println("O volume do cubo de lado " + lcubo + " é " + vcubo);
    }
   
    public static double volumeCubo(double lcubo){
        return(lcubo*lcubo*lcubo);
    }
   
}