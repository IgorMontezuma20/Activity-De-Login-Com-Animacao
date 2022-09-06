package com.example.logincomanimacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //widgets

    Button btn;
    TextView textView1, textView2;

    Animation animate_btn, animate_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startComponents();


        //Adicionando a animação
        animate_btn = AnimationUtils.loadAnimation(this,R.anim.animate_btn);
        animate_txt = AnimationUtils.loadAnimation(this,R.anim.animate_texts);


        //criando a animação
        btn.setAnimation(animate_btn);
        textView1.setAnimation(animate_txt);
        textView2.setAnimation(animate_txt);


    }

    public void startComponents(){
        textView1 = findViewById(R.id.textView);
        textView2 =findViewById(R.id.textView2);
        btn = findViewById(R.id.button);
    }
}