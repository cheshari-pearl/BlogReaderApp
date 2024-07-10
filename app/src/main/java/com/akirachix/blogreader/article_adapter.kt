package com.akirachix.blogreader


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.blogreader.databinding.ActivityMainBinding
import com.akirachix.blogreader.databinding.ArticleListItemBinding
import com.squareup.picasso.Picasso

class ArticleAdapter(val articleList: List<Article>):RecyclerView.Adapter<ArticleViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        var binding = ArticleListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent, false)
        return ArticleViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articleList[position]
        holder.binding.tvAuthor.text=article.author
        holder.binding.btnLink.text = article.fullPostLink
        holder.binding.tvArticleTitle.text = article.title
        holder.binding.tvDate.text = article.publishingDate
        holder.binding.tvArticlesPreview.text = article.articlePreview.substring(0,100)

        Picasso.get()
            .load(article.articlePhoto)
            .placeholder(R.drawable.article_svgrepo_com)
            .resize(270,220)
            .centerCrop()
            .into(holder.binding.iv3)

        Picasso.get()
            .load(article.authorProfilePicture)
            .placeholder(R.drawable.user_6_svgrepo_com)
            .into(holder.binding.ivAvatar)
    }


    override fun getItemCount(): Int {
        return articleList.size
    }


}

class ArticleViewHolder( var binding: ArticleListItemBinding):
    RecyclerView.ViewHolder(binding.root){

}