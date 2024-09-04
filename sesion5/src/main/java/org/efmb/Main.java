package org.efmb;

import models.Admision;
import models.Student;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        ArrayList<Student> students = new ArrayList<>();
        Admision admision = new Admision();
        Scanner sc = new Scanner(System.in);
        float promedio = 80;
        for(int i = 0; i<5; i++){
            System.out.println("Ingrese el valor de la promedio: ");
            promedio = sc.nextFloat();
            student.setAverage(promedio);
            admision.calSchoolarship(student);
            students.add(student);
        }
        for (Student student1 : students){
            System.out.println(student.getAverage() +""+student1.isSchoolarship() );
        }
    }
}