package dao;

import Interfaces.Sesion9;
import models.Students;

import java.util.ArrayList;

public class StudentDao implements Sesion9{

    ArrayList<Students> students = new ArrayList<>();


    @Override
    public boolean store(Object object) {
        Students student = (Students) object;
        try {
            students.add(student);
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    @Override
    public void findByName(String name) {
    try {
        for (Students student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
        System.out.println("No se encontro el estudiante");
    } catch (Exception e) {
        System.out.println("Ocurrio un problema al encontrar el estudiante");
    }
    }
    
    public void showStudents(){
        for (Students student : students) {
            System.out.println(student);
        }
    }
}
