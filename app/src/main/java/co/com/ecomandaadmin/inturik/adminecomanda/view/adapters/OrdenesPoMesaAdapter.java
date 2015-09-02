package co.com.ecomandaadmin.inturik.adminecomanda.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import co.com.ecomandaadmin.inturik.adminecomanda.R;
import co.com.ecomandaadmin.inturik.adminecomanda.api.model.ConsultarOrdenPorMesaAnswer;
import co.com.ecomandaadmin.inturik.adminecomanda.api.model.DetalleOrdenAnswer;

/**
 * Created by user on 02/09/2015.
 */
public class OrdenesPoMesaAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private int layoutResourceId;
    private Context context;
    private List<ConsultarOrdenPorMesaAnswer> recentOrders;



    @Override
    public int getCount() {
        return recentOrders.size();
    }

    @Override
    public Object getItem(int position) {
        return recentOrders.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ConsultarOrdenPorMesaAnswer itemAnswer = (ConsultarOrdenPorMesaAnswer) recentOrders.get(position);
        ItemViewHolder viewHolder= null;
        if (convertView==null){
            inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(layoutResourceId, null, true);
            viewHolder = new ItemViewHolder();
            viewHolder.tvIdProducto = (TextView) convertView.findViewById(R.id.id_idproducto);
            viewHolder.tvNombreProducto = (TextView) convertView.findViewById(R.id.id_nombreproducto);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ItemViewHolder) convertView.getTag();
        }
viewHolder.tvIdProducto.setText(itemAnswer.getId());

        return convertView;
    }

    private static class ItemViewHolder{
        TextView tvIdProducto;
        TextView tvNombreProducto;
    }
}
