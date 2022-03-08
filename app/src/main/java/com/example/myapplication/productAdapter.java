package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class productAdapter extends BaseAdapter {

    private Context context;
    private int Layout;
    private List<product> listProduct;
    private int positionSelect = -1;

    public productAdapter(Context context, int layout, List<product> listProduct) {
        this.context = context;
        this.Layout = layout;
        this.listProduct = listProduct;
    }

    @Override
    public int getCount() {
        return listProduct.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(Layout, null);

        TextView txtName = view.findViewById(R.id.textview_name);
        TextView txtNcc = view.findViewById(R.id.textview_ncc);
        ImageView imgMain = view.findViewById(R.id.imageView);

        product productItem = listProduct.get(i);

        txtName.setText(productItem.getName());
        txtNcc.setText(productItem.getNcc());
        imgMain.setImageResource(productItem.getMainImg());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, productItem.getName(), Toast.LENGTH_LONG).show();
                notifyDataSetChanged();
            }
        });
        return view;
    }
}
