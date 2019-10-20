package ir.airport.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);
        final EditText edtDial =findViewById(R.id.edtDial);
        Button btnDial =findViewById(R.id.btnDial);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Dial =edtDial.getText().toString();
                if (!TextUtils.isEmpty(Dial)){

                    Intent intent =new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+Dial));
                    startActivity(intent);

                }
                else {
                    Toast.makeText(DialActivity.this,"Error:Please enter Phone Number",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
