package fr.gautier_rouleau.m2infotp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitPersonalInfo(View view) {
        Toast.makeText(this, "Button works !", Toast.LENGTH_SHORT).show();
    }
}
