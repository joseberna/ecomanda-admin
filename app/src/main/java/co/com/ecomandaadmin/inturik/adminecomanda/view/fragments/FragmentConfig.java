package co.com.ecomandaadmin.inturik.adminecomanda.view.fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import co.com.ecomandaadmin.inturik.adminecomanda.R;
import co.com.ecomandaadmin.inturik.adminecomanda.util.VariablesEntorno;

/**
 * Created by user on 01/09/2015.
 */
public class FragmentConfig extends Fragment {

    Context context;


    View screen;

    Button btnBuscar;
    EditText tvIPServer;
    EditText tvPortServer;
    TextView tvError;
    TextView tvSucces;

    private SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        screen = inflater.inflate(R.layout.fragment_config, container, false);

        btnBuscar = (Button) screen.findViewById(R.id.id_guardar_config);
        tvIPServer = (EditText) screen.findViewById(R.id.id_ip_server);
        tvPortServer = (EditText) screen.findViewById(R.id.id_port_server);
        tvError = (TextView) screen.findViewById(R.id.id_msj_error);
        tvSucces = (TextView) screen.findViewById(R.id.id_msj_succes);
        context = getActivity().getApplicationContext();

        sharedPreferences = context.getSharedPreferences(VariablesEntorno.MY_SHARED, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        tvError.setVisibility(View.GONE);
        tvSucces.setVisibility(View.GONE);


        loadValoresOld();

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("setOnClickListener", "Guardando configuracion...");
                editor.putString(VariablesEntorno.sh_ip, tvIPServer.getText().toString());
                editor.putString(VariablesEntorno.sh_port, tvPortServer.getText().toString());
                editor.commit();
                tvSucces.setVisibility(View.VISIBLE);

            }
        });


        return screen;

    }

    public void loadValoresOld() {
        if (sharedPreferences.contains(VariablesEntorno.sh_port)) {
            tvIPServer.setText(sharedPreferences.getString(VariablesEntorno.sh_ip, null));
        }
        if (sharedPreferences.contains(VariablesEntorno.sh_port)) {
            tvPortServer.setText(sharedPreferences.getString(VariablesEntorno.sh_port, null));
        }
    }

}
