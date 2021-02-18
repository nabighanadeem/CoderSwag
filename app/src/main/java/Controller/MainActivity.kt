package Controller

import Adapters.CategoryAdapter
import Adapters.CategoryRecyclerAdapter
import Model.Category
import Services.DataService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.nabigha.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories)
        categoryListView.adapter =adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager =layoutManager
        categoryListView.setHasFixedSize(true)
    }
}