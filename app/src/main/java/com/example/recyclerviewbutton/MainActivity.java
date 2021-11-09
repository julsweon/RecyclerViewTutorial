package com.example.recyclerviewbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Column> columnArrayList;
    MyAdapter myAdapter;
    String[] label;
    Button camBtn;
    int[] guidePicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        columnArrayList = new ArrayList<Column>();
        myAdapter = new MyAdapter(this, columnArrayList);
        recyclerView.setAdapter(myAdapter);

        camBtn = findViewById(R.id.camBtn);

        label = new String[] {
                "1. Up 위", "2. Down 아래",
                "3. Left 왼쪽", "4. Right 오른쪽",
                "5. Forward 전진", "6. Backward 후진",
                "7. Stop 정지"
        };

        guidePicList = new int[] {
            R.drawable.label1, R.drawable.label2, R.drawable.label3, R.drawable.label4,
                R.drawable.label5, R.drawable.label6, R.drawable.label7
        };

        getData();
    }

    private void getData() {
        for (int i=0; i<label.length; i++) {
            Column column = new Column(label[i], guidePicList[i], guidePicList[i], camBtn);
            columnArrayList.add(column);
        }
        myAdapter.notifyDataSetChanged();
    }
}