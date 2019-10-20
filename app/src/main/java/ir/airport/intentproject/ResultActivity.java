package ir.airport.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final TextView txtName = findViewById(R.id.txtRName);
        final TextView txtFName = findViewById(R.id.txtRFName);
        final TextView txtCode = findViewById(R.id.txtRCode);
        final TextView txtBirth = findViewById(R.id.txtRBirth);
        Button btnEdit =findViewById(R.id.btnEdit);
        Button btnOk = findViewById(R.id.btnOk);

        Intent intent=getIntent();
        String RName = intent.getStringExtra("Name");
        String RFName = intent.getStringExtra("FName");
        String RCode = intent.getStringExtra("Code");
        String RBirth = intent.getStringExtra("Birth");
        txtName.setText(RName);
        txtFName.setText(RFName);
        txtCode.setText(RCode);
        txtBirth.setText(RBirth);
        final String Name = txtName.getText().toString();
        final String FName = txtFName.getText().toString();
        final String Code = txtCode.getText().toString();
        final String Birth = txtBirth.getText().toString();

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i =new Intent();
                i.putExtra("Name", Name);
                i.putExtra("FName", FName);
                i.putExtra("Code", Code);
                i.putExtra("Birth", Birth);
                setResult(Activity.RESULT_OK,i);
                finish();
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                PreferenceManager.getDefaultSharedPreferences(ResultActivity.this).edit().putString("Name",Name).apply();
                PreferenceManager.getDefaultSharedPreferences(ResultActivity.this).edit().putString("FName",FName).apply();
                PreferenceManager.getDefaultSharedPreferences(ResultActivity.this).edit().putString("Code",Code).apply();
                PreferenceManager.getDefaultSharedPreferences(ResultActivity.this).edit().putString("Birth",Birth).apply();
                Toast.makeText(ResultActivity.this,"Saved Information",Toast.LENGTH_SHORT).show();
                finish();;


            }
        });



    }

}
