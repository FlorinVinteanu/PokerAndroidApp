package com.example.texasholdem;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button; 
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button switchButton = (Button) findViewById(R.id.button1);
        
        switchButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, HandsRanking.class);
				startActivity(intent);
				
			}
		});
        
        Button switchButton1 = (Button) findViewById(R.id.btnRules);
        
        switchButton1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, Rules.class);
				startActivity(intent);
				
			}
		});
        
        Button switchButton11 = (Button) findViewById(R.id.btnTips);
        
        switchButton11.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, Tips.class);
				startActivity(intent);
			}
        	
         });
        
        
        Button switchButton111 = (Button) findViewById(R.id.btnTimer);
        
        switchButton111.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, Timer.class);
				startActivity(intent);		
			}
        });
    }


   
}
