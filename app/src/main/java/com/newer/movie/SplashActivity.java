package com.newer.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;

import com.newer.movie.Utils.Utils;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = getLayoutInflater().inflate(R.layout.activity_splash, null);
        setContentView(view);

        // 渐变动画
        AlphaAnimation animation = new AlphaAnimation(0.3f, 1.0f);
        animation.setDuration(1500);
        view.setAnimation(animation);
    }

    @Override
    protected void onStart() {
        super.onStart();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

//                Class<?> cls = null;
//                if (Utils.getUser(SplashActivity.this).getId() > 0) {
//                    // 已成功登录
//                } else {
//                  // 未登录
//                }

                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                SplashActivity.this.finish();

//                // 初始化 SQLite 数据库中的站点/线路的数据
//                BusDataService service = new BusDataService(SplashActivity.this);
//                long count = service.queryInitData();
//                if (count == 0) {
//                    service.addBusInfo();
//                    service.addSiteInfo();
//                    service.addBusSite();
//                    Log.v("MainActivity", "初始化 SQLite 数据库中的站点/线路的数据");
//                }
            }
        }).start();
    }
}

