package inkant1990gmail.com.laliga.utils

import android.databinding.BindingAdapter
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso
import inkant1990gmail.com.laliga.R


@BindingAdapter("android:src")
fun loadImage(view: ImageView, url: String?) {
    if (url !="default") {
        Picasso.get().load(Logos.laLigaLogos.get(url)!!).transform(CircleTransform()).resize(70,70)
            .transform(CircleTransform()).into(view)
    }
}

@BindingAdapter("visibility")
fun View.visibility(visibility: Boolean) {
    this.visibility = if (visibility) View.VISIBLE else View.INVISIBLE
}