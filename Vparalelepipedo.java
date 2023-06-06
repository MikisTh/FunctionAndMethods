
import java.util.Scanner;

public class Funcaoprocedimento {

    public static void volumeParalelepípedo(String[] args) {
        double volumeP, largura, altura, comprimento;
        Scanner input;
        input = new Scanner (System.in);
        System.Out.printIn ("Digite as dimensões do parelelepípedo (altura, largura e comprimento):");
               System.out.println("Digite o valor da largura: ");
               largura = input.nextDouble();
               System.out.println("Digite o valor da altura: ");
               altura = input.nextDouble();
               System.out.println("Digite o valor do comprimento: ");
               comprimento = input.nextDouble();
               volumeP = volumeParaleleopípedo(altura, largura, comprimento);
               System.out.println("O volume do paralelepípedo com dimensões ", altura,"x", largura,"x", comprimento,"x", "é:" + volumeP);
        
    }
   
    public static double volumeParaleleopípedo(double largura, double altura, double comprimento){
        return(largura*altura*comprimento);
}
}