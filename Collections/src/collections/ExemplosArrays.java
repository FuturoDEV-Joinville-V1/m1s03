package collections;

import java.util.Arrays;

public class ExemplosArrays {
  public static void main(String[] args) {
    int[] anosDeCopa = {2022, 2018, 2014, 2010, 2006, 2002};

    anosDeCopa = new int[] {2026, 2022, 2018, 2014, 2010, 2006};

    String[] carros = new String[5];
    carros[0] = "gol";
    carros[1] = "uno";
    carros[2] = "sandero";
    carros[3] = "fusca";
    carros[4] = "clio";

    System.out.println(anosDeCopa[0]);
    System.out.println(carros[carros.length - 1]);

    System.out.println(anosDeCopa);

    // for tradicional
    /*for (int i = 0; i < anosDeCopa.length; i++) {
      System.out.println(anosDeCopa[i]);
    }*/

    // for each / enhanced for
    for (int ano : anosDeCopa) {
      System.out.println(ano);
    }

    Arrays.sort(anosDeCopa);
    int index = Arrays.binarySearch(anosDeCopa, 2006);
    System.out.println("posição: " + index);

    double[] medias = new double[40];
    Arrays.fill(medias, 7.0);

    System.out.println("fim.");
  }
}
