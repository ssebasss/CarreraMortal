import entidades.Auto;
import entidades.Rueda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      //  Rueda rueda1= new Rueda("kumo", 28.0);
        Auto auto= new Auto("rojo","ABC222");



        auto.agregarRuedas(new Rueda("kumo", 28.0));
        auto.getRuedas().add(new Rueda("michelin", 25.0));
        auto.agregarRuedas(new Rueda("pirelli", 27.0));
        auto.agregarRuedas(new Rueda("fate", 29.0));

        menu(auto);




    }


    public static void menu (  Auto auto) {
Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean salir=false;
do {
        System.out.println("~Menu de auto~");
        System.out.println("1. Avanzar.");
        System.out.println("2. Retroceder.");
        System.out.println("3. Llenar tanque.");
        System.out.println("4. Sacar Rueda.");
        System.out.println("5. Inflar.");
        System.out.println("6. Desinflar.");
        System.out.println("7. Salir");
       int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
               auto.avanzar();
                break;
            case 2:
                auto.retroceder();
                break;
            case 3:
                auto.llenarTanque();
                break;
            case 4:
                auto.sacarRueda();
                break;
            case 5:
                auto.inflarRuedasAuto();
                break;
            case 6:
                auto.desinflarRuedasAuto();
                break;
            case 7:
                salir=true;
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    } while (salir=false);

        if (salir=true){
            System.out.println("chau");
            }
    }



}