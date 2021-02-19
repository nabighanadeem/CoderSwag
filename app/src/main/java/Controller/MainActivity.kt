package Controller

import Adapters.CategoryRecyclerAdapter
import Services.DataService
import Utilities.EXTRA_CATEGORY
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nabigha.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories) {category -> println(category.title)
        val productIntent = Intent(this , ProductActivity::class.java)
        productIntent.putExtra(EXTRA_CATEGORY, category.title)
        startActivity(productIntent)
        }
        categoryListView.adapter =adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager =layoutManager
        categoryListView.setHasFixedSize(true)
    }
}