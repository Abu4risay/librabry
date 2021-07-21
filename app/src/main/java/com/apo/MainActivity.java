package com.apo;

import android.app.*;
import android.os.*;
import com.mycompany.library.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
		
		
		
			int sum=Maths.Plus(20,30);
			Toast.makeText(this, String.valueOf(sum)+"hi", Toast.LENGTH_SHORT);
		
			
		int sum1=Maths.Minus(60,30);
		Toast.makeText(this, "hi   "+sum1, Toast.LENGTH_SHORT);
		
			
			}
}
