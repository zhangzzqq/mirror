package com.databox.mirror.function.guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;


import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * author: steven
 * date: 2021/1/28
 * desc:
 */
public class GuidePageViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List mList=new ArrayList();

    public GuidePageViewPagerAdapter(List mPageList, GuidePageActivity guidePageActivity) {
        mList.clear();
        this.mContext = guidePageActivity;
        this.mList = mPageList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        return null;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }


    public interface onItemClickListener{
        void onItemClick(int position);
    }
    private   onItemClickListener itemClickListener;
    public void getItem(onItemClickListener listener){
        this.itemClickListener = listener;
    }


}








