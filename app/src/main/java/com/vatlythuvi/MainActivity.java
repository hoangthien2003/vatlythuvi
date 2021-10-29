package com.vatlythuvi;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.gauravk.bubblenavigation.BubbleNavigationConstraintView;
import com.vatlythuvi.Fragments.bt;
import com.vatlythuvi.Fragments.lt;
import com.vatlythuvi.Fragments.th;

public class MainActivity extends AppCompatActivity {

    BubbleNavigationConstraintView bubbleNavigation;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        
        bubbleNavigation=findViewById(R.id.bubbleNavigation);
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,new lt());
        fragmentTransaction.commit();
        bubbleNavigation.setNavigationChangeListener ((view, position) -> {
            switch (position)
            {
                case 0:
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container,new lt());
                    fragmentTransaction.commit();
                    break;
                case 1:
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container,new bt());
                    fragmentTransaction.commit();
                    break;
                case 2:
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container,new th());
                    fragmentTransaction.commit();
                    break;
            }
        });
    }
}
