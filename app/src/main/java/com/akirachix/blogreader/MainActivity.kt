package com.akirachix.blogreader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blogreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        displayArticles()
    }

   fun displayArticles() {
    val article5 = Article("Paulo Coelho", "https://plus.unsplash.com/premium_photo-1679981593879-82b177233d2b?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8cGF1bG8lMjBjb2VobG98ZW58MHx8MHx8fDA%3D", "Veronica Decides To Die", "2010", "Paolo talks about Veronica. She lives alone in a rented room in a parish. She tries to kill herself by takking many pills but later wakes up in a mental hospital where she meets many different kinds of people. She later escapes from the institution.", "https://plus.unsplash.com/premium_photo-1715110520685-e20ace1f0e69?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fHZlcm9uaWthJTIwZGVjaWRlcyUyMHRvJTIwZGllfGVufDB8fDB8fHww", "Read More")
    val article4 = Article("Chinua Achebe", "https://www.theparisreview.org/il/e4b8f842fe/large/Chinua-Achebe.jpg", "Things Fall Apart", "1958", "The novel chronicles the life of Okonkwo, the leader of an Igbo community, from the events leading up to his banishment from the community for accidentally killing a clansman", "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgk5cywQzh-8juZYBxbiFE0QsO8P-K-TqCNK8MqKMUaD0iOmBoM06Ab1oUXJCo5YbP92F_0bRU1JKNVsqqLt6ADpibf_36Xy5hm19Y8Bcx8LdNRkQAFe12i9H5I9EsXQ_xk5IW1ETHrqJ4/s640/1.png", "Read more")
    val article6 = Article("Ngugi wa Thiong'o", "https://miro.medium.com/v2/resize:fit:1000/1*3B01cMjMAsm62zV9FJXXEg.jpeg", "A Grain of Wheat", "1967", "The novel weaves together several stories set during the state of emergency in Kenya's struggle for independence (1952–59), focusing on the quiet Mugo", "https://textbookcentre.com/media/products/2010141002183.jpg", "Read more")
    val article2 = Article("Chimamanda Ngozi Adichie", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNlpGMdIJ5Hsfyrm_JQ-bwUE2frrHpQfWqcA&s", "Purple Hibiscus", "2003", "Fifteen-year-old Kambili lives in luxury in Enugu, Nigeria. Kambili, her seventeen-year-old brother Jaja, and their parents—Papa and Mama", "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1527718322i/14569052.jpg", "Read more")
    val article3 = Article("Lola Shoneyin", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Lola_Shoneyin-1311.jpg/640px-Lola_Shoneyin-1311.jpg", "The Secret Lives of Baba Segi's Wives", "2011", "A perceptive, entertaining, and eye-opening novel of polygamy in modern-day Nigeria. The struggles, rivalries, intricate", "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1264521277i/7194279.jpg", "Read More")
    val article1 = Article("Wanjiru Koinange","https://www.wanjirukoinange.com/wp-content/uploads/2019/09/WK_13.jpg","1990", "2014","Long-held captive by her father’s shadow of corruption, Kavata has spent her life suffocated by political machinations. When her husband ", "https://www.wanjirukoinange.com/wp-content/uploads/2019/10/0003-1.jpg","Read more")

       val articleList = listOf(article1, article2, article3, article4, article5, article6)
    val articleAdapter = ArticleAdapter(articleList)
    binding.rvArticles.layoutManager = LinearLayoutManager(this)
    binding.rvArticles.adapter = articleAdapter
    }
}