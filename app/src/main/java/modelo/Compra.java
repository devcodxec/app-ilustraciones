package modelo;

import java.io.Serializable;
import java.util.Date;

public class Compra implements Serializable {

    private Integer Id_compra;
    private Date fecha;
    private Double subtotal;
    private Double iva;
    private Double total;
    private Integer Id_Usuario;

    public Compra(Integer id_compra, Date fecha, Double subtotal, Double iva, Double total, Integer id_Usuario) {
        Id_compra = id_compra;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        Id_Usuario = id_Usuario;
    }

    public Integer getId_compra() {
        return Id_compra;
    }

    public void setId_compra(Integer id_compra) {
        Id_compra = id_compra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(Integer id_Usuario) {
        Id_Usuario = id_Usuario;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "Id_compra=" + Id_compra +
                ", fecha=" + fecha +
                ", subtotal=" + subtotal +
                ", iva=" + iva +
                ", total=" + total +
                ", Id_Usuario=" + Id_Usuario +
                '}';
    }
}
