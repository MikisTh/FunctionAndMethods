import java.util.Scanner;

public class Funcaoprocedimento {
 
        public static void main (String[] args) {
            scanner input;
            input = new Scanner(System.in);
        }
        int option = (0);
      {
            System.out.printIn("(1) Calcular o volume do Cubo. \n");
            System.out.printIn("(2) Calcular o volume do Paralelepípedo. \n");
            System.out.printIn("(0) Sair.");
        
            
           option = input.nextInt();
            while (option != 0);
            System.Out.printIn("\nopção inválida: ");
    }
    
    
    public int getOption() {
        return option;
    }
    public void setOption(int option) {
        this.option = option;
    
    
                while (option);	
                volumeCubo.volumeC(1);
                break;  
                     if (1); 
                    System.out.printIn("(1) Calcular o volume do Cubo. \n");
                   
                while (option)
                volumeParalelepípedo.volumeP(2);
                break;
                    if (2);
                System.out.printIn("(2) Calcular o volume do Paralelepípedo. \n");
               
                while (option);
                System.exit(0);
                break;   
                     if (0); 
                         System.Out.printIn("Sair do programa.");
               
    }
    

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
   

    public static void maivolumeParalelepípedo (String[] args) {
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