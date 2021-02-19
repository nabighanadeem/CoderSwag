package Controller

import Utilities.EXTRA_CATEGORY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nabigha.coderswag.R

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}