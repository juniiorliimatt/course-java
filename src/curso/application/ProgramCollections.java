package curso.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgramCollections {
  public static void main(String[] args) {
    long quantidades = 10000000;
    long cont = 0;

    Set<String> set = new HashSet<>();
    var tempo = System.currentTimeMillis();
    for (var i = 0; i < quantidades; i++) {
      set.add("" + i);
    }
    tempo = ((System.currentTimeMillis()) - tempo) / 1000;
    var t = "" + tempo + " segundos";
    System.out.println(t);

    tempo = System.currentTimeMillis();
    for (String s : set) {
      cont++;
    }
    tempo = ((System.currentTimeMillis()) - tempo) / 1000;
    t = "" + tempo + " segundos";
    System.out.println(t);
    System.out.println("Contagem: " + cont);


    cont = 0;
    List<String> list = new ArrayList<>();
    tempo = System.currentTimeMillis();
    for (var i = 0; i < quantidades; i++) {
      list.add("" + i);
    }
    tempo = ((System.currentTimeMillis()) - tempo) / 1000;
    t = "" + tempo + " segundos";
    System.out.println(t);

    tempo = System.currentTimeMillis();
    for (String s : list) {
      cont++;
    }
    tempo = ((System.currentTimeMillis()) - tempo) / 1000;
    t = "" + tempo + " segundos";
    System.out.println(t);
    System.out.println("Contagem: " + cont);
  }
}
