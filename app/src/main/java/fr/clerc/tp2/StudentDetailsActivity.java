package fr.clerc.tp2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import static fr.clerc.tp2.MainActivity.STUDENT_ID;

public class StudentDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_student_detail);

        TextView studentFirstName = findViewById(R.id.first_name);
        TextView studentLastName = findViewById(R.id.last_name);
        TextView studentAge = findViewById(R.id.age);
        TextView studentGender = findViewById(R.id.gender);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            int studentId = bundle.getInt(STUDENT_ID);
            Student student = StudentContent.ITEMS.get(studentId);

            studentFirstName.setText(student.firstName);
            studentLastName.setText(student.lastName);
            studentAge.setText(student.age + " yo");
            studentGender.setText(student.gender);
        }
    }
}
