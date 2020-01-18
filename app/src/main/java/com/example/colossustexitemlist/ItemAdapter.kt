package com.example.colossustexitemlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.squareup.picasso.Picasso

class ItemAdapter(options: FirebaseRecyclerOptions<Item>) : FirebaseRecyclerAdapter<Item, ItemAdapter.ItemViewHolder>(options) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int, model: Item) {
        var count = model.countViews
        holder.catagory.text = "Category: "+model.catagory
        holder.description.text = model.description
        holder.descriptionHeading.text = model.descriptionHeading
        holder.location.text = model.location
        holder.productName.text = model.productName
        holder.seller.text = "Seller: "+model.seller
        Picasso.get().load(model.image).into(holder.image)

    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var catagory: TextView = itemView.findViewById(R.id.textView_catagory)
        var location: TextView = itemView.findViewById(R.id.textView_location)
        var productName: TextView = itemView.findViewById(R.id.textView_product_name)
        var image: ImageView = itemView.findViewById(R.id.imageView_image)
        var descriptionHeading: TextView = itemView.findViewById(R.id.textView_description_heading)
        var description: TextView = itemView.findViewById(R.id.textView_description)
        var seller: TextView = itemView.findViewById(R.id.textView_seller)
        var contactButton:TextView = itemView.findViewById(R.id.button_contact)
        var shareButton:TextView = itemView.findViewById(R.id.button_share)
        var countViews: TextView = itemView.findViewById(R.id.textView_count)

    }

}


