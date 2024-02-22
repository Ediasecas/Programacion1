package valddec;

import java.io.Serializable;

public class Doctor extends Persona implements Serializable {
    private String numeroColegiado;
    private TipoConsulta tipoConsulta;

    public Doctor(String nombre, String apellidos, String DNI, String telefono, String direccion, String numeroColegiado, TipoConsulta tipoConsulta) {
        super(nombre, apellidos, DNI, telefono, direccion);
        this.numeroColegiado = numeroColegiado;
        this.tipoConsulta = tipoConsulta;
    }

    // Getters y setters
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
}

