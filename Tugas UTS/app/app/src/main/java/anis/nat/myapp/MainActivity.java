package anis.nat.myapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBuku;
    private ArrayList<Buku> list = new ArrayList<>();
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#053E77")));

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Buku Novel");
        }

        rvBuku = findViewById(R.id.rv_buku);
        rvBuku.setHasFixedSize(true);

        list.addAll(BukuData.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rvBuku.setLayoutManager(new LinearLayoutManager(this));
        CardBukuAdapter cardBukuAdapter = new CardBukuAdapter(this, list);
        rvBuku.setAdapter(cardBukuAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.myProfile:
                Intent MoveProfil = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(MoveProfil);

                return true;
        }
        return false;
    }
}
