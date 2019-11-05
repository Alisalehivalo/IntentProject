package ir.airport.intentproject;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler_class extends RecyclerView.Adapter<Recycler_class.RecyclerviewHolder> {

     ArrayList<String> myList;

    public Recycler_class(ArrayList list){

      myList=list;
    }

    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        RecyclerviewHolder holder=new RecyclerviewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder holder, int position) {

        holder.txtItem.setText(myList.get(position));

        if (holder.txtItem.getText() == "Profile")
        {
holder.txtItem.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

         Intent i =new  Intent(v.getContext(), ProfileActivity.class);
         v.getContext().startActivity(i);

    }
});
        }else if (holder.txtItem.getText() == "Dial"){

            holder.txtItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(v.getContext(),DialActivity.class);
                    v.getContext().startActivity(i);
                }
            });
        }
        else if (holder.txtItem.getText() == "SMS"){

            holder.txtItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(v.getContext(),SMSActivity.class);
                    v.getContext().startActivity(i);
                }
            });
        }
        else if (holder.txtItem.getText() == "Search"){

            holder.txtItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(v.getContext(),SearchActivity.class);
                    v.getContext().startActivity(i);
                }
            });
        }
        else if (holder.txtItem.getText() == "Camera"){

            holder.txtItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(v.getContext(),Camera2Activity.class);
                    v.getContext().startActivity(i);
                }
            });
        }

    }







    @Override
    public int getItemCount() {
        return myList.size();
    }

    class RecyclerviewHolder extends RecyclerView.ViewHolder{
TextView txtItem;

        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);
            txtItem= itemView.findViewById(R.id.txtItem);
        }
    }


}
