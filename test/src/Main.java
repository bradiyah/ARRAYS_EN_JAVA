public class Main {

  public static void main(String[] args) {
    ejercicio1();
    ejercicio2();
    ejercicio3();
    ejercicio4();
    ejercicio5();
    ejercicio6();
    ejercicio7();
    ejercicio8();
    ejercicio9();
    ejercicio10();
  }

  // 1: Temperaturas
  public static void ejercicio1() {
    int[] temperaturas = {98, 102, 87, 110, 99, 105};
    for (int temp : temperaturas) {
      if (temp > 100) {
        System.out.println("Temperatura alta: " + temp + " grados");
      }
    }
    System.out.println("--------------------");
  }

  // 2: Seguidores
  public static void ejercicio2() {
    int[] seguidores = {150, 200, 250, 300, 350, 400, 550, 600, 700, 800, 900, 1000, 1100, 1200, 1300};
    int contador = 0;
    for (int seguidor : seguidores) {
      if (seguidor > 1000) {
        System.out.println("Tienes muchos seguidores: " + seguidor);
        contador++;
      }
    }
    System.out.println("Total de seguidores con más de 1000: " + contador);
    System.out.println("--------------------");
  }

  // 3: Saldo
  public static void ejercicio3() {
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
    System.out.println("--------------------");
  }

  // 4: Notas
  public static void ejercicio4() {
    int[] notas = {7, 8, 5, 6, 9, 10, 4, 7, 8, 6, 5, 9, 7, 8, 6, 5, 10, 9, 8, 7};
    for (int nota : notas) {
      if (nota >= 5) {
        System.out.println("El alumno ha aprobado con una nota de: " + nota);
      } else {
        System.out.println("El alumno ha suspendido con una nota de: " + nota);
      }
    }
    System.out.println("--------------------");
  }

  // 5: Milisegundos
  public static void ejercicio5() {
    double[] milisec = {0.001, 0.002, 0.003, 0.004, 0.005};
    for (double time : milisec) {
      if (time < 0.005) {
        System.out.println("La ejecución fue rápida: " + time + " milisegundos");
      } else {
        System.out.println("La ejecución fue lenta: " + time + " milisegundos");
      }
    }
    System.out.println("--------------------");
  }

  // 6: Media de puntos
  public static void ejercicio6() {
    int[] points = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int total = 0;
    for (int point : points) {
      total += point;
    }
    double media = (double) total / points.length;
    System.out.println("La media de puntos es: " + media);
    System.out.println("El total de puntos es: " + total);
    System.out.println("--------------------");
  }

  // 7: Radiación
  public static void ejercicio7() {
    double[] radiation = {15.2, 17.8, 20.3, 22.5, 25.0, 30.1, 40.2, 45.3, 50.0, 55.2, 60.5};
    System.out.print("Los niveles de radiación superiores a 50 son: ");
    for (double level : radiation) {
      if (level > 50.0) {
        System.out.print(level + " ");
      }
    }
    System.out.println("\n--------------------");
  }

  // 8: Vocales de frase
  public static void ejercicio8() {
    String frase = "La verdad es que estos ejercicios me cuecen";
    char[] texto = frase.toCharArray();
    StringBuilder vocales = new StringBuilder();
    for (char letra : texto) {
      if ("aeiouAEIOU".indexOf(letra) != -1) {
        vocales.append(letra);
      }
    }
    String resultado = vocales.toString();
    System.out.println("Las vocales en la frase son: " + resultado);
    System.out.println("--------------------");
  }

  // 9: Número a String y chars
  public static void ejercicio9() {
    int numero = 25;
    String numeroStr = Integer.toString(numero);
    System.out.println("Número convertido a String: " + numeroStr);

    char[] numeroChar = numeroStr.toCharArray();
    StringBuilder digitos = new StringBuilder();
    for (char digito : numeroChar) {
      digitos.append(digito);
    }
    String resultado = digitos.toString();
    System.out.println("Los dígitos del número son: " + resultado);
    System.out.println("--------------------");
  }

  // 10: Evaluar velocidades de corredores
  public static void ejercicio10() {
    double[] velocidades = {18.5, 20.0, 21.5, 19.8, 22.0, 17.5, 23.1};
    for (int i = 0; i < velocidades.length; i++) {
      double velocidad = velocidades[i];
      String mensaje = evaluarVelocidad(velocidad);
      System.out.println("Corredor " + (i + 1) + ": " + velocidad + " km/h - " + mensaje);
    }
    System.out.println("--------------------");
  }

  // Función que recibe la velocidad y devuelve un mensaje
  public static String evaluarVelocidad(double velocidad) {
    if (velocidad > 20) {
      return "Rápido";
    } else {
      return "Normal";
    }
  }
}





















