package edu.ejercicios.Listas;

import java.util.Scanner;

import java.util.Scanner;

    public class lista {
    public Nodo primero;

    public lista (){
        primero = null;
    }

    private String leerNombre (){
        System.out.println("Ingrese el nombre, escriba 'fin' para terminar");
        return new Scanner(System.in).nextLine();
    }

    public lista crearLista(){
        String nombre;
        primero = null;
        do {
            nombre = leerNombre();
            if (!nombre.equals("fin")){
                primero = new Nodo(nombre, primero);
            }
        } while (!nombre.equals("fin"));
        return this;
    }

    public lista insertarCabezaLista (String entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public void visualizar (){
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.println (n.dato + " ");
            n=n.enlace;
            k++;
            System.out.print((k%15!=0 ? " " : "\n"));
        }
    }
}

/*
public class Lista {
    //declarar variable de primer nodo
    public clsNodo primero;

    public Lista() {
        primero = null;
    }

    private int leerEntero() {
        System.out.println("Ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
        public Lista crearLista() {
            int x = 0;
            primero = null;
            do {
                x = leerEntero();
                if (x != -1){
                    primero = new clsNodo(x,primero);
                }
            } while (x!= -1);
            return this;
        }
        public Lista insertarCabezaLista (int entrada){
        clsNodo nuevo;
        nuevo= new clsNodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
        }
        public void visualizar(){
        clsNodo n;
        int k= 0;
        n= primero;
        while(n !=null){
            System.out.println(n.dato + " ");
            n=n.enlace;
            k++;
            //cada 15 elementos hace un salto de linea para imprimir
            System.out.print(k%15!=0 ? " ": "\n");
        }
        }

    }

*/
