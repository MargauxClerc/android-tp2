package fr.clerc.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerAdapter;

    public static final String STUDENT_ID = "student_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Initialize layoutManager with a LinearLayoutManager, by default vertical
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Add list divider between each line
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), LinearLayout.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        //Create adapter with the OnItemClickListener implementation
        recyclerAdapter = new RecyclerViewAdapter(StudentContent.ITEMS, new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Student item = recyclerAdapter.getItem(position);

                Intent intent = new Intent(getApplicationContext(), StudentDetailsActivity.class);
                intent.putExtra(STUDENT_ID, item.id);
                startActivity(intent);
            }
        });

        //Set the adapter
        recyclerView.setAdapter(recyclerAdapter);
    }
}
