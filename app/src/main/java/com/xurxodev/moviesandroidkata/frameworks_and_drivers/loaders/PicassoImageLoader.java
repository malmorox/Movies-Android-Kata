package com.xurxodev.moviesandroidkata.frameworks_and_drivers.loaders;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import javax.inject.Inject;

public class PicassoImageLoader implements ImageLoader {
    @Inject
    public PicassoImageLoader() {}

    @Override
    public void loadImage(String url, ImageView imageView) {
        Picasso.get()
                .load(url)
                .into(imageView);
    }
}