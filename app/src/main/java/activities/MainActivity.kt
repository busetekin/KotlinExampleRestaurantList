package activities

import adapters.RestaurantListAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.buse.kotlinexample_restaurantlist.R


class MainActivity : AppCompatActivity() {

    private val items = listOf(
            "Nusret - İstanbul",
            "Aspava - Ankara",
            "Buket- Diyarbakır"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val restaurantList = findViewById<RecyclerView>(R.id.restaurant_list)
        restaurantList.layoutManager = LinearLayoutManager(this)
        restaurantList.adapter = RestaurantListAdapter(items)
    }

}