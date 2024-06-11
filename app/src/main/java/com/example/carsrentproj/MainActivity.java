package com.example.carsrentproj;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView carTypeListView;
    private String[] carTypes = {"Economic", "Sport", "Luxury", "SUV", "MiniVan", "Convertible","Pick Up","Electric"};
    private int[] carImages = {
            R.drawable.economic, // Replace with your actual image resources
            R.drawable.sport,
            R.drawable.luxury,
            R.drawable.suv,
            R.drawable.minivan,
            R.drawable.convertible,
            R.drawable.pickup,
            R.drawable.electric
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carTypeListView = findViewById(R.id.carTypeListView);

        ListViewAdapter adapter = new ListViewAdapter(this, carTypes, carImages);

        carTypeListView.setAdapter(adapter);

        carTypeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, BrandActivity.class);
                startActivity(intent);
            }
        });
    }
}
