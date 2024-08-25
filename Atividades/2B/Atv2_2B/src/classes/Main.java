package classes;

import java.util.Scanner;

public class Main {
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        String input = ler.nextLine();
        String input_list[] = input.split(" ");
        if (input_list.length < 4){
            System.out.println("Formato esperado: <tipo> <valor1> <valor2> <valor3>");
            System.out.println("Tipos disponíveis: tempo, data, horario");
        }else{
            String tipo = input_list[0].toLowerCase();
            int valor1 = Integer.parseInt(input_list[1]);
            int valor2 = Integer.parseInt(input_list[2]);
            int valor3 = Integer.parseInt(input_list[3]);
    
            Tempo tempo = null;
    
            switch (tipo) {
                case "tempo":
                    tempo = new Tempo();
                    break;
                case "data":
                    tempo = new Data(valor1, valor2, valor3);
                    break;
                case "horario":
                    tempo = new Horario(valor1, valor2, valor3);
                    break;
                default:
                    System.out.println("Tipo inexistente.");
                    return;
            }
    
            dadosTempo(tempo);
        }

    }

    private static void dadosTempo(Tempo oTempo) {
        System.out.println("Tempo formatado: " + oTempo.toString());
        System.out.println("Tempo em segundos: " + oTempo.quantidade());
    }
}
