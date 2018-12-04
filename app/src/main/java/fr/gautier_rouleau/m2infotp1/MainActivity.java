package fr.gautier_rouleau.m2infotp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText firstName;

    private EditText lastName;

    private EditText dateOfBirth;

    private EditText cityOfBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.firstName = findViewById(R.id.firstName);
        this.lastName = findViewById(R.id.lastName);
        this.dateOfBirth = findViewById(R.id.dateOfBirth);
        this.cityOfBirth = findViewById(R.id.cityOfBirth);
    }

    public void submitPersonalInfo(View view) {
        String greetings = String.format("Hello %s %s, you were born on %s in %s",
                firstName.getText(), lastName.getText(), dateOfBirth.getText(), cityOfBirth.getText());

        Toast.makeText(this, greetings, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.resetIHM:
                resetIHM();
                break;
            default:
                Toast.makeText(this, "Not implemented yet.", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }

    public void resetIHM() {
        this.firstName.setText(""); this.lastName.setText("");
        this.dateOfBirth.setText(""); this.cityOfBirth.setText("");
    }
}
