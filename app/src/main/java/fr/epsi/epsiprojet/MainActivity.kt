package fr.epsi.epsiprojet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var infosButton = findViewById<Button>(R.id.infosButton)
        var produitButton = findViewById<Button>(R.id.produitsButton)
        infosButton.setOnClickListener{
            startActivity(Intent(this, InfosActivity::class.java))
        }
        produitButton.setOnClickListener{
            startActivity(Intent(this, CategoriesActivity::class.java))
        }
    }

}