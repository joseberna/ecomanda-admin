package co.com.ecomandaadmin.inturik.adminecomanda.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by user on 01/09/2015.
 */
public class DetalleOrdenAnswer {
    @SerializedName("Id")
    private Integer id;

    @SerializedName("IdOrden")
    private Integer idOrden;

    @SerializedName("Producto")
    private ProductoOrdenDetalleAnswer producto;

    @SerializedName("PrecioUnitarioProducto")
    private Double precioUnitarioProducto;

    @SerializedName("Cantidad")
    private Integer cantidad;

    @SerializedName("PrecioPorCantidad")
    private Double precioPorCantidad;

    @SerializedName("Modificadores")
    private ArrayList<ModificadorItemAnswer> modificadores;

    public DetalleOrdenAnswer(Integer id, Integer idOrden, ProductoOrdenDetalleAnswer producto, Double precioUnitarioProducto, Integer cantidad, Double precioPorCantidad, ArrayList<ModificadorItemAnswer> modificadores) {
        this.id = id;
        this.idOrden = idOrden;
        this.producto = producto;
        this.precioUnitarioProducto = precioUnitarioProducto;
        this.cantidad = cantidad;
        this.precioPorCantidad = precioPorCantidad;
        this.modificadores = modificadores;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public ProductoOrdenDetalleAnswer getProducto() {
        return producto;
    }

    public void setProducto(ProductoOrdenDetalleAnswer producto) {
        this.producto = producto;
    }

    public Double getPrecioUnitarioProducto() {
        return precioUnitarioProducto;
    }

    public void setPrecioUnitarioProducto(Double precioUnitarioProducto) {
        this.precioUnitarioProducto = precioUnitarioProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioPorCantidad() {
        return precioPorCantidad;
    }

    public void setPrecioPorCantidad(Double precioPorCantidad) {
        this.precioPorCantidad = precioPorCantidad;
    }

    public ArrayList<ModificadorItemAnswer> getModificadores() {
        return modificadores;
    }

    public void setModificadores(ArrayList<ModificadorItemAnswer> modificadores) {
        this.modificadores = modificadores;
    }
}
