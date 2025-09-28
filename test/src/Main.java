//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] temperaturas = {98, 102, 87, 110, 99, 105};

        for (int temp : temperaturas) {
            if (temp > 100) {
                System.out.println("Temperatura alta: " + temp + " grados");
            }
        }

        //2:
        int[] seguidores = {150, 200, 250, 300, 350, 400, 550, 600, 700, 800, 900, 1000, 1100, 1200, 1300};
        int contador = 0;
        for (int seguidor : seguidores) {
            if (seguidor > 1000) {
                System.out.println("Tienes muchos seguidores: " + seguidor);
                contador++;

            }

        }
        System.out.println("Total de seguidores con más de 1000: " + contador);

        // 3:

        double[] saldo_positive = {1500.50, 2000.75, 3000.00, 4500.25};
        double[] saldo_negative = {-500.00, -750.25, -1000.50, -1250.75};
        double total_positive = 0;
        double total_negative = 0;
        for (double saldo : saldo_positive) {
            total_positive += saldo;
        }
        for (double saldo : saldo_negative) {
            total_negative += saldo;
        }
        System.out.println("Total saldo positivo: " + total_positive);
        System.out.println("Total saldo negativo: " + total_negative);
        System.out.println("Saldo neto: " + (total_positive + total_negative));

    }

    ;

    //4:
    public class Notas {
        public static void main(String[] args) {
            int[] notas = {7, 8, 5, 6, 9, 10, 4, 7, 8, 6, 5, 9, 7, 8, 6, 5, 10, 9, 8, 7};

            for (int nota : notas) {
                if (nota >= 5) {
                    System.out.println("El alumno ha aprobado con una nota de: " + nota);
                } else {
                    System.out.println("El alumno ha suspendido con una nota de: " + nota);
                }

            }

        }
    }
};













