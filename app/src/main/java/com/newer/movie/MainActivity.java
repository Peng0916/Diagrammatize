package com.newer.movie;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.newer.movie.Fragment.FramentAdapter;
import com.newer.movie.Fragment.FristFragment;
import com.newer.movie.Fragment.SecondFragment;
import com.newer.movie.Fragment.ThreeFragment;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 4.1 初始化抽屉
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        // 4.1 实例化 ViewPager
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        if (viewPager != null) {
            setViewPager(viewPager);
        }
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        // one-stop shop (一站式服务)
        tabs.setupWithViewPager(viewPager);

        // 工具栏
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // 应用栏 (修改样式)
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);

        // 浮动按钮
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Snackbar 类似于 Toast
                Snackbar.make(v, "Snackbar", Snackbar.LENGTH_SHORT).
                        setAction(R.string.app_name, null).show();
            }
        });

        // 8.1 导航视图
        NavigationView navView = (NavigationView) findViewById(R.id.nv_view);
        if (navView != null) {
            setNavView(navView);
        }
    }

    // 8.2 初始化导航视图
    private void setNavView(NavigationView navView) {
        // -- 左侧抽屉导航视图 (用户名 / 图片) ------------------------------
        // ImageView imgView = (ImageView) navView.findViewById(R.id.image_view);
        // TextView tvUsername = (TextView) navView.findViewById(R.id.tv_username);
        // imgView.setImageResource(R.drawable.ic_dashboard);
        // tvUsername.setText("Jerry");

        // -- 左侧抽屉导航视图 菜单 ------------------------------
        // 导航视图中的菜单选中事件
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_set:
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle("DrawerLayout");
                        builder.setMessage("DrawerLayout acts as a top-level container for window content");
                        builder.create().show();
                        break;
                }
                // 关闭抽屉
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    // 5.2 加载菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.top_menu, menu);
        return true;
    }

    // 4.2 抽屉把手
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // 点击左上角图标,打开左侧抽屉 (END 右侧抽屉)
                drawerLayout.openDrawer(GravityCompat.START);
                break;
        }
        return true;
    }

    //Fragment
    private void setViewPager(ViewPager viewPager) {
        // 4.2.1 实例化适配器
        FramentAdapter adapter = new FramentAdapter(this.getSupportFragmentManager());
        // 4.2.2 新增 数据
        adapter.add(getString(R.string.frist), new FristFragment());
        adapter.add(getString(R.string.second), new SecondFragment());
        adapter.add(getString(R.string.three), new ThreeFragment());

        // 4.3.3 适配器与shitu关联
        viewPager.setAdapter(adapter);
    }
}
