package ir.airport.intentproject;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        final EditText edtName = findViewById(R.id.edtName);
        final EditText edtFName = findViewById(R.id.edtFName);
        final EditText edtCode = findViewById(R.id.edtCode);
        final EditText edtBirth = findViewById(R.id.edtBirth);
        Button btnReview = findViewById(R.id.btnReview);

        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = edtName.getText().toString();
                String FName = edtFName.getText().toString();
                String Code = edtCode.getText().toString();
                String Birth = edtBirth.getText().toString();
                Intent intent = new Intent(ProfileActivity.this,  ResultActivity.class);
                intent.putExtra("Name", Name);
                intent.putExtra("FName", FName);
                intent.putExtra("Code", Code);
                intent.putExtra("Birth", Birth);
                startActivityForResult(intent,150);
 }
        });


    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode == 150){
            if (resultCode == Activity.RESULT_OK){
                String Name = data.getStringExtra("Name");
                String FName = data.getStringExtra("FName");
                String Code = data.getStringExtra("Code");
                String Birth = data.getStringExtra("Birth");
                EditText edtName = findViewById(R.id.edtName);
                EditText edtFName = findViewById(R.id.edtFName);
                EditText edtCode = findViewById(R.id.edtCode);
                EditText edtBirth = findViewById(R.id.edtBirth);
                edtName.setText(Name);
                edtFName.setText(FName);
                edtCode.setText(Code);
                edtBirth.setText(Birth);

            }
        }




    }
}
