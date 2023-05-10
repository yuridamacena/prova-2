import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a placa do veículo: ");
        String placa = scanner.nextLine();
        
        System.out.print("Informe o valor do litro de combustível: ");
        double valorLitro = scanner.nextDouble();
        
        System.out.print("Informe a quantidade de faixas de velocidade: ");
        int numFaixas = scanner.nextInt();
        
        double distanciaTotal = 0;
        double tempoTotal = 0;
        double combustivelTotal = 0;
        
        for (int i = 1; i <= numFaixas; i++) {
            System.out.printf("Informe a distância percorrida na faixa %d: ", i);
            double distancia = scanner.nextDouble();
            
            System.out.printf("Informe o tempo gasto na faixa %d: ", i);
            double tempo = scanner.nextDouble();
            
            System.out.printf("Informe a velocidade média na faixa %d: ", i);
            double velocidade = scanner.nextDouble();
            
            combustivelTotal += distancia / (velocidade * 10);
            distanciaTotal += distancia;
            tempoTotal += tempo;
        }
        
        double velocidadeMedia = distanciaTotal / tempoTotal;
        double custoTotal = combustivelTotal * valorLitro;
        
        System.out.println("Placa do veículo: " + placa);
        System.out.printf("Custo total da viagem: R$ %.2f%n", custoTotal);
        System.out.printf("Velocidade média ponderada da viagem: %.2f km/h%n", velocidadeMedia);
        System.out.printf("Quantidade total de combustivel");

    }
}


