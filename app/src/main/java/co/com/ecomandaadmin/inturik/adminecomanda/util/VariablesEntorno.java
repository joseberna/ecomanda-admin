package co.com.ecomandaadmin.inturik.adminecomanda.util;

/**
 * Created by user on 01/09/2015.
 */
public class VariablesEntorno {
    public static final String URL_SERVER = "http://" + Global.HOST + ":" + Global.PORT + "/EcomandaServicios/api";//SERVICE_CONECT
    //public static final String URL_SERVER = "http://192.168.105.1:80/EcomandaServicios/api/";//SERVICE_CONECT
    public static final String WS_Mesero_ConsultarPorCodigoAcceso = "/Mesero/ConsultarPorCodigoAcceso";
    public static final String WS_Mesa_ConsultarTodas ="/Mesa/ConsultarTodas";
    public static final String WS_Categoria_ConsultarTodas ="/Categoria/ConsultarTodos";
    public static final String WS_GrupoProducto_ConsultarTodos ="/GrupoProducto/ConsultarTodos";
    public static final String WS_Producto_ConsultarTodos ="/Producto/ConsultarTodos";
    public static final String WS_Modificador_ConsultarTodosClasificados ="/Modificador/ConsultarTodosClasificados";
    public static final String WS_Configuracion_ConsultarTodosClasificados ="/Configuracion/Consultar";
    public static final String WS_Modificador_ConsultarPorProducto ="/Modificador/ConsultarPorProducto";
    public static final String WS_Orden_ConsultarPorMesa ="/Orden/ConsultarPorMesa";
    public static final String WS_Crear_Orden ="/Orden/Crear";
    public static final String WS_Crear_DetalleOrden ="/Orden/CrearDetalle";
    public static final String WS_Actualizar_Orden ="/Orden/Actualizar";
    public static final String MY_SHARED ="ADMIN-COMNADA";
    public static final String sh_ip ="SH_IP";
    public static final String sh_port ="SH_PORT";

}
