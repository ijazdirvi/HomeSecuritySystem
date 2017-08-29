package imsunny37.smarthomesecurity;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.content.Context.*;
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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 25/8/17.
 */



public class Fragment_Camera extends Fragment implements View.OnClickListener {
    private File imageFile;

    Button btn_camera, btn_videos;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera, container, false);

        btn_camera =(Button) view.findViewById(R.id.button_camera);


        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                imageFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "test.jpg");
                Uri tempuri = Uri.fromFile(imageFile);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, tempuri);
                intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY,1);
                startActivityForResult(intent,0);
            }
        });
        return view;
    }



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0){
            switch (requestCode){
                case Activity.RESULT_OK:
                    if (imageFile.exists())
                    {
                     Toast.makeText(getContext(),"The fie was saved at"+imageFile.getAbsolutePath(),Toast.LENGTH_SHORT).show();
                    }
                    else
                        {
                            Toast.makeText(getContext(),"There was an error saving the file",Toast.LENGTH_SHORT).show();
                        }
                        break;
                case Activity.RESULT_CANCELED:
                    break;
            }
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.btn_gallery:
//                Toast.makeText(getContext(), "Gallery", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn_videos:
//                Toast.makeText(getContext(), "Videos", Toast.LENGTH_SHORT).show();
//                break;


        }
    }
}