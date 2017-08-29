package imsunny37.smarthomesecurity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by apple on 25/8/17.
 */

public class Config_Activity extends AppCompatActivity {
    RelativeLayout setting_view;

    Switch btn_system, room1,room2, main_door;
    TextView system_status ,room1_textview, room2_textview, main_door_txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.main_toolbars);
        setSupportActionBar(myToolbar);
        myToolbar.setTitle("Settings");

        if(getSupportActionBar() != null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }

        btn_system = (Switch) findViewById(R.id.btn_system);
        room1 = (Switch) findViewById(R.id.room1);
        room2 = (Switch) findViewById(R.id.room2);
        main_door = (Switch) findViewById(R.id.main_door);

        system_status = (TextView) findViewById(R.id.status);
        room1_textview = (TextView) findViewById(R.id.room1_textview);
        room2_textview = (TextView) findViewById(R.id.room2_textview);
        main_door_txtview = (TextView) findViewById(R.id.main_door_view);

        setting_view = (RelativeLayout) findViewById(R.id.system_setting_view);

        btn_system.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    system_status.setText("System is ON");
                    setting_view.setVisibility(View.VISIBLE);
                } else {
                    system_status.setText("System is OFF");
                    setting_view.setVisibility(View.INVISIBLE);
                }
            }
        });

        room1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    room1_textview.setText("Room One is ON");
                } else {
                    room1_textview.setText("Room One is OFF");
                }
            }
        });

        room2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    room2_textview.setText("Room Two is ON");
                } else {
                    room2_textview.setText("Room Two is OFF");
                }
            }
        });

        main_door.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    main_door_txtview.setText("Main Door is ON");
                } else {
                    main_door_txtview.setText("Main Door is OFF");
                }
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
