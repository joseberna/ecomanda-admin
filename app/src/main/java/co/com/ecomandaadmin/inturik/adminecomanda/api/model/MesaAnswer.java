package co.com.ecomandaadmin.inturik.adminecomanda.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 01/09/2015.
 */
public class MesaAnswer {
    @SerializedName("Id")
    private Integer id;

    @SerializedName("Nombre")
    private String nombre;

    @SerializedName("IdGrupo")
    private Integer idGrupo;

    @SerializedName("Grupo")
    private String grupo;

    @SerializedName("Imagen")
    private String imagen;

    @SerializedName("Estado")
    private String estado;

    @SerializedName("NumeroMaxClientes")
    private Integer numeroMaxClientes;

    public MesaAnswer(Integer id, String nombre, Integer idGrupo, String grupo, String imagen, String estado, Integer numeroMaxClientes) {
        this.id = id;
        this.nombre = nombre;
        this.idGrupo = idGrupo;
        this.grupo = grupo;
        this.imagen = imagen;
        this.estado = estado;
        this.numeroMaxClientes = numeroMaxClientes;
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

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNumeroMaxClientes() {
        return numeroMaxClientes;
    }

    public void setNumeroMaxClientes(Integer numeroMaxClientes) {
        this.numeroMaxClientes = numeroMaxClientes;
    }
}
