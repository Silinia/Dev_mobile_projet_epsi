package fr.epsi.epsiprojet

import okhttp3.*
import org.json.JSONArray
import java.io.IOException
import java.net.URL

fun fetchListeObjectsFromUrl(url: String){
    val client = OkHttpClient()
    val request = Request.Builder()
        .url(url)
        .build()

    client.newCall(request).enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            TODO("Not yet implemented")
        }

        override fun onResponse(call: Call, response: Response) {
            val jsonData = response.body?.string()
            parseJsonAndDisplayListeObjets(jsonData)
        }
    })
}

fun parseJsonAndDisplayListeObjets(jsonData: String?) {
    val listeObjets = mutableListOf<MonObjet>()

    // Analyser le JSON
    val jsonArray = JSONArray(jsonData)
    for (i in 0 until jsonArray.length()) {
        val jsonObject = jsonArray.getJSONObject(i)
        val name = jsonObject.getString("name")
        val title = jsonObject.getString("title")
        val description = jsonObject.getString("description")
        val products_url = jsonObject.getString("products_url")
        val picture_url = jsonObject.getString("picture_url")

        val monObjet = MonObjet(name, title, description, products_url, picture_url)
        listeObjets.add(monObjet)
    }

}

data class MonObjet(val name: String, val title: String, val products_url: String, val description: String, val picture_url: String) {

}
