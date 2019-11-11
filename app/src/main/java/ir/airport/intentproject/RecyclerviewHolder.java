package ir.airport.intentproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RecyclerviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView txtTitle,txtYear,txtRated,txtReleas,txtRun,txtGen,txtDirec,txtActor,txtPlot;


    public RecyclerviewHolder(@NonNull View itemView) {
        super(itemView);
        txtTitle=itemView.findViewById(R.id.txtTitleres);
        txtYear=itemView.findViewById(R.id.txtYeares);
        txtRated=itemView.findViewById(R.id.txtRatedres);
        txtReleas=itemView.findViewById(R.id.txtReleasres);
        txtRun=itemView.findViewById(R.id.txtRuntimres);
        txtGen=itemView.findViewById(R.id.txtGenrres);
        txtDirec=itemView.findViewById(R.id.txtDirecres);
        txtActor=itemView.findViewById(R.id.txtActores);
        txtPlot=itemView.findViewById(R.id.txtPlotres);
        View view=itemView;

    }

    @Override
    public void onClick(View v) {

    }
}
