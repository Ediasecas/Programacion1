package valddec;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Consulta implements Serializable {
    private TipoConsulta tipoConsulta;
    private Doctor doctor;
    private String observaciones;
    private LocalDateTime fechaHoraConsulta;
    private int duracion; // en minutos

    public Consulta(TipoConsulta tipoConsulta, Doctor doctor, String observaciones, LocalDateTime fechaHoraConsulta, int duracion) {
        this.tipoConsulta = tipoConsulta;
        this.doctor = doctor;
        this.observaciones = observaciones;
        this.fechaHoraConsulta = fechaHoraConsulta;
        this.duracion = duracion;
    }

    // Getters y setters
    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDateTime getFechaHoraConsulta() {
        return fechaHoraConsulta;
    }

    public void setFechaHoraConsulta(LocalDateTime fechaHoraConsulta) {
        this.fechaHoraConsulta = fechaHoraConsulta;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

