import org.w3c.dom.ls.LSOutput;

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
      System.out.println("--------------------" );

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

        System.out.println("--------------------" );


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


      System.out.println("------------");
    }



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

          System.out.println("--------------------" );

        }
    }


    //5:

  public class ejecuccionTime {
      public static void main(double[] args) {
        double[] milisec={0.001,0.002,0.003,0.004,0.005};
        for (double time:milisec){
          if(time<0.005){
            System.out.println("La ejecucion fue rapida:" + time + "milisegundos");

          }else{
            System.out.println("La ejecucion fue lenta:" + time + "milisegundos");


        }
      }
  }

  //6:

    public class teamPoints {
      public static void main(int[]args){
      int[]points={10,20,30,40,50,60,70,80,90,100};

      int total = 0;
      for(int point:points){
        total += point;
      };

        //Se calcula la media:
        double media = (double) total/points.length;
        System.out.println("La media de puntos es: " + media);
        System.out.println("El total de puntos es: " + total);


        System.out.println("--------------------");
      };



    }

    //7:

    public class radiationLevels {
        public static void main(double[]args){
          double[] superioresA50= new double[11];
          int indice = 0;
          double[]radiation= {15.2,17.8,20.3,22.5,25.0,30.1,40.2,45.3,50.0,55.2,60.5};
          for (double level:radiation){
            if (level>50.0){
              superioresA50[indice]=level;
              indice++;
            }

          };

          System.out.println("Los niveles de radiacion superiores a 50 son" + superioresA50.length);

        };

    };


    //8:
    public class extractVowels {
      public static void main(String[]args) {
        String frase = "La verdad es que estos ejercicios me cuecen";
        char[] texto = frase.toCharArray();
        StringBuilder vocales = new StringBuilder();
        for (char letra : texto) {
          if ("aeiouAEIOU".indexOf(letra) != -1) {
            vocales.append(letra);
          }
          ;

          String resultado = vocales.toString();

          System.out.println("Las vocales en la frase son: " + resultado);

          System.out.println("--------------------");

        };
      };

      //9:

      public class countDigits {
      public static void main(String[]args) {

        int numero = 25;
        String numeroStr = Integer.toString(numero);
        System.out.println(numeroStr);

        char[] numeroChar = numeroStr.toCharArray();

        StringBuilder digitos = new StringBuilder();
        for (char digito : numeroChar) {
          digitos.append(digito);

        }
        ;
        String resultado = digitos.toString();
        System.out.println("Los digitos del num son : " + resultado);


        System.out.println("--------------------");
























