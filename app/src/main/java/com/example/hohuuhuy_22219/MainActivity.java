package com.example.hohuuhuy_22219;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter productAdapter;
    List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();
        productList.add(new Product("Áo Thun Nam", "120.000₫", "Chất liệu cotton co giãn 4 chiều", R.drawable.tshirt));
        productList.add(new Product("Giày Sneaker", "450.000₫", "Mẫu giày thể thao năng động", R.drawable.giay));
        productList.add(new Product("Nón Lưỡi Trai", "80.000₫", "Phù hợp cho mùa hè", R.drawable.tshirt));
        productList.add(new Product("Balo Laptop", "320.000₫", "Chống nước, ngăn rộng rãi", R.drawable.giay));
        productList.add(new Product("Áo Thun Nam", "120.000₫", "Chất liệu cotton co giãn 4 chiều", R.drawable.tshirt));
        productList.add(new Product("Giày Sneaker", "450.000₫", "Mẫu giày thể thao năng động", R.drawable.giay));
        productList.add(new Product("Nón Lưỡi Trai", "80.000₫", "Phù hợp cho mùa hè", R.drawable.tshirt));
        productList.add(new Product("Balo Laptop", "320.000₫", "Chống nước, ngăn rộng rãi", R.drawable.giay));
        productAdapter = new ProductAdapter(this, productList, new ProductClickListener() {
            @Override
            public void onProductClick(Product product) {
                Toast.makeText(MainActivity.this, "Bạn đã chọn: " + product.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(productAdapter);
    }
}
