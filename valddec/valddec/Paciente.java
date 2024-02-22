package valddec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona implements Serializable {
    private String numeroSeguridadSocial;
    private List<Consulta> consultas;

    public Paciente(String nombre, String apellidos, String DNI, String telefono, String direccion, String numeroSeguridadSocial) {
        super(nombre, apellidos, DNI, telefono, direccion);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.consultas = new ArrayList<>();
    }

    // Getters y setters
    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}
