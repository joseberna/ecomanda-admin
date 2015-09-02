package co.com.ecomandaadmin.inturik.adminecomanda.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by user on 01/09/2015.
 */
public class Global {
    public static String ID_USER;

    public static double LATITUD_CURRENT;
    public static double LONGITUDE_CURRENT;

    public static double GRATIFICATION_PERCENT;
    public static double TAX_PERCENT;
    public static String RESTAURANT_NAME;
    public static String RESTAURANT_ADDRESS;
    public static String HOST;
    public static String PORT;

    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa", Locale.getDefault());
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("'$'#,###,##0.00");
}
