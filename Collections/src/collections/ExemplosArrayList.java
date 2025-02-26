package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemplosArrayList {
  public static void main(String[] args) {
    ArrayList<String> nomes = new ArrayList<>();

    // List list = new ArrayList<>();

    nomes.add("Lucas");
    nomes.add("Louise");
    nomes.add("Leonardo");
    nomes.add("Anaysa");
    nomes.addFirst("Daisy");
    nomes.add(2, "Israel");

    System.out.println("Quantidade de nomes: " + nomes.size());

    for (int i = 0; i < nomes.size(); i++) {
      System.out.println(nomes.get(i));
    }

    System.out.println("----");
    nomes.remove("Lucas");
    nomes.remove(2);
    nomes.removeLast();

    nomes.addLast("Alex");
    nomes.addFirst("Alex");
    nomes.add(3, "Alex");

    for (String nome : nomes) {
      System.out.println(nome);
    }
    System.out.println("---");

    /*while (nomes.contains("Alex")) {
      nomes.remove("Alex");
      for (String nome : nomes) {
        System.out.println(nome);
      }
      System.out.println("---");
    }*/

    nomes.removeAll(List.of("Alex", "Halex", "Allex"));

    System.out.println("Lista contém Louise? " + nomes.contains("Louise"));
    for (String nome : nomes) {
      System.out.println(nome);
    }

    nomes.add("Alex");
    nomes.add("Lucas");
    nomes.add("Hallan");
    nomes.add("Allan");

    System.out.println("---");

    for (String nome : nomes) {
      System.out.println(nome);
    }
    System.out.println("---");

    System.out.println("Reverter:");

    Collections.reverse(nomes);
    for (String nome : nomes) {
      System.out.println(nome);
    }
    System.out.println("---");

    System.out.println("Maior elemento em ordem alfabética: " + Collections.max(nomes));
    System.out.println("Menor elemento em ordem alfabética: " + Collections.min(nomes));

    System.out.println("Ordenar a lista:");

    Collections.sort(nomes);

    for (String nome : nomes) {
      System.out.println(nome);
    }
  }
}
