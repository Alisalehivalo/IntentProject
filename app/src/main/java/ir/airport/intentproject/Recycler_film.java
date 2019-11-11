package ir.airport.intentproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recycler_film extends RecyclerView.Adapter<Recycler_film.RecyclerviewHolder> {

    String TAG = Recycler_film.class.getSimpleName();

    private List<DatabaseModel> databaseModels;


    public Recycler_film(List<DatabaseModel> databaseModels) {
        this.databaseModels = databaseModels;
    }

    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.film_item,parent,false);
        RecyclerviewHolder holder=new RecyclerviewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder holder, int position) {
        DatabaseModel model = databaseModels.get(position);

        holder.txtTitle.setText(model.gettitle());
        holder.txtYear.setText(model.getyear());
        holder.txtRated.setText(model.getrated());
        holder.txtReleas.setText(model.getrelease());
        holder.txtRun.setText(model.getrun());
        holder.txtGen.setText(model.getgenre());
        holder.txtDirec.setText(model.getdirec());
        holder.txtActor.setText(model.getactor());
        holder.txtPlot.setText(model.getplot());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }


    @Override
    public int getItemCount() {

        return databaseModels.size();
    }

    class RecyclerviewHolder extends RecyclerView.ViewHolder  {
        TextView txtTitle, txtYear, txtRated, txtReleas, txtRun, txtGen, txtDirec, txtActor, txtPlot;


        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitleres);
            txtYear = itemView.findViewById(R.id.txtYeares);
            txtRated = itemView.findViewById(R.id.txtRatedres);
            txtReleas = itemView.findViewById(R.id.txtReleasres);
            txtRun = itemView.findViewById(R.id.txtRuntimres);
            txtGen = itemView.findViewById(R.id.txtGenrres);
            txtDirec = itemView.findViewById(R.id.txtDirecres);
            txtActor = itemView.findViewById(R.id.txtActores);
            txtPlot = itemView.findViewById(R.id.txtPlotres);
            View view = itemView;

        }


    }
    }
