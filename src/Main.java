//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
// In questa classe avere i metodi pubblici per ottenere le informazioni.
// Creare un ArrayList con 12 elementi e stamparlo in console.
// Mettere in ordine la collezione e stampare il risultato

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Creazione di un ArrayList di Student
        ArrayList<Student> studentList = new ArrayList<>();

        // Aggiungere 12 elementi alla collezione
        studentList.add(new Student("Alice", 20));
        studentList.add(new Student("Bob", 22));
        studentList.add(new Student("Charlie", 21));
        studentList.add(new Student("David", 19));
        studentList.add(new Student("Emily", 23));
        studentList.add(new Student("Frank", 18));
        studentList.add(new Student("Grace", 24));
        studentList.add(new Student("Hannah", 20));
        studentList.add(new Student("Isaac", 22));
        studentList.add(new Student("Julia", 21));
        studentList.add(new Student("Kevin", 19));
        studentList.add(new Student("Linda", 23));

        // Stampare la collezione iniziale in console
        System.out.println("Collezione iniziale:");
        printStudentList(studentList);

        // Mettere in ordine la collezione
        Collections.sort(studentList, Comparator.comparing(Student::getName));

        // Stampare il risultato ordinato in console
        System.out.println("\nCollezione ordinata:");
        printStudentList(studentList);
    }

    // Metodo per stampare la lista di studenti
    public static void printStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
    }
}