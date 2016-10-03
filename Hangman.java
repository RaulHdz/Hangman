import javax.swing.JOptionPane;
import java.util.*;

public class Hangman {
  public static Random generator = new Random ();
  public static String[]palabras = new String[50];
  public static String[]elegido;
  public static String[]correcto;
  public static String[]usada = new String[26];;
  public static String E;
  public static String S;
  public static String T = "";
  public static int a = 0;
  public static int b = 0;
  public static int c = 0;
  public static int d = 0;
  public static int e = 0;
  public static void generar() {
    palabras[0] = "compass";
    palabras[1] = "websearch";
    palabras[2] = "catnip";
    palabras[3] = "stereo";
    palabras[4] = "job";
    palabras[5] = "card";
    palabras[6] = "cellphone";
    palabras[7] = "can";
    palabras[8] = "quit";
    palabras[9] = "war";
    palabras[10] = "nice";
    palabras[11] = "tongue";
    palabras[12] = "money";
    palabras[13] = "travel";
    palabras[14] = "uniform";
    palabras[15] = "reaction";
    palabras[16] = "obligation";
    palabras[17] = "equation";
    palabras[18] = "judge";
    palabras[19] = "honeymoon";
    palabras[20] = "technology";
    palabras[21] = "karate";
    palabras[22] = "laser";
    palabras[23] = "hood";
    palabras[24] = "protect";
    palabras[25] = "hound";
    palabras[26] = "notebook";
    palabras[27] = "derivate";
    palabras[28] = "divorce";
    palabras[29] = "package";
    palabras[30] = "journey";
    palabras[31] = "world";
    palabras[32] = "energy";
    palabras[33] = "force";
    palabras[34] = "jedi";
    palabras[35] = "detective";
    palabras[36] = "elementary";
    palabras[37] = "bucket";
    palabras[38] = "cone";
    palabras[39] = "cream";
    palabras[40] = "level";
    palabras[41] = "music";
    palabras[42] = "university";
    palabras[43] = "monster";
    palabras[44] = "number";
    palabras[45] = "prime";
    palabras[46] = "cousin";
    palabras[47] = "business";
    palabras[48] = "angel";
    palabras[49] = "bridge";
  }
  public static void elegir() {
    E = palabras[generator.nextInt(50)];
    elegido = new String[E.length()];
    correcto = new String[E.length()];
    for (int i = 0; i < E.length(); i++) {
      elegido[i] = Character.toString(E.charAt(i));
      correcto[i] = "_ ";
    }
    for (int i = 0; i < 26; i++) {
      usada[i] = "";
    }
  }
  public static void adivinar() {
    S = JOptionPane.showInputDialog(T + "\n" + "Enter the letter you want to guess:");
    S = S.toLowerCase();
    while (!S.equals("a") && !S.equals("b") && !S.equals("c") && !S.equals("d") && !S.equals("e") && !S.equals("f") && !S.equals("g") && !S.equals("h") && !S.equals("i") && !S.equals("j") && !S.equals("k") && !S.equals("l") && !S.equals("m") && !S.equals("n") && !S.equals("o") && !S.equals("p") && !S.equals("q") && !S.equals("r") && !S.equals("s") && !S.equals("t") && !S.equals("u") && !S.equals("v") && !S.equals("w") && !S.equals("x") && !S.equals("y") && !S.equals("z")) {
      S = JOptionPane.showInputDialog(T + "\n" + "Error! It must only be one letter! Enter the letter you want to guess:");
      S = S.toLowerCase();
    }
    a = 0;
    b = 0;
    T = "";
    e = 1;
    for (int i = 0; i < 26; i++) {
      if (S.equals(usada[i])) {
        a = 1;
        b = 1;
        i = 26;
      }
      else {
        if ((usada[i]).equals("")) {
        usada[i] = S;
        i = 26;
        }
      }
    }
    for (int i = 0; i < E.length(); i++) {
      if (S.equals(elegido[i])) {
        b = 1;
        correcto[i] = S + " ";
      }      
    }
    if (b == 0) {
      c++;
    }
    for (int i = 0; i < E.length(); i++) {
      T = T + correcto[i];
      if (correcto[i] == "_ ") {
        e = 0;
      }
    }
    if (a == 1) {
      T = T + "\n" + "This letter has already been selected: " + S;
    }
    if (a == 0) {
      T = T + "\n" + "The letter you selected was: " + S;
    }
    T = T + "\n" + "The letters you have selected are: ";
    for (int i = 0; i < 26; i++) {
      T = T + usada[i] + " ";
    }
  }
  public static void dibujo() {
    switch ( c ) {
      case 0:
        T = T + "\n" + "___" + "\n" + "|     |" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|";
        break;
      case 1:
        T = T + "\n" + "___" + "\n" + "|     |" + "\n" + "|    O" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|";
        break;
      case 2:
        T = T + "\n" + "___" + "\n" + "|     |" + "\n" + "|    O" + "\n" + "|     |" + "\n" + "|     |" + "\n" + "|" + "\n" + "|" + "\n" + "|";
        break;
      case 3:
        T = T + "\n" + "___" + "\n" + "|     |" + "\n" + "|    O" + "\n" + "| ---|" + "\n" + "|     |" + "\n" + "|" + "\n" + "|" + "\n" + "|";
        break;
      case 4:
        T = T + "\n" + "___" + "\n" + "|     |" + "\n" + "|    O" + "\n" + "| ---|---" + "\n" + "|     |" + "\n" + "|" + "\n" + "|" + "\n" + "|";
        break;
      case 5:
        T = T + "\n" + "___" + "\n" + "|     |" + "\n" + "|    O" + "\n" + "| ---|---" + "\n" + "|     |" + "\n" + "|    ^" + "\n" + "|" + "\n" + "|";
        break;
      case 6:
        T = T + "\n" + "___" + "\n" + "|     |" + "\n" + "|    O" + "\n" + "| ---|---" + "\n" + "|     |" + "\n" + "|    ^" + "\n" + "|   /" + "\n" + "|";
        break;
      case 7:
        T = T + "\n" + "___" + "\n" + "|     |" + "\n" + "|    O" + "\n" + "| ---|---" + "\n" + "|     |" + "\n" + "|    ^" + "\n" + "|   /  \\" + "\n" + "|" + "\n" + "YOU LOSE! The word was: " + E;
    }
  }
  public static void tachas() {
    switch ( c ) {
      case 0:
        T = T + "\n" + "O O O O O O O";
        break;
      case 1:
        T = T + "\n" + "X O O O O O O";
        break;
      case 2:
        T = T + "\n" + "X X O O O O O";
        break;
      case 3:
        T = T + "\n" + "X X X O O O O";
        break;
      case 4:
        T = T + "\n" + "X X X X O O O";
        break;
      case 5:
        T = T + "\n" + "X X X X X O O";
        break;
      case 6:
        T = T + "\n" + "X X X X X X O";
        break;
      case 7:
        T = T + "\n" + "X X X X X X X" + "\n" + "YOU LOSE! The word was: " + E;
    }
  }
  public static void main(String[] args) {
    S = JOptionPane.showInputDialog("Do you want to include graphics or not? (0 = No, 1 = Yes)");
    d = Integer.parseInt(S);
    while (d != 0 && d != 1) {
      S = JOptionPane.showInputDialog("Error! Only accepts 0 or 1! Please enter 0 for No and 1 for Yes:");
      d = Integer.parseInt(S);
    }
    generar();
    elegir();
    while (c != 7 && e != 1) {
      adivinar();
      if (d == 0) {
        tachas();
      }
      else {
        dibujo();
      }
    }
    if (e == 1) {
      JOptionPane.showMessageDialog(null, T + "\n" + "YOU WIN!", "VICTORY", JOptionPane.PLAIN_MESSAGE);
    }
    else {
      JOptionPane.showMessageDialog(null, T, "FAILURE", JOptionPane.PLAIN_MESSAGE);
    }
  }
}