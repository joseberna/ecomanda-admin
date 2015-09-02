package co.com.ecomandaadmin.inturik.adminecomanda.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 01/09/2015.
 */
public class ModificadorItemAnswer {
    @SerializedName("Id")
    private Integer id;

    @SerializedName("Descripcion")
    private String descripcion;

    @SerializedName("Precio")
    private Integer precio;

    public ModificadorItemAnswer(Integer id, String descripcion, Integer precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
