package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactRecView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactRecView = findViewById(R.id.contactsRecView);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("pharmacy", R.drawable.pharmacy));
        products.add(new Product("registry", R.drawable.registry));
        products.add(new Product("cartwheel", R.drawable.cartwheel));
        products.add(new Product("clothing", R.drawable.clothing));
        products.add(new Product("shoes", R.drawable.shoes));
        products.add(new Product("accessories", R.drawable.accessories));
        products.add(new Product("baby", R.drawable.baby));
        products.add(new Product("home", R.drawable.home));
        products.add(new Product("patio & garden", R.drawable.patio_garden));
        products.add(new Product("pharmacy", R.drawable.pharmacy));
        products.add(new Product("registry", R.drawable.registry));
        products.add(new Product("cartwheel", R.drawable.cartwheel));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this);
        adapter.setProducts(products);
        contactRecView.setAdapter(adapter);
        contactRecView.setLayoutManager(new GridLayoutManager(this, 3));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_item_one) {

            // Do something
            return true;
        }
        if (id == R.id.action_item_two) {

            // Do something
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}