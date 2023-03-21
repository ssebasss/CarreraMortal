package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Auto {


    private String color;
    private String patente;
    private double combustible;
    private ArrayList<Rueda> ruedas;


    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50.0;
        this.ruedas = new ArrayList<>();
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", patente='" + patente + '\'' +
                ", combustible=" + combustible +
                ", ruedas=" + ruedas +
                '}';
    }

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void agregarRuedas(Rueda rueda) {
        this.ruedas.add(rueda);
    }

/*    public void sacarRuedas() {
        System.out.println("pone la marca de rueda que queres sacar ");
        String identificador = sc.next();
        ArrayList<Rueda> ruedasAux = new ArrayList<>();
        for (Rueda x : ruedas) {
            if (!x.getMarca().equalsIgnoreCase(identificador)) {
                ruedasAux.add(x);
                System.out.println("se encontró la marca de rueda ingresada " + x.getMarca());
            }
        }
        ruedas.clear();
        ruedas.addAll(ruedasAux);

           if (ruedas.size()<4){
                System.out.println("se removio "+identificador);

               System.out.println(ruedas);
    }
    }*/


    public Rueda busqueda(){
        Rueda ElementoBuscar= null;
        System.out.println("ingrese la marca");
        String sucEncontrada=sc.next();
        int i=0;
        while (i<ruedas.size() && !ruedas.get(i).getMarca().equalsIgnoreCase(sucEncontrada)){
                i++;
        }
        if (i<ruedas.size()){
            ElementoBuscar=ruedas.get(i);
        }else System.out.println("no se halló");

        return ElementoBuscar;
    }

    public void sacarRueda(){
        Rueda rueBorrar =  busqueda();
        ruedas.remove(rueBorrar);
        System.out.println(ruedas);
    }

    public void avanzar() {
        double metrosARecorrer;
        double combustibleNecesario;
        boolean avanzo = true;
        while (ruedas.size() == 4 && avanzo != false) {
            do {
                System.out.println("pone metros a recorrer??");
                metrosARecorrer = sc.nextDouble();
                combustibleNecesario = metrosARecorrer / 10;
                this.combustible = this.combustible - combustibleNecesario;
                System.out.println("quedan unos " + this.combustible + " lt de combustible, y avanzaste " + metrosARecorrer + " metros");
                System.out.println("vas a seguir avanzando??");
                avanzo = sc.next().equalsIgnoreCase("s") ? true : false;
            } while (this.combustible > combustibleNecesario && avanzo != false);
        }
        if (ruedas.size() < 4) {
            System.out.println("no estan las 4 ruedas");
        }
    }


    public void retroceder() {
        double metrosARecorrer;
        double combustibleNecesario;
        boolean marchaAtras = true;
        while (ruedas.size() == 4 && marchaAtras != false) {
            do {
                System.out.println("pone metros a recorrer??");
                metrosARecorrer = sc.nextDouble();
                combustibleNecesario = metrosARecorrer / 10;
                this.combustible = this.combustible - combustibleNecesario;
                System.out.println("quedan unos " + this.combustible + " lt de combustible, y avanzaste " + metrosARecorrer + " metros");
                System.out.println("vas a seguir avanzando??");
                marchaAtras = sc.next().equalsIgnoreCase("s") ? true : false;
            } while (this.combustible > combustibleNecesario && marchaAtras != false);
        }
        if (ruedas.size() < 4) {
            System.out.println("no estan las 4 ruedas");
        }
    }

    public void llenarTanque() {
        System.out.println("queres llenar el tanque?");
        boolean llenar = sc.next().equalsIgnoreCase("s") ? true : false;
        if (llenar != false && combustible >= 50) {
            combustible = 50;
            System.out.println("tanque lleno, hay " + combustible);
        }
    }

    public void inflarRuedasAuto() {
        for (Rueda x : ruedas
        ) {
            x.inflarRuedas();
        }
    }

    public void desinflarRuedasAuto() {
        for (Rueda x : ruedas) {
            x.desinflarRuedas();
        }
    }




}


