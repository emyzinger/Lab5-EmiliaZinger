package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    LinkedStack reverseLine = new LinkedStack();
    while (input.hasNextLine()) {
      final String line = input.nextLine();
      reverseLine.push(line);
    }
    while (!reverseLine.isEmpty()){
      System.out.println(reverseLine.pop());
    }


  }
}
