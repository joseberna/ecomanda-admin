package co.com.ecomandaadmin.inturik.adminecomanda.api.server;


import co.com.ecomandaadmin.inturik.adminecomanda.api.model.ConsultarOrdenPorMesaAnswer;
import co.com.ecomandaadmin.inturik.adminecomanda.util.VariablesEntorno;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * Created by user on 01/09/2015.
 */
public interface IServer {

    @Headers({"Content-Type: application/json"})
    @GET(VariablesEntorno.WS_Orden_ConsultarPorMesa)
    void ConsultarOrdenPorMesa(@Query("idMesa") int idMesa, Callback<ConsultarOrdenPorMesaAnswer> resp);


}
