package anis.nat.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveActivityData;
    Button btnDial;
    Button btnWeb;
    Button btnhal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityData = findViewById(R.id.btn_move_data);
        btnMoveActivityData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWeb = findViewById(R.id.btn_web);
        btnWeb.setOnClickListener(this);

        btnhal2 = findViewById(R.id.btn_belajar);
        btnhal2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_data:
                Intent MoveData = new Intent(MainActivity.this,MoveActivityWithData.class);
                MoveData.putExtra(MoveActivityWithData.EXTRA_NAME, "Anis Putma");
                MoveData.putExtra(MoveActivityWithData.EXTRA_AGE, "19");
                startActivity(MoveData);
                break;

            case R.id.btn_dial:
                String phoneNumber ="089798484835";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;

            case R.id.btn_web:
                String Website = "https://www.polines.ac.id/id/";
                Intent WebPolines =new Intent(Intent.ACTION_VIEW,Uri.parse(Website));
                startActivity(WebPolines);
                break;

            case R.id.btn_belajar:
                Intent exp = new Intent(MainActivity.this, HalamanActivity1.class);
                startActivity(exp);
                break;


        }

    }
}