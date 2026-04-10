package com.xurxodev.moviesandroidkata.data.loaders;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideImageLoader implements ImageLoader {
    @Override
    public void loadImage(String url, ImageView imageView) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }
}
