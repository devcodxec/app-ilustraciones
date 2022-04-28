package modelo;

import java.io.Serializable;

public class Calificacion implements Serializable {

    private Integer Id_Calificacion;
    private int valor;
    private String comentario;
    private Integer Id_Tienda;
    private Integer Id_Usuario;

    public Calificacion(Integer id_Calificacion, int valor, String comentario, Integer id_Tienda, Integer id_Usuario) {
        Id_Calificacion = id_Calificacion;
        this.valor = valor;
        this.comentario = comentario;
        Id_Tienda = id_Tienda;
        Id_Usuario = id_Usuario;
    }

    public Integer getId_Calificacion() {
        return Id_Calificacion;
    }

    public void setId_Calificacion(Integer id_Calificacion) {
        Id_Calificacion = id_Calificacion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getId_Tienda() {
        return Id_Tienda;
    }

    public void setId_Tienda(Integer id_Tienda) {
        Id_Tienda = id_Tienda;
    }

    public Integer getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(Integer id_Usuario) {
        Id_Usuario = id_Usuario;
    }

    @Override
    public String toString() {
        return "Calificacion{" +
                "Id_Calificacion=" + Id_Calificacion +
                ", valor=" + valor +
                ", comentario='" + comentario + '\'' +
                ", Id_Tienda=" + Id_Tienda +
                ", Id_Usuario=" + Id_Usuario +
                '}';
    }
}
