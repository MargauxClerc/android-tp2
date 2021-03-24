package fr.clerc.tp2.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fr.clerc.tp2.R
import fr.clerc.tp2.kotlin.MainActivity.Companion.STUDENT_ID
import kotlinx.android.synthetic.main.activity_student_detail.*

class StudentDetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_detail)

        val bundle = intent.extras
        bundle?.let {
            val studentId = bundle.getInt(STUDENT_ID)
            val student = StudentContent.ITEMS[studentId]

            //Normally id are declare in camelCase for kotlin uses
            first_name.text = student.firstName
            last_name.text = student.lastName
            age.text = "${student.age} yo"
            gender.text = student.firstName
        }
    }
}