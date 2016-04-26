package cn.woblog.testloadimage;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory;
import com.bumptech.glide.module.GlideModule;

/**
 * Created by ren on 2016/4/22 0022.
 */
public class MyGlideModule implements GlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        builder.setDiskCache(
                new ExternalCacheDiskCacheFactory(context, "imgCache", 1000*1000*100));
    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
