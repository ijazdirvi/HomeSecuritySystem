package imsunny37.smarthomesecurity;


//import android.app.FragmentTransaction;
//import android.app.Fragment;
//import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Fragment_Home fragment_home = new Fragment_Home();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content,fragment_home);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_gallery:
                    Fragment_Gallery fragment_gallery = new Fragment_Gallery();
                    FragmentTransaction fragment_trans_gallery = getSupportFragmentManager().beginTransaction();
                    fragment_trans_gallery.replace(R.id.content,fragment_gallery);
                    fragment_trans_gallery.commit();
                    return true;
                case R.id.navigation_message:
                    Fragment_Messages fragment_message = new Fragment_Messages();
                    FragmentTransaction fragment_trans_message = getSupportFragmentManager().beginTransaction();
                    fragment_trans_message.replace(R.id.content,fragment_message);
                    fragment_trans_message.commit();
                    return true;
                case R.id.ic_home_camera:
                    Fragment_Camera fragment_camera_cap = new Fragment_Camera();
                    FragmentTransaction fragment_trans_camera = getSupportFragmentManager().beginTransaction();
                    fragment_trans_camera.replace(R.id.content,fragment_camera_cap);
                    fragment_trans_camera.commit();
                    return true;


            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setLogo(R.drawable.ic_home_black_24dp);
        myToolbar.setTitle("Home");
        setSupportActionBar(myToolbar);

        Fragment_Home fragment_home = new Fragment_Home();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content,fragment_home);
        fragmentTransaction.commit();


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_settings:
                Toast.makeText(getApplicationContext(),"Heloo",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

}
