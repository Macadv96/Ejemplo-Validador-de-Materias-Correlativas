package validadorCorrelativas;

import java.util.*;

public class Alumno {
    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public String getNombre() {

        return nombre;
    }

    public String getLegajo() {

        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {

        return materiasAprobadas;
    }
    public void agregrarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public boolean tenesCorrelativa(Materia materiaCorrelativa) {
        return this.materiasAprobadas.contains(materiaCorrelativa);

    }
}

