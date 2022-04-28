package modelo;

import java.io.Serializable;

public class TipoIlustracion implements Serializable {

    private Integer Id_TipoIlustracion;
    private String descripcion;

    public TipoIlustracion(Integer id_TipoIlustracion, String descripcion) {
        Id_TipoIlustracion = id_TipoIlustracion;
        this.descripcion = descripcion;
    }

    public Integer getId_TipoIlustracion() {
        return Id_TipoIlustracion;
    }

    public void setId_TipoIlustracion(Integer id_TipoIlustracion) {
        Id_TipoIlustracion = id_TipoIlustracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoIlustracion{" +
                "Id_TipoIlustracion=" + Id_TipoIlustracion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
