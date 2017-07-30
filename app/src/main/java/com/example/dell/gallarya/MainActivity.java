package com.example.dell.gallarya;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GridView)findViewById(R.id.gv);
        gv.setAdapter(new customadaptar(MainActivity.this,getData()));


    }
    private ArrayList<data> getData(){
       ArrayList<data> datas=new ArrayList<>();

        File downloudfile=  new File(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS))
                );
        data d ;
        if(downloudfile.exists()){

            File[] files=downloudfile.listFiles();
            for(int i=0;i<files.length;i++){
                File file=files[i];
                d=new data();

                d.setUri(Uri.fromFile(file));
                datas.add(d);


            }



        }
return datas;

    }
}
