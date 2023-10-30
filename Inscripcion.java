package validadorCorrelativas;

import java.time.LocalDate;


public class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha= LocalDate.now();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public boolean aprobada(){
        /*
        *¿Como sabemos si la inscripcion esta aprobada?
        * -La inscripcion está aceptada(true) si la materia NO tiene correlativas
        * -La inscripcion está aceptada (true) si la materia tiene correlativas y el alumno cumple
        * cumple con todas ellas
        */
        //TODO
        return !this.materia.tenesCorrelativas() || this.materia.puedeCursar(this.alumno);

    }

}
