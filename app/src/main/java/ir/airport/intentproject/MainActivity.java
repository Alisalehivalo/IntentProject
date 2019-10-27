package ir.airport.intentproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnProf = findViewById(R.id.btnprofile);
        Button btnDial = findViewById(R.id.btndial);
        Button btnSms = findViewById(R.id.btnSms);
        Button btnMenu = findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawerlayout = findViewById(R.id.drawerLayout);
                drawerlayout.openDrawer(GravityCompat.START);

            }
        });
        btnProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Profile Button Clicked!",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(i);
            }

        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Dial Button Clicked!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DialActivity.class);
                startActivity(intent);
            }
        });

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"SMS Button Clicked!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SMSActivity.class);
                startActivity(intent);
            }
        });

    }
}
