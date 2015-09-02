package co.com.ecomandaadmin.inturik.adminecomanda.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by user on 01/09/2015.
 */
public class ConsultarOrdenPorMesaAnswer {
    @SerializedName("Id")
    private Integer id;

    @SerializedName("Fecha")
    private String fecha;

    @SerializedName("Mesero")
    private MeseroAnswer mesero;

    @SerializedName("Mesa")
    private MesaAnswer mesa;

    @SerializedName("IdEstado")
    private String idEstado;

    @SerializedName("CantidadDebida")
    private Double cantidadDebida;

    @SerializedName("SubTotal")
    private Double subTotal;

    @SerializedName("PorcentajePropina")
    private Integer porcentajePropina;

    @SerializedName("Impuesto")
    private Integer impuesto;

    @SerializedName("TotalImpuestoPagar")
    private Integer totalImpuestoPagar;

    @SerializedName("DetalleOrden")
    private ArrayList<DetalleOrdenAnswer> detalleOrden;

    public ConsultarOrdenPorMesaAnswer(Integer id, String fecha, MeseroAnswer mesero, MesaAnswer mesa, String idEstado, Double cantidadDebida, Double subTotal, Integer porcentajePropina, Integer impuesto, Integer totalImpuestoPagar, ArrayList<DetalleOrdenAnswer> detalleOrden) {
        this.id = id;
        this.fecha = fecha;
        this.mesero = mesero;
        this.mesa = mesa;
        this.idEstado = idEstado;
        this.cantidadDebida = cantidadDebida;
        this.subTotal = subTotal;
        this.porcentajePropina = porcentajePropina;
        this.impuesto = impuesto;
        this.totalImpuestoPagar = totalImpuestoPagar;
        this.detalleOrden = detalleOrden;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public MeseroAnswer getMesero() {
        return mesero;
    }

    public void setMesero(MeseroAnswer mesero) {
        this.mesero = mesero;
    }

    public MesaAnswer getMesa() {
        return mesa;
    }

    public void setMesa(MesaAnswer mesa) {
        this.mesa = mesa;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public Double getCantidadDebida() {
        return cantidadDebida;
    }

    public void setCantidadDebida(Double cantidadDebida) {
        this.cantidadDebida = cantidadDebida;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Integer getPorcentajePropina() {
        return porcentajePropina;
    }

    public void setPorcentajePropina(Integer porcentajePropina) {
        this.porcentajePropina = porcentajePropina;
    }

    public Integer getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Integer impuesto) {
        this.impuesto = impuesto;
    }

    public Integer getTotalImpuestoPagar() {
        return totalImpuestoPagar;
    }

    public void setTotalImpuestoPagar(Integer totalImpuestoPagar) {
        this.totalImpuestoPagar = totalImpuestoPagar;
    }

    public ArrayList<DetalleOrdenAnswer> getDetalleOrden() {
        return detalleOrden;
    }

    public void setDetalleOrden(ArrayList<DetalleOrdenAnswer> detalleOrden) {
        this.detalleOrden = detalleOrden;
    }
}
