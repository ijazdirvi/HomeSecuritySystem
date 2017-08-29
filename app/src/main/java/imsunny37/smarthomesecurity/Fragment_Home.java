package imsunny37.smarthomesecurity;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.app.FragmentTransaction;
//import android.app.Fragment;
//import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

/**
 * Created by apple on 24/8/17.
 */

public class Fragment_Home extends Fragment implements View.OnClickListener{

    Button  configuration;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

            configuration = (Button) view.findViewById(R.id.home_config);
            configuration.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_config:
                Intent intent = new Intent(getContext(), Config_Activity.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_videos:
                Toast.makeText(getContext(), "Videos", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}

