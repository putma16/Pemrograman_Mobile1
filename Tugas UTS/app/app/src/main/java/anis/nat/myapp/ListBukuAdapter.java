package anis.nat.myapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBukuAdapter extends RecyclerView.Adapter<ListBukuAdapter.ListViewHolder>{
    private ArrayList<Buku> listHmj;

    public ListBukuAdapter(ArrayList<Buku> list){
        this.listHmj = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_buku,
                viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position){
        Buku buku = listHmj.get(position);

        Glide.with(holder.itemView.getContext())
                .load(buku.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(buku.getName());
        holder.tvDesc.setText(buku.getDescription());
    }

    @Override
    public int getItemCount(){
        return listHmj.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDesc;

        ListViewHolder(View itemView){
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_detail);
            tvName = itemView.findViewById(R.id.nama_buku);
            tvDesc = itemView.findViewById(R.id.desc_detail);


        }
    }
}
