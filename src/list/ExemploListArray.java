package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ExemploListArray
 */
public class ExemploListArray {

  public static void main(String[] args) {
    List<Double> notas = new ArrayList<>(Arrays.asList(7.0, 8.5, 9.3, 5d, 7d, 0d, 3.6));

    System.out.println("lista completa: " + notas);
    System.out.println("Posicao de um item: " + notas.indexOf(5d));

    System.out.println("Adicioen na lista a note 8.0 na posocao 4: ");

    notas.add(4, 8d);
    System.out.println(notas);

    System.out.println("Substiua a nota 5.0 pela nonta 6.0: ");
    notas.set(notas.indexOf(5d), 6.0);
    System.out.println(notas);

    System.out.println("Confia se a nota 5.0 esta na lista: " + notas.contains(5d));
    System.out.println("Exibe todas as notas na ordem em que foram informados: ");
    System.out.println(notas);

    System.out.println("Exiva a terceira nota adicionada: " + notas.get(2));
    System.out.println(notas.toString());

    System.out.println("Exiba a menor nota: " + Collections.min(notas));
    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    System.out.println("Exiba a soma dos valores: ");
    Iterator<Double> iterator = notas.iterator();

    Double soma = 0d;
    while (iterator.hasNext()) {
      Double next = iterator.next();
      soma += next;
    }
    System.out.println(soma);

    System.out.println("Exiba a madia da notas: " + (soma / notas.size()));

    System.out.println("remova a nota 0: ");
    notas.remove(0d);
    System.out.println(notas);

    System.out.println("remova a nota da posicao 0: ");
    notas.remove(0);
    System.out.println(notas);

    // System.out.println("remova as notas menores que 7: ");
    // Iterator<Double> iterator1 = notas.iterator();
    // while (iterator1.hasNext()) {
    // double next = iterator.next();
    // if (next < 7) {
    // iterator1.remove();
    // }
    // }
    // System.out.println(notas);

    System.out.println("Apaga toda a lista: ");
    notas.clear();
    System.out.println(notas);

    System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());

    System.out.println("Usando LinkedList");
    LinkedList<Double> notasLinkedList = new LinkedList<Double>(Arrays.asList(7.0, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(notasLinkedList);

    Double str = notasLinkedList.listIterator(1).previous();
    System.out.println(str);
  }
}