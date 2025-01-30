import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private static Carro carro = new Carro("Ponto morto", false, 0);
    public static void main(String[] args) throws Exception {
        var opcao = -1;

        do{
            System.out.println("Escolha uma das opcoes:");
            System.out.println("1. Ligar Carro");
            System.out.println("2. Desligar Carro");
            System.out.println("3. Mudar Marcha");
            System.out.println("4. Acelerar carro ");
            System.out.println("5. Reduzir carro");
            System.out.println("6. Virar para a esquerda ou direita");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> ligandoCarro();
                case 2 -> desligandoCarro();
                case 3 -> carro.mudarMarcha();
                case 4 -> acelerar();
                case 5 -> reduzir();
                case 6 -> carro.virarLateral();
                case 0 -> System.exit(0);
                default -> System.out.println("Opcao invalida");
            }
        
        }while(true);

    }

    private static boolean ligandoCarro(){

            return carro.ligarCarro();
        
    }

    private static boolean desligandoCarro(){
        return carro.desligarCarro();
    }
    
    private static void acelerar(){
        //System.out.println("Você está acelerando o carro");
        carro.acelerarCarro();
    }

    private static void reduzir(){
       // System.out.println("Você está reduzindo a velocidade");
        carro.reduzirCarro();
    }

    //private static void virar(){
      //  System.out.println("Voce esta virando.");
     //   carro.virarLateral();
    //}
}
