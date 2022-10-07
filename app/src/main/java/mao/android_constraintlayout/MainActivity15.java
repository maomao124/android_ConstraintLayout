package mao.android_constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.os.Bundle;
import android.view.View;

public class MainActivity15 extends AppCompatActivity
{

    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        Group group = findViewById(R.id.group);


        findViewById(R.id.Button23).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (i % 3 == 0)
                {
                    group.setVisibility(View.VISIBLE);
                }
                else if (i % 3 == 1)
                {
                    group.setVisibility(View.INVISIBLE);
                }
                else
                {
                    group.setVisibility(View.GONE);
                }
                i++;
            }
        });
    }
}