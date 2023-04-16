package fr.epsi.epsiprojet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class CategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        fetchListeObjectsFromUrl("https://www.ugarit.online/epsi/categories.json")

        val catList = findViewById<ListView>(R.id.CatListView)

    }
}