package fr.clerc.myapplication.kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import fr.clerc.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    companion object {
        const val STUDENT_ID: String = "student_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemDecoration = DividerItemDecoration(this, VERTICAL)
        recyclerView.addItemDecoration(itemDecoration)

        val adapter = RecyclerViewAdapter(StudentContent.ITEMS) { student ->
            val intent = Intent(this, StudentDetailsActivity::class.java)
            intent.putExtra(STUDENT_ID, student.id)
            startActivity(intent)
        }

        recyclerView.adapter = adapter


    }
}