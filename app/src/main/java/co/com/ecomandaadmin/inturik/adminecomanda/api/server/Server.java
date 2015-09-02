package co.com.ecomandaadmin.inturik.adminecomanda.api.server;

import android.content.Context;
import android.content.SharedPreferences;

import co.com.ecomandaadmin.inturik.adminecomanda.util.Constant;
import co.com.ecomandaadmin.inturik.adminecomanda.util.Global;
import co.com.ecomandaadmin.inturik.adminecomanda.util.VariablesEntorno;
import retrofit.RestAdapter;

/**
 * Created by user on 01/09/2015.
 */
public class Server {
    private static Server instance;
    private IServer facade;
    private static Context context;
    private static SharedPreferences sharedPreferences;

    protected Server() {
    }

    public static Server getInstance(Context cont) {
        if (instance == null) {
            instance = new Server();
        }
        context = cont;
        sharedPreferences = context.getSharedPreferences(VariablesEntorno.MY_SHARED, Context.MODE_PRIVATE);
        return instance;
    }

    public void init() {

        Global.HOST = sharedPreferences.getString(VariablesEntorno.sh_ip, Constant.HOST);
        Global.PORT = sharedPreferences.getString(VariablesEntorno.sh_port, Constant.PORT);

//        Gson gson = new GsonBuilder()
//                .registerTypeAdapterFactory((TypeAdapterFactory) new CleanGsonConverter(new Gson())) // This is the important line ;)
//                .create();


        RestAdapter AdapterWithHeaders = new RestAdapter.Builder()
                .setEndpoint(VariablesEntorno.URL_SERVER)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                        //.setConverter(new CleanGsonConverter(gson))
                .build();
        facade = AdapterWithHeaders.create(IServer.class);
    }

    public static IServer getSingleton() {
        return getInstance(context).facade;
    }
}
