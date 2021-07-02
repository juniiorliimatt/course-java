package curso.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramEleicao {
  public static void main(String[] args) {
    Map<String, Integer> votes = new HashMap<>();
    var sc = new Scanner(System.in);

    System.out.print("Enter file full path: ");
    try (var br = new BufferedReader(new FileReader(sc.nextLine()))) {
      String line = null;

      while ((line = br.readLine()) != null) {
        var field = line.split(",");
        var name = field[0];
        var count = Integer.parseInt(field[1]);

        if (votes.containsKey(name)) {
          var votesSoFar = votes.get(name);
          votes.put(name, count + votesSoFar);
        } else {
          votes.put(name, count);
        }
      }
      for (String key : votes.keySet()) {
        System.out.println(key + ": " + votes.get(key));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
