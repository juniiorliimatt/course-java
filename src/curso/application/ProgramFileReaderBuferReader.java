package curso.application;

import java.io.*;

public class ProgramFileReaderBuferReader {
  public static void main(String[] args) {
    var lines = new String[]{"Good Morning", "Good afternoon", "Good Night"};
    String path = "c:\\tmp\\test.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
