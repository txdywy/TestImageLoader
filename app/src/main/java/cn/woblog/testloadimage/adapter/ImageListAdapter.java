package cn.woblog.testloadimage.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import cn.woblog.testloadimage.R;

/**
 * Created by ren on 2016/4/22 0022.
 */
public class ImageListAdapter extends CustomBaseAdapter<String> {
    public ImageListAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_img, null);
            holder = new ImageHolder(convertView);
            convertView.setTag(holder);
        } else {

            holder = (ImageHolder) convertView.getTag();
        }

        Glide.with(context).load(datas.get(position)).placeholder(R.drawable.ic_launcher).error(R.drawable.error).centerCrop().crossFade().into(holder.iv);
        return convertView;
    }

    class ImageHolder {
        ImageView iv;

        public ImageHolder(View itemView) {
            iv = (ImageView) itemView.findViewById(R.id.iv);
        }

    }
}
