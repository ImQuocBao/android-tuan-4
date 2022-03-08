package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvProduct;
    ArrayList<product> arrayProduct;
    productAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();

        adapter = new productAdapter(this, R.layout.row_product, arrayProduct);
        lvProduct.setAdapter(adapter);
    }

    private void mapping() {
        lvProduct = findViewById(R.id.listview_product);
        arrayProduct = new ArrayList<>();

        arrayProduct.add(new product("Ca nấu lẩu mì mini...", "Shop Devang", R.drawable.ca_nau_lau));
        arrayProduct.add(new product("1 Kg khô gà bơ tỏi...", "LTD Food", R.drawable.ga_bo_toi));
        arrayProduct.add(new product("Xe cần cẩu đa năng", "Thế giới đồ chơi", R.drawable.xa_can_cau));
        arrayProduct.add(new product("Đồ chơi dạng mô hình", "Thế giới đồ chơi", R.drawable.do_choi_dang_mo_hinh));
        arrayProduct.add(new product("Lãnh đạo giản đơn", "Minh long book", R.drawable.lanh_dao_gian_don));
        arrayProduct.add(new product("Hiểu lòng con trẻ", "Minh long book", R.drawable.hieu_long_con_tre));
        arrayProduct.add(new product("Đỗ nam trung", "12", R.drawable.trump_1));
    }
}