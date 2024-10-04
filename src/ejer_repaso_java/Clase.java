package ejer_repaso_java;

import java.util.ArrayList;

public class Clase {

    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Pablo", 14,9));
        estudiantes.add(new Estudiante("Carla", 13,10));
        estudiantes.add(new Estudiante("Juan", 14,8));
        estudiantes.add(new Estudiante("Paula", 13,7.5));
        estudiantes.add(new Estudiante("Lola", 14,8.8));

        //Mostrar todos los estudiantes
        for (Estudiante estudiante:estudiantes){
            System.out.println(estudiante);
        }

        //Eliminar por nombre
        int i = 0;
        boolean found = false;
        while(i < estudiantes.size() && !found){
            if (estudiantes.get(i).getName().equals("Juan")){
                estudiantes.remove(i);
            }
            i++;
        }

        //Calcular y mostrar la nota media
        double notaTotal = 0;
        for(Estudiante estudiante:estudiantes){
            notaTotal += estudiante.getFinalMark();
            System.out.println(notaTotal);
        }

        System.out.println("La nota media es: " + notaTotal/(estudiantes.size())+1);

        //Calcular estudiante con mejor nota
        Estudiante bestStudent = new Estudiante ();
        for (Estudiante estudiante: estudiantes){
            if (estudiante.getFinalMark() > bestStudent.getFinalMark()){
                bestStudent = estudiante;
            }
        }

        System.out.println("El mejor estudiante es: " + bestStudent);

    }


}
