package ir.airport.intentproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;


public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Button btnSearch=findViewById(R.id.btnSearch);
        final EditText edtSearch = findViewById(R.id.edtSearch);
        final TextView title=findViewById(R.id.txtTitle);
        final TextView year=findViewById(R.id.txtYear);
        final TextView rated=findViewById(R.id.txtRated);
        final TextView releas=findViewById(R.id.txtReleased);
        final TextView run=findViewById(R.id.txtRuntime);
        final TextView genre=findViewById(R.id.txtGenre);
        final TextView direc=findViewById(R.id.txtDirector);
        final TextView actor=findViewById(R.id.txtActors);
        final TextView plot=findViewById(R.id.txtPlot);


        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final String searchFilm=edtSearch.getText().toString();

                AsyncHttpClient client = new AsyncHttpClient();
                client.get("http://www.omdbapi.com/?apikey=98869092&t="+searchFilm, new JsonHttpResponseHandler() {

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        super.onSuccess(statusCode, headers, response);

                        try {
                            String titl=response.getString("Title");
                            title.setText(titl);
                            String yer=response.getString("Year");
                            year.setText(yer);
                            String rat=response.getString("Rated");
                            rated.setText(rat);
                            String rel=response.getString("Released");
                            releas.setText(rel);
                            String runt=response.getString("Runtime");
                            run.setText(runt);
                            String genr=response.getString("Genre");
                            genre.setText(genr);
                            String dir=response.getString("Director");
                           direc.setText(dir);
                            String actr=response.getString("Actors");
                           actor.setText(actr);
                            String plt=response.getString("Plot");
                            plot.setText(plt);

                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }



                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                        super.onFailure(statusCode, headers, throwable, errorResponse);
                        System.out.println(throwable.getMessage());
                    }
                });
            }
        });

    }
}
