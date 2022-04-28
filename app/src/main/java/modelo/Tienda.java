package modelo;

import java.io.Serializable;

public class Tienda implements Serializable {

    private Integer Id_Tienda;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String email;
    private String foto;

    public Tienda(Integer id_Tienda, String descripcion, String direccion, String telefono, String email, String foto) {
        Id_Tienda = id_Tienda;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.foto = foto;
    }

    public Integer getId_Tienda() {
        return Id_Tienda;
    }

    public void setId_Tienda(Integer id_Tienda) {
        Id_Tienda = id_Tienda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "Id_Tienda=" + Id_Tienda +
                ", descripcion='" + descripcion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
