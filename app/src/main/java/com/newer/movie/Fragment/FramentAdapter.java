package com.newer.movie.Fragment;

/**
 * Created by Administrator on 2016/6/6.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class FramentAdapter extends FragmentPagerAdapter {
    // 标题 数据集合
    private List<String> titles = new ArrayList<>();
    // Fragment 数据集合
    private List<Fragment> fragments = new ArrayList<>();

    // 4.3.1 构造方法
    public FramentAdapter(FragmentManager fm) {
        super(fm);
    }

    // 4.3.2 返回指定位置的 Fragment
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    // 4.3.3 总数目
    @Override
    public int getCount() {
        return fragments.size();
    }

    // 4.3.4 自定义方法 (用于新增数据集合)
    public void add(String title, Fragment fragment) {
        titles.add(title);
        fragments.add(fragment);
    }

    // 5.1 设置页面标题
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
