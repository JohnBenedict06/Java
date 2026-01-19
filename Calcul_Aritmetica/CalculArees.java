package Calcul_Aritmetica;

import java.util.Scanner;

public class CalculArees {
  private static double area = 0;
  public static void main (String args[]){
    CalculArees programa = new CalculArees();
    programa.inici();
  }

  public void inici() {
    Scanner s = new Scanner(System.in);

    System.out.println("De quina figura vols calcular l'area?\n");
    System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");

    //recollim la dada entrada per terminal
    String figura = s.nextLine();
    //OPCIO 1: boolean exists = false;
    boolean noexisteix = false; //OPCIO 2
    //OPCIO 3: boolean noexisteix = true;

    switch (figura) {
      case "triangle":
        area = Aritmetica.triangle();
      case "quadrat":
        area = Aritmetica.quadrat();
      case "rectangle":
        area = Aritmetica.rectangle();
      case "trapezi":
        area = Aritmetica.trapezi();
      case "rombe":
        area = Aritmetica.rombe();
      case "paralelogram":
        area = Aritmetica.paralelogram();
      case "cercle":
        area = Aritmetica.cercle(s);
      default:
        noexisteix = true;
        break;
    }
     if (noexisteix){ //OPCIO 2
      System.out.println("No és cap figura de les que toquen");
    }
    else{ //OPCIO 2
      System.out.println("L'area del " + figura + " es " + area);
    }

  }
}