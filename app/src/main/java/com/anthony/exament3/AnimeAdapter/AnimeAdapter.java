package com.anthony.exament3.AnimeAdapter;

import android.graphics.Color;
import android.os.Handler;
import android.service.autofill.OnClickAction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anthony.exament3.AnimeClass.AnimeClass;
import com.anthony.exament3.MainActivity;
import com.anthony.exament3.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import java.util.logging.LogRecord;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {
    public final int PERMISO =1001;
    private List<AnimeClass> mData;
    private MainActivity act2;
    public int i=0;
    public AnimeAdapter(List<AnimeClass> data, MainActivity act){
        mData=data;
        act2=act;
    }
    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime,parent,false);
        AnimeViewHolder vh = new AnimeViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeAdapter.AnimeViewHolder holder, int position) {

        TextView tvNombre = holder.itemView.findViewById(R.id.tvNom);
        TextView tvDesc = holder.itemView.findViewById(R.id.tvDesc);
        ImageView img=holder.itemView.findViewById(R.id.imageAnim);
        Button btnStar=holder.itemView.findViewById(R.id.btnStar);

        AnimeClass text= mData.get(position);
        tvNombre.setText(text.nombre);
        tvDesc.setText(text.descripcion);
        Picasso.get().load(text.url).into(img);
        btnStar.setBackgroundColor(Color.WHITE);

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                Handler handler =new Handler();
               handler.postDelayed(new Runnable() {
                   @Override
                   public void run() {
                       if(i==1){
                           btnStar.setBackgroundColor(Color.BLACK);
                           Toast.makeText(AnimeAdapter.this.act2,"Añadido a Favoritos",Toast.LENGTH_SHORT).show();

                       }else if(i==2){
                           Toast.makeText(AnimeAdapter.this.act2,"Eliminado de Favoitos",Toast.LENGTH_SHORT).show();
                           btnStar.setBackgroundColor(Color.WHITE);
                           i=0;
                       }
                   }
               },500);


               // AnimeAdapter.this.check=true;
               // btnStar.setBackgroundColor(Color.BLACK);
                //if(AnimeAdapter.this.check=true){
                 // btnStar.setBackgroundColor(Color.WHITE);
                  //  AnimeAdapter.this.check=false;
                //}
            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder{
        public AnimeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
