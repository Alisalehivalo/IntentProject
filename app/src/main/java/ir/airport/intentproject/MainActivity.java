package ir.airport.intentproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> list=new ArrayList<>();
        list.add("Profile");
        list.add("Dial");
        list.add("SMS");
        list.add("Search");
        list.add("Camera");


        Button btnMenu = findViewById(R.id.btnMenu);
        RecyclerView recycler=findViewById(R.id.recycler);
        Recycler_class adapter= new Recycler_class(list);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));



      btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawerlayout = findViewById(R.id.drawerLayout);
               drawerlayout.openDrawer(GravityCompat.START);

            }
        });


        }

    }

