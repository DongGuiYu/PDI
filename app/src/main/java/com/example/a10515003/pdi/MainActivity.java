package com.example.a10515003.pdi;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import com.example.a10515003.pdi.R;

public class MainActivity extends AppCompatActivity {

    Button bt_white,bt_black,bt_red,bt_yellow,bt_green,bt_blue,bt_dgray;
    EditText et;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        et=(EditText) findViewById(R.id.et);
        String stringText=et.getText().toString();
        int startIndex = et.getSelectionStart();
        int endIndex = et.getSelectionEnd();
        stringText=stringText.substring(startIndex,endIndex);


        bt_white=(Button)findViewById(R.id.bt_white);
        bt_black=(Button)findViewById(R.id.bt_black);
        bt_red=(Button)findViewById(R.id.bt_red);
        bt_yellow=(Button)findViewById(R.id.bt_yellow);
        bt_green=(Button)findViewById(R.id.bt_green);
        bt_blue=(Button)findViewById(R.id.bt_blue);
        bt_dgray=(Button)findViewById(R.id.bt_dgray);




        bt_white.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){ et.setTextColor(Color.WHITE);
            }
        });

        bt_black.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){

                et.setTextColor(Color.BLACK);
            }
        });

        bt_red.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){

                et.setTextColor(Color.parseColor("#ea0000"));
            }
        });

        bt_yellow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){

                et.setTextColor(Color.parseColor("#ffff00"));
            }
        });

        bt_green.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){

                et.setTextColor(Color.parseColor("#00B050"));
            }
        });

        bt_blue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){

                et.setTextColor(Color.parseColor("#ff00ddff"));
            }
        });

        bt_dgray.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){

                et.setTextColor(Color.parseColor("#a9a9a9"));
            }
        });

    }

}


