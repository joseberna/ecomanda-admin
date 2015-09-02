package co.com.ecomandaadmin.inturik.adminecomanda.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 01/09/2015.
 */
public class ProductoOrdenDetalleAnswer {
    @SerializedName("Id")
    private Integer id;

    @SerializedName("Nombre")
    private String nombre;

    @SerializedName("IdCategoria")
    private Integer idCategoria;

    @SerializedName("IdGrupo")
    private Integer idGrupo;

    @SerializedName("PrecioUnidad")
    private Double precioUnidad;

    @SerializedName("EnStock")
    private Boolean enStock;

    @SerializedName("PlantillaModificadorID")
    private Integer plantillaModificadorID;

    @SerializedName("TieneModificadoresObligatorios")
    private Boolean tieneModificadoresObligatorios;

    public ProductoOrdenDetalleAnswer(Integer id, String nombre, Integer idCategoria, Integer idGrupo, Double precioUnidad, Boolean enStock, Integer plantillaModificadorID, Boolean tieneModificadoresObligatorios) {
        this.id = id;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.idGrupo = idGrupo;
        this.precioUnidad = precioUnidad;
        this.enStock = enStock;
        this.plantillaModificadorID = plantillaModificadorID;
        this.tieneModificadoresObligatorios = tieneModificadoresObligatorios;
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

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Boolean getEnStock() {
        return enStock;
    }

    public void setEnStock(Boolean enStock) {
        this.enStock = enStock;
    }

    public Integer getPlantillaModificadorID() {
        return plantillaModificadorID;
    }

    public void setPlantillaModificadorID(Integer plantillaModificadorID) {
        this.plantillaModificadorID = plantillaModificadorID;
    }

    public Boolean getTieneModificadoresObligatorios() {
        return tieneModificadoresObligatorios;
    }

    public void setTieneModificadoresObligatorios(Boolean tieneModificadoresObligatorios) {
        this.tieneModificadoresObligatorios = tieneModificadoresObligatorios;
    }
}
