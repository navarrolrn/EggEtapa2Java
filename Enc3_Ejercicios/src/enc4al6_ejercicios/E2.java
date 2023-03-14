/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundoo;

/**
 *
 * @author bruno
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
  for (int j = 0; j <= 9; j++) {
    for (int k = 0; k <= 9; k++) {
      String digit1 = (String.valueOf(i).equals("3")) ? "E" : String.valueOf(i);
      String digit2 = (String.valueOf(j).equals("3")) ? "E" : String.valueOf(j);
      String digit3 = (String.valueOf(k).equals("3")) ? "E" : String.valueOf(k);
      System.out.println(digit1 + "-" + digit2 + "-" + digit3);
    }
  }
}

    }
    
}
