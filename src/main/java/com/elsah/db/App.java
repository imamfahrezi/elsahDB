package com.elsah.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) throws IOException {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    for (;;) {
      System.out.print("elsahDB > ");
      String input = bufferedReader.readLine();
      if (input.startsWith(".")) {
        if (input.equals(".exit")) {
          break;
        } else {
          System.out.printf("Unrecognized command '%s'.\n", input);
          continue;
        }
      }

    }

  }
}
