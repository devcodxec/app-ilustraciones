package modelo;

import java.io.Serializable;

public class ItemCompra implements Serializable {

    private Integer Id_ItemCompra;
    private Integer cantidad;
    private Double precioUnitario;

    Compra compra;
    Ilustracion ilustracion;

    public ItemCompra(Integer id_ItemCompra, Integer cantidad, Double precioUnitario, Compra compra, Ilustracion ilustracion) {
        Id_ItemCompra = id_ItemCompra;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.compra = compra;
        this.ilustracion = ilustracion;
    }

    public Integer getId_ItemCompra() {
        return Id_ItemCompra;
    }

    public void setId_ItemCompra(Integer id_ItemCompra) {
        Id_ItemCompra = id_ItemCompra;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Ilustracion getIlustracion() {
        return ilustracion;
    }

    public void setIlustracion(Ilustracion ilustracion) {
        this.ilustracion = ilustracion;
    }

    @Override
    public String toString() {
        return "ItemCompra{" +
                "Id_ItemCompra=" + Id_ItemCompra +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", compra=" + compra +
                ", ilustracion=" + ilustracion +
                '}';
    }
}
