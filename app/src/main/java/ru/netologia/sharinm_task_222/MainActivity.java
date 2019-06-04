package ru.netologia.sharinm_task_222;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        Button btnExit = findViewById(R.id.buttonExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent intent = null;

        switch (id) {
            case R.id.action_open_notes:
                intent = new Intent(MainActivity.this, NotesActivity.class);
                break;
            case R.id.action_open_calendar:
                intent = new Intent(MainActivity.this, CalendarActivity.class);
                break;
            case R.id.action_open_spinner:
                intent = new Intent(MainActivity.this, SpinnerActivity.class);
                break;
            case R.id.action_open_checkbox:
                intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                break;
            default:
                Toast.makeText(MainActivity.this, getString(R.string.textMessageErrorNotChecked), Toast.LENGTH_LONG).show();
                break;
        }

        if (intent != null) {
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
