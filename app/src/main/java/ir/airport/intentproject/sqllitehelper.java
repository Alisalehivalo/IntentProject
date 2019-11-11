package ir.airport.intentproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class sqllitehelper extends SQLiteOpenHelper {


    String TABLE_NAME = "FilmINFO";
    String Col2="Title";
    String Col3="Year";
    String Col4="Rated";
    String Col5="Released";
    String Col6="Runtime";
    String Col7="Genre";
    String Col8="Direcor";
    String Col9="Actors";
    String Col10="Plot";

    SQLiteDatabase sqLiteDatabase;
    public sqllitehelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Col2+" TEXT,"
                + Col3+" TEXT,"
                + Col4+" TEXT,"
                + Col5+" TEXT,"
                + Col6+" TEXT,"
                + Col7+" TEXT,"
                + Col8+" TEXT,"
                + Col9+" TEXT,"
                + Col10+" TEXT"
                + ")";
        db.execSQL(CREATE_TABLE_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
    public boolean insertFilm(String title, String year, String rated, String released, String runtime, String genre, String director, String actors, String plot){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Col2, title);
        contentValues.put(Col3, year);
        contentValues.put(Col4, rated);
        contentValues.put(Col5, released);
        contentValues.put(Col6, runtime);
        contentValues.put(Col7, genre);
        contentValues.put(Col8, director);
        contentValues.put(Col9, actors);
        contentValues.put(Col10, plot);

        database.insert(TABLE_NAME, null, contentValues);
        return true;
    }



    public List<DatabaseModel> getFilmData(){
        List<DatabaseModel> dic = new ArrayList<>();

        String sql = "select * from " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.moveToFirst()){
            do{
                int id = Integer.parseInt(cursor.getString(0));
                String Title = cursor.getString(1);
                String Year = cursor.getString(2);
                String Rated = cursor.getString(3);
                String Released = cursor.getString(4);
                String Runtime = cursor.getString(5);
                String Genre = cursor.getString(6);
                String Director = cursor.getString(7);
                String Actors = cursor.getString(8);
                String Plot = cursor.getString(9);

                dic.add(new DatabaseModel(id, Title, Year, Rated, Released, Runtime, Genre, Director, Actors, Plot));
            }while (cursor.moveToNext());
        }
        cursor.close();

        return dic;
    }


}
