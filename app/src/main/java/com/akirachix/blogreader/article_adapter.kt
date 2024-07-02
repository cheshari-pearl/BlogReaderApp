package com.akirachix.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter(val articleList: List<Article>):RecyclerView.Adapter<ArticleViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.article_list_item,parent, false)
        return ArticleViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articleList[position]
        holder.tvAuthor.text=article.author
        holder.tvLink.text = article.fullPostLink
        holder.tvArticleTitle.text = article.title
        holder.tvDate.text = article.publishingDate
        holder.tvArticlesPreview.text = article.articlePreview
    }


    override fun getItemCount(): Int {
        return articleList.size
    }


}
class ArticleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    var tvAuthor:TextView = itemView.findViewById(R.id.tvAuthor)
    var tvArticleTitle:TextView = itemView.findViewById(R.id.tvArticleTitle)
    var tvDate:TextView = itemView.findViewById(R.id.tvDate)
    var tvArticlesPreview: TextView = itemView.findViewById(R.id.tvArticlesPreview)
    var tvLink:TextView = itemView.findViewById(R.id.tvLink)
}