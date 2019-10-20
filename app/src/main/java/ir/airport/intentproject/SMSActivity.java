package ir.airport.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SMSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        final EditText Dial =findViewById(R.id.edtPhone);
        final EditText SMS=findViewById(R.id.edtMSG);
        Button btnSMS=findViewById(R.id.btnSMS);

        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String SMSCall =Dial.getText().toString();
                String SMSMsg= SMS.getText().toString();
                Intent intent =new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+SMSCall));
                intent.putExtra("sms_body",SMSMsg);
                startActivity(intent);


            }
        });
    }
}
