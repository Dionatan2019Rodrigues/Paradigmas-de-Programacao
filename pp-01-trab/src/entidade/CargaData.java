package entidade;

import java.time.LocalDate;

public class CargaData {
    private LocalDate data;
    private double carga;

    // constructor *******************************/
    public CargaData(LocalDate data, double carga) {
        this.data = data;
        this.carga = carga;
    }
    // getter's e setter's *********************/
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    /*******************************************/
    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }

}
