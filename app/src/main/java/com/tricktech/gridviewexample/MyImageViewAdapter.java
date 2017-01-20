package com.tricktech.gridviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by am on 1/20/2017.
 */

public class MyImageViewAdapter extends BaseAdapter {

    public Integer[] mThumbIds = {
            R.drawable.photo_female_1, R.drawable.photo_male_1,
            R.drawable.photo_female_2, R.drawable.photo_male_2,
            R.drawable.photo_female_3, R.drawable.photo_male_3,
            R.drawable.photo_female_4, R.drawable.photo_male_4,
            R.drawable.photo_female_5, R.drawable.photo_male_5,
            R.drawable.photo_female_6, R.drawable.photo_male_6,
            R.drawable.photo_female_7, R.drawable.photo_male_7,
            R.drawable.photo_female_8, R.drawable.photo_male_8,
    };
    public Context mContext;

    public MyImageViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return mThumbIds[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(300,300));
        return imageView;
    }
}
