package com.example.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView = (TextView)findViewById(R.id.tv1);
        registerForContextMenu(txtView);

        Button btn = (Button)findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Toast!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 1, Menu.NONE, "First");
        menu.add(Menu.NONE, 2, Menu.NONE, "Second");
        menu.add(Menu.NONE, 3, Menu.NONE, "Third");
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem item1 = menu.findItem(1);

        if (item1.isEnabled() == true)
            item1.setEnabled(false);
        else
            item1.setEnabled(true);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case 1:
                // FIrst (항목 ID 1) 이벤트
                Toast.makeText(this, "First Menu is selected", Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                 // Second (항목 ID 2) 이벤트
                Toast.makeText(this, "Second Menu is selected", Toast.LENGTH_SHORT).show();
                return true;
            case 3:
                // Third (항목 ID 3) 이벤트
                Toast.makeText(this, "Third Menu is selected", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }

    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        switch(v.getId()) {
            case R.id.tv1:
                menu.clear();
                menu.add(Menu.NONE, 1, Menu.NONE, "First");
                menu.add(Menu.NONE, 2, Menu.NONE, "Second");
                menu.add(Menu.NONE, 3, Menu.NONE, "Third");
                break;
        }
    }

    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case 1:
                Toast.makeText(this, "First Context Menu is selected", Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                Toast.makeText(this, "Second Context Menu is selected", Toast.LENGTH_SHORT).show();
                return true;
            case 3:
                Toast.makeText(this, "Third Context Menu is selected", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}