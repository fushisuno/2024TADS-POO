package classes;

public class Main {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Formato esperado: <tipo> <valor1> <valor2> <valor3>");
            return;
        }

        String tipo = args[0];
        Tempo tempo = null;

        try {
            int valor1 = Integer.parseInt(args[1]);
            int valor2 = Integer.parseInt(args[2]);
            int valor3 = Integer.parseInt(args[3]);

            if ("tempo".equalsIgnoreCase(tipo)) {
                tempo = new Tempo();
            } else if ("data".equalsIgnoreCase(tipo)) {
                tempo = new Data(valor1, valor2, valor3);
            } else if ("horario".equalsIgnoreCase(tipo)) {
                tempo = new Horario(valor1, valor2, valor3);
            } else {
                System.out.println("Tipo inexistente.");
                return;
            }

            dadosTempo(tempo);

        } catch (NumberFormatException e) {
            System.out.println("Os valores devem ser números inteiros.");
        }
    }

    // Método para exibir informações sobre o objeto Tempo
    public static void dadosTempo(Tempo oTempo) {
        System.out.println("Tempo formatado: " + oTempo.toString());
        System.out.println("Tempo em segundos: " + oTempo.quantidade());
    }
}