package org.efmb;


import dao.StudentDao;
import models.Students;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       StudentDao students = new StudentDao();
       Scanner sc = new Scanner(System.in);

       String menu = "1. Agregar estudiantes\n" +
               "2. Buscar estudiante\n" +
               "3. Mostrar estudiante\n" +
               "4. Salir";

       int option = 0;

       while (option != 4) {
            System.out.println(menu);
            option = sc.nextInt();
            sc.nextLine();
       }

       switch (option) {
           case 1:
               System.out.println("Nombre: ");
               String name = sc.next();
               System.out.println("Email: ");
               String email = sc.next();
               System.out.println("Edad: ");
               int age = sc.nextInt();
               Students student = new Students(name, email, age);
               students.store(student);
               break;

           case 2:
               System.out.println("Ingrese el nombre del estudiante a buscar: ");
               String nameToFind = sc.next();
               students.findByName(nameToFind);
               break;
           case 3:
               students.showStudents();
               break;
           case 4:
               System.out.println("Salir");
               break;
           default:
               System.out.println("Opcion no valida");
       }
   }
}