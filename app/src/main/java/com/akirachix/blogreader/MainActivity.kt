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
        val article1 = Article("Paulo Coelho","","Veronica Decides To Die","","2010","Paolo talks about Veronica. She lives alone in a rented room in a parish. She tries to kill herself by takking many pills but later wakes up in a mental hospital where she meets many different kinds of people. She later escapes from the institution.","Read more")
        val article2 = Article("Jodi Picoult","","House Rules","","1990","Jodi talks about a family that struggles with their  autistic son, they do not know what works for him, and what treatments he needs. He lives with his younger brother and mother. The brother left because he felt that the son's 'issues' had become too much.","Read more")
        val article3 = Article("B.A Paris","","Behind Closed Doors","","1990","Many things happen ehind closed doors. One of these is murder. Tjis book tells the tale of a serial killer who is just  16 years old, he is a troubled child who has been sent from foster family to foster family, year in year out.","Read more")

        val articleList = listOf(article1,article2,article3)
        val articleAdapter = ArticleAdapter(articleList)
        binding.rvArticles.adapter = articleAdapter
    }
}