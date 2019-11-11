package ir.airport.intentproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShowArchiveActivity extends AppCompatActivity {

    private static final String TAG = ShowArchiveActivity.class.getSimpleName();

    private RecyclerView recyclerView;

    private Recycler_film databaseAdapter;

    private sqllitehelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_archive);
        setTitle("Add Data to Sqlite");
        recyclerView=findViewById(R.id.recyclefilmview);
        setUpRecyclerView();
        databaseHelper = new sqllitehelper(this,"FilmDB",null,1);
        List<DatabaseModel> databaseModels = databaseHelper.getFilmData();

        //populate list
        populateRecyclerViewFromSqliteDatabase(databaseModels);

    }

    private void populateRecyclerViewFromSqliteDatabase(List<DatabaseModel> databaseModels) {
        databaseAdapter = new Recycler_film(databaseModels);
        recyclerView.setAdapter(databaseAdapter);
    }

    private void setUpRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}

