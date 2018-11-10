package inkant1990gmail.com.laliga.utils

import android.databinding.BindingAdapter
import android.util.Log
import android.widget.ImageView
import com.squareup.picasso.Picasso


@BindingAdapter("android:src")
fun loadImage(view: ImageView, url: String?) {
    Log.v("Error", url)
    Picasso.get().load(Logos.laLigaLogos.get(url)!!).transform(CircleTransform()).resize(70, 70).transform(CircleTransform()).into(view)
}