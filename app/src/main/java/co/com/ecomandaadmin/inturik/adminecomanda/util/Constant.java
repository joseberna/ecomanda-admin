package co.com.ecomandaadmin.inturik.adminecomanda.util;

/**
 * Created by user on 02/09/2015.
 */
public class Constant {
    /**
     * CONSTANTES SISTEMA
     */
    /**Set the duration of the splash screen*/
    public static final long SPLASH_SCREEN_DELAY = 1500;
    /**The minimum distance to change Updates in meters*/
    public static final float MIN_DISTANCE_CHANGE_FOR_UPDATES = 30; // 30 meters
    /**The minimum time between updates in milliseconds*/
    public static final long MIN_TIME_BY_UPDATES = 60000; // 60 segundos
    /**Tiempo extra por defecto para que se ejecute el servicio mientras el usuario confirma si quire detenerlo o seguir notificando*/
    public static final long DEFAULT_TIME_WHILE_CONFIRM_STOP_SERVICE = 300000; // 5 minutos

    public static final int VERSION = 1;
    public static final int INT_NULL = -999999;

    public static final String TABLE_CATEGORY_TABLE = "M";
    public static final String TABLE_CATEGORY_BAR = "B";
    public static final String TABLE_STATE_FREE = "L";
    public static final String TABLE_STATE_BUSY = "O";

    /**Tiempo por defecto para la vibracion*/
    public static final long DEFAULT_VIBRATION_TIME = 800; // 8 milisegundos

    //Constantes para las diferentes noitificaciones generadas por el sistema
    public static final int DEFAULT_NOTIFICATION_ID = 20140427;

    public static String PREFERENCES_DEFAULT = "PREFERENCES_DEFAULT";
    public static String PREFERENCES_USERDATA = "PREFERENCES_USERDATA";
    public static String PREFERENCES_CONFIGURATION = "PREFERENCES_CONFIGURATION";

    /**
     * CONSTANTE CONEXION A SERVICIOS WEB RESTFUL
     */
    //DATOS DE PRUEBA
    public static final String HOST = "127.0.0.1";
    public static final String PORT = "80";
    public static final String PATH_WEB_SERVICES = "http://HOST:PORT/EcomandaServicios/api/SERVICE_CONECT";
    //DATOS DE PRODUCCION

    public static final String TAG = "ECOMANDA";

    /**
     * CONSTASTE DE DELAY DE PROGRESS(MIENTRAS NO RECIBA RESPUESTA DEL SERVICIO DE TAXI QUITELO EN 12 SEGUNDOS)
     */
    public static long DELAY_DISSMIS_ALEERT = 15000;
}
