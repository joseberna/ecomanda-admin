package co.com.ecomandaadmin.inturik.adminecomanda.util;

import android.app.Application;
import android.content.res.Configuration;

import co.com.ecomandaadmin.inturik.adminecomanda.api.server.Server;

/**
 * Created by user on 01/09/2015.
 */
public class AdminEcomandaApplication extends Application {

    private static AdminEcomandaApplication singleton;

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        singleton = this;
        try {
            /*TODO: Inicializar Server
            * */
            Server.getInstance(this).init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AdminEcomandaApplication getAdminEcomandaApplication() {
        return singleton;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        // TODO Auto-generated method stub
        super.onConfigurationChanged(newConfig);
    }

}
