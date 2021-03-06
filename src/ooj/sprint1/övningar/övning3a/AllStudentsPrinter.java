package ooj.sprint1.övningar.övning3a;

import java.util.ArrayList;
import java.util.List;


public class AllStudentsPrinter {
    
    AllStudentsPrinter(){
        Student Anna = new Student("Anna", "8003021234");
        Student Tolvan = new Student("Tolvan", "1212121212");
        Student Pelle = new Student("Pelle", "8512159876");

        Student[] allstudents = new Student[10];
        allstudents[0] = Anna;
        allstudents[1] = Tolvan;
        allstudents[2] = Pelle;

        Lärare Sigrun = new Lärare("Sigrun", "");

        Kurs OOPJava = new Kurs("Objektorientering och Java");

        OOPJava.läggTillStudent(Anna);
        OOPJava.läggTillStudent(Tolvan);
        OOPJava.läggTillStudent(Pelle);
        OOPJava.läggTillLärare(Sigrun);

        Kurs Backend = new Kurs("Backend");

        Backend.läggTillStudent(Anna);
        Backend.läggTillStudent(Tolvan);
        Backend.läggTillLärare(Sigrun);

        Anna.läggTillKurs(OOPJava);
        Tolvan.läggTillKurs(OOPJava);
        Pelle.läggTillKurs(OOPJava);

        Anna.läggTillKurs(Backend);
        Tolvan.läggTillKurs(Backend);

        printStudents(allstudents);
    }

    public void printStudents(Student[] allstudents){
        
        for (Student s : allstudents){
            if (s != null) {
                System.out.println("Student: " + s.getNamn());
                for (Kurs k : s.getAllaKurser()) {
                    if (k != null) {
                        System.out.println("Kurs: " + k.getNamn());
                    }
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        AllStudentsPrinter sp = new AllStudentsPrinter();
    }

}
