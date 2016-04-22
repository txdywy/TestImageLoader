package cn.woblog.testloadimage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * PagerAdapter don't inherit me
 * Created by ren on 2015/5/4 0004.
 */
public abstract class CustomBaseAdapter<T> extends BaseAdapter {
    protected final Context context;
    protected final List<T> datas = new ArrayList<T>();
    protected final LayoutInflater inflater;
    protected T data;

    public List<T> getDatas() {
        return datas;
    }

    public Context getContext() {
        return context;
    }

    public CustomBaseAdapter(Context context){
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public T getData(int position){
      return  datas.get(position);
    }

    /**
     * will clear the original data
     * @param data
     */
    public void setDatas(List<T> data) {
//        if (data != null&&data.size()>0) {
            datas.clear();
            datas.addAll(data);
            notifyDataSetChanged();
//        }
    }

    /**
     * add data
     * @param data
     */
    public void addDatas(List<T> data) {
        if (data != null&&data.size()>0) {
            datas.addAll(data);
            notifyDataSetChanged();
        }
    }

    public void addDatas(int i,List<T> data) {
        if (data != null&&data.size()>0) {
            datas.addAll(i,data);
            notifyDataSetChanged();
        }
    }

    public void addData(T data) {
        if (data != null) {
            datas.add(data);
            notifyDataSetChanged();
        }
    }
    public void addDataNotNotify(T data) {
        if (data != null) {
            datas.add(data);
        }
    }

    public void clear() {
        datas.clear();
    }

    public void clearAndNotify() {
        datas.clear();
        notifyDataSetChanged();
    }

    /**
     * 获取字符串
     * @param resId
     * @return
     */
    public String getString(int resId){
        return context.getResources().getString(resId);
    }
    public String getString(int resId, Object... args){
        return context.getResources().getString(resId,args);
    }

}
