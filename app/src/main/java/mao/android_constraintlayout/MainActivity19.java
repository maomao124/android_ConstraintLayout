package mao.android_constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity19 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        final int[] i = {2};
        ConstraintLayout constraintLayout = findViewById(R.id.ConstraintLayout);

        List<Integer> ids = new ArrayList<>();

        Flow flow = findViewById(R.id.Flow);

        Button button = findViewById(R.id.Button1112);
        ids.add(button.getId());


        findViewById(R.id.Button111).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Button button1 = new Button(MainActivity19.this);
                button1.setText(String.valueOf(i[0]));
                i[0]++;
                int id = 10023 + i[0];
                button1.setId(id);
                ids.add(id);
                constraintLayout.addView(button1);
                int[] ids_array = new int[ids.size()];
                for (int j = 0; j < ids.size(); j++)
                {
                    ids_array[j] = ids.get(j);
                }
                flow.setReferencedIds(ids_array);

            }
        });
    }
}