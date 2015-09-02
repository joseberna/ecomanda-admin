package co.com.ecomandaadmin.inturik.adminecomanda.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 01/09/2015.
 */
public class MeseroAnswer {
    @SerializedName("Id")
    private Integer id;

    @SerializedName("Nombre")
    private String nombre;

    @SerializedName("Apellido")
    private String apellido;

    @SerializedName("CodigoAcceso")
    private String codigoAcceso;

    public MeseroAnswer(Integer id, String nombre, String apellido, String codigoAcceso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoAcceso = codigoAcceso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoAcceso() {
        return codigoAcceso;
    }

    public void setCodigoAcceso(String codigoAcceso) {
        this.codigoAcceso = codigoAcceso;
    }
}
