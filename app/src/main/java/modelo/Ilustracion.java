package modelo;

import java.io.Serializable;

public class Ilustracion implements Serializable {

    private Integer Id_Ilustracion;
    private String nombre;
    private String descripcion;
    private Double precio;
    private String foto;
    Tienda tienda;
    TipoIlustracion tipoIlustracion;

    public Ilustracion(Integer id_Ilustracion,  String nombre, String descripcion, Double precio, String foto, Tienda tienda, TipoIlustracion tipoIlustracion) {
        Id_Ilustracion = id_Ilustracion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.foto = foto;
        this.tienda = tienda;
        this.tipoIlustracion = tipoIlustracion;
    }

    public Integer getId_Ilustracion() {
        return Id_Ilustracion;
    }

    public void setId_Ilustracion(Integer id_Ilustracion) {
        Id_Ilustracion = id_Ilustracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public TipoIlustracion getTipoIlustracion() {
        return tipoIlustracion;
    }

    public void setTipoIlustracion(TipoIlustracion tipoIlustracion) {
        this.tipoIlustracion = tipoIlustracion;
    }

    @Override
    public String toString() {
        return "Ilustracion{" +
                "Id_Ilustracion=" + Id_Ilustracion +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", foto='" + foto + '\'' +
                ", tienda=" + tienda +
                ", tipoIlustracion=" + tipoIlustracion +
                '}';
    }
}
