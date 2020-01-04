package anis.nat.myapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListBuku extends AppCompatActivity {

    private int buku_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Buku> listbuku = new ArrayList<>();
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_buku);
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#053E77")));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buku_id = getIntent().getIntExtra("buku_id", 0);
        tvName = findViewById(R.id.nama_buku);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listbuku.addAll(BukuData.getListData());
        setLayou();
    }

        void setLayou() {
            tvName.setText(listbuku.get(buku_id).getName());
            tvDesc.setText(listbuku.get(buku_id).getDescription());
            Glide.with(this)
                    .load(listbuku.get(buku_id).getPhoto())
                    .apply(new RequestOptions().fitCenter())
                    .into(imgDetail);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.myProfile:
                Intent MoveProfil = new Intent(DetailListBuku.this, ProfilActivity.class);
                startActivity(MoveProfil);

                return true;
        }
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }
}
