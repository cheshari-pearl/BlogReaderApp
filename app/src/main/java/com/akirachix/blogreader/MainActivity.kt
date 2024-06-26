package com.akirachix.blogreader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.blogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        displayAuthors()
    }

    fun displayAuthors(){
        val article1 = Article("Paulo Coelho","","Veronica Decides To Die","","2010","Hanif Abdurraqib's latest book is a transcendent feat of poetry, memoir, and—well, magic. His narration is as breathless and beautiful as his prose. It's an ode to his hometown of Columbus, Ohio; a love letter to basketball; a meditation on home and belonging; and an exploration of faith, Blackness, music, and place.","Read more")
        val article2 = Article("House Rules","","Jodi Picoult","","1990","In order to cultivate relationships that increase their power, people seeking power should force others to come to them, never allow others to become independent of them, avoid anyone who frequently encounters misfortune, never place too much trust in any one person, and never outperform their superiors.","Read more")
        val article3 = Article("B.A Paris","","Robert Greene","","1990","In order to cultivate relationships that increase their power, people seeking power should force others to come to them, never allow others to become independent of them, avoid anyone who frequently encounters misfortune, never place too much trust in any one person, and never outperform their superiors.","Read more")

        val articleList = listOf(article1,article2,article3)
        val articleAdapter = ArticleAdapter(articleList)
        binding.rvArticles.adapter = articleAdapter
    }
}