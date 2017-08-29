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

public class Fragment_Gallery extends Fragment implements View.OnClickListener {

    Button btn_gallery, btn_videos;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        btn_gallery = (Button) view.findViewById(R.id.btn_gallery);
        btn_gallery.setOnClickListener(this);

        btn_videos = (Button) view.findViewById(R.id.btn_videos);
        btn_videos.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_gallery:
                Intent intent = new Intent(getContext(),Images_Activity.class);
                startActivity(intent);
                Toast.makeText(getContext(), "Gallery", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_videos:
                Toast.makeText(getContext(), "Videos", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}