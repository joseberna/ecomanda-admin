package co.com.ecomandaadmin.inturik.adminecomanda.view.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import co.com.ecomandaadmin.inturik.adminecomanda.R;
import co.com.ecomandaadmin.inturik.adminecomanda.api.model.ConsultarOrdenPorMesaAnswer;
import co.com.ecomandaadmin.inturik.adminecomanda.api.server.Server;
import co.com.ecomandaadmin.inturik.adminecomanda.view.adapters.DetalleOrdenAdapter;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by user on 02/09/2015.
 */
public class FragmentOrdenesPorMesas extends Fragment implements SwipeRefreshLayout.OnRefreshListener {
    Context context;

    SwipeRefreshLayout swipeRefreshLayout;
    View screen;
    ListView listView;
    Button btnBuscar;
    EditText tvNumeroMesa;
    TextView tvError;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        screen = inflater.inflate(R.layout.fragment_home, container, false);
        listView = (ListView) screen.findViewById(R.id.id_list_ordenes);
        btnBuscar = (Button) screen.findViewById(R.id.id_boton);
        tvNumeroMesa = (EditText) screen.findViewById(R.id.id_nummesa);
        tvError = (TextView) screen.findViewById(R.id.id_text_error);

        context = getActivity().getApplicationContext();


        swipeRefreshLayout = (SwipeRefreshLayout) screen.findViewById(R.id.lySwipeRefreshHome);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_orange_dark,
                android.R.color.holo_green_dark, android.R.color.holo_orange_dark,
                android.R.color.holo_green_dark);
        swipeRefreshLayout.setSize(SwipeRefreshLayout.LARGE);
        swipeRefreshLayout.setProgressBackgroundColor(android.R.color.transparent);
        swipeRefreshLayout.setProgressViewEndTarget(false, 800);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("setOnClickListener", "Consultando...");
                buscarOrdenesPorMesa();
            }
        });


        return screen;

    }

    public void buscarOrdenesPorMesa() {
        Server.getSingleton().ConsultarOrdenPorMesa(Integer.parseInt(tvNumeroMesa.getText().toString()), new Callback<ConsultarOrdenPorMesaAnswer>() {
            @Override
            public void success(ConsultarOrdenPorMesaAnswer consultarOrdenPorMesaAnswer, Response response) {
                listView.setVisibility(View.VISIBLE);
                tvError.setVisibility(View.GONE);
                DetalleOrdenAdapter adapter = new DetalleOrdenAdapter(context, consultarOrdenPorMesaAnswer.getDetalleOrden(), R.layout.item_list_ordenpormesa);
                listView.setAdapter(adapter);
            }

            @Override
            public void failure(RetrofitError error) {
                listView.setVisibility(View.GONE);
                tvError.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void onRefresh() {
        (new android.os.Handler()).postDelayed(new Runnable() {
            @Override
            public void run() {
                //metodo recargar
                swipeRefreshLayout.setRefreshing(false);

            }
        }, 3000);
    }
}


