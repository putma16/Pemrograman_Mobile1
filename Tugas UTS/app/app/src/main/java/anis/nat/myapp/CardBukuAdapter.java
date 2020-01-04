package anis.nat.myapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardBukuAdapter extends RecyclerView.Adapter<CardBukuAdapter.ListViewHolder>{
    private ArrayList<Buku> listbuku;
    private Context context;

    public CardBukuAdapter(Context context, ArrayList<Buku> listbuku){
        this.listbuku = listbuku;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_buku, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Buku buku = listbuku.get(position);
        Glide.with(holder.itemView.getContext())
                .load(buku.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(buku.getName());
        holder.tvDesc.setText(buku.getDescription());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailbuku = new Intent(context, DetailListBuku.class);
                detailbuku.putExtra("buku_id", buku.getId());
                context.startActivity(detailbuku);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listbuku.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_buku_list);
            tvName = itemView.findViewById(R.id.name_buku_list);
            tvDesc = itemView.findViewById(R.id.desc_buku_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
