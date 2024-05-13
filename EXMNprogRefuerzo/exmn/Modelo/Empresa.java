package exmn.Modelo;

import java.time.LocalDate;

public class Empresa
{   
    /*
     * Nombre de la empresa
• CIF: (Letra mayúscula y 10 dígitos)
• Fecha de fundación (LocalDate) 
     */

    private String nombreEmpresa;
    private String numCIF;
    private LocalDate fechaFundacion;

    public Empresa(String nombreEmpresa, String numCIF, LocalDate fechaFundacion) 
    {
        this.nombreEmpresa = nombreEmpresa;
        this.numCIF = numCIF;
        this.fechaFundacion = fechaFundacion;
    }


    public String getNombreEmpresa() 
    {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) 
    {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getnumCIF()
    {
        return numCIF;
    }

    public void setNumCIF(String numCIF) 
    {
       this.numCIF = numCIF;
    }

    public LocalDate getFechaFundacion() 
    {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) 
    {
        this.fechaFundacion = fechaFundacion;
    }


    @Override
    public String toString()
    {
        return "[Nombre de Empresa=" + nombreEmpresa + ", CIF=" + numCIF + ", Fecha de Fundacion=" + fechaFundacion + "]";
    }


}