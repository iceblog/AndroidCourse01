package cn.litchi.wyf.androidcourse01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button_dy;
    private Button button_gp;
    private Button button_yd;
    private Button button_bysj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_dy = (Button) findViewById(R.id.button_dy);
        button_dy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "热门电影", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
