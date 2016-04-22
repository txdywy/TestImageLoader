package cn.woblog.testloadimage.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import cn.woblog.testloadimage.R;

/**
 * Created by ren on 2016/4/21 0021.
 */
public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageHolder> {
    private List<String> datas = new ArrayList<>();

    private final Context context;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImageHolder(LayoutInflater.from(
                context).inflate(R.layout.item_img, parent,
                false));
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {
        holder.iv.setAdjustViewBounds(true);
        Glide.with(context).load(datas.get(position)).placeholder(R.drawable.ic_launcher).error(R.drawable.error).centerCrop().crossFade().into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class ImageHolder extends RecyclerView.ViewHolder {
        ImageView iv;

        public ImageHolder(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.iv);
        }

    }

    public void setData(List<String> data) {
        datas.clear();
        datas.addAll(data);
        notifyDataSetChanged();
    }
}
