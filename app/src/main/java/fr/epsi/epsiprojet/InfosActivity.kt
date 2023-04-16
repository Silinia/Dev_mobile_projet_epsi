package fr.epsi.epsiprojet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.core.view.forEach
import androidx.core.view.forEachIndexed

class InfosActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infos)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Thomas ALGLAVE"
        )

        var mListView = findViewById<ListView>(R.id.userList)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter


    }
}