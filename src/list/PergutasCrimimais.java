package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PergutasCrimimais {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> respostas = new ArrayList<String>();

    System.out.println("Telefonou para a vítima?");
    String r = scan.next();
    respostas.add(r);
    System.out.println("Esteve no local do crime?");
    String r1 = scan.next();
    respostas.add(r1);
    System.out.println("Mora perto da vítima?");
    String r2 = scan.next();
    respostas.add(r2);
    System.out.println("Devia para a vítima?");
    String r3 = scan.next();
    respostas.add(r3);
    System.out.println("Já trabalhou com a vítima?");
    String r4 = scan.next();
    respostas.add(r4);

    Iterator<String> iterator = respostas.iterator();

    int quantidadeS = 0;
    int quantidadeN = 0;

    while (iterator.hasNext()) {
      String next = iterator.next();
      if (next.equalsIgnoreCase("s")) {
        quantidadeS++;
      } else {
        quantidadeN++;
      }
    }

    if (quantidadeS == 0) {
      System.out.println("Inocente");
    } else if (quantidadeS <= 2 && quantidadeN > 0) {
      System.out.println("Suspeita");
    } else if (quantidadeS >= 3 && quantidadeS <= 4) {
      System.out.println("Cúmplice");
    } else if (quantidadeS == 5) {
      System.out.println("Assassina");
    }
  }
}
