package ejer8;

public class Alumno {

    private String nombre;
    private String edad;
    private String curso;
    private Float nota;

    public Alumno(String nombre, String edad, String curso, String nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.nota = Float.parseFloat(nota);
    }

    public Alumno(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                '}';
    }
}
