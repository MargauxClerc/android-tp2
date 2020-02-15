package fr.clerc.myapplication.kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.clerc.myapplication.R
import kotlinx.android.synthetic.main.item_student.view.*

class RecyclerViewAdapter(private val itemList: ArrayList<Student>, val listener: (Student) -> Unit): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = itemList[position]

        holder.firstName.text = student.firstName
        holder.lastName.text = student.lastName.toUpperCase()
        holder.image.setImageResource(R.drawable.ic_person)

        holder.itemView.setOnClickListener {
            listener(student)
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val firstName: TextView = view.student_firstname
        val lastName: TextView = view.student_lastname
        val image: ImageView = view.student_image
    }
}