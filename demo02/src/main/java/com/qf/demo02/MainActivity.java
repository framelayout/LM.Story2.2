package com.qf.demo02;

import android.graphics.Color;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 侧滑布局
 */
public class MainActivity extends AppCompatActivity {
    private SlidingPaneLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (SlidingPaneLayout) findViewById(R.id.layout);

        //设置滑动出左边界面的阴影视图
        layout.setShadowResourceLeft(R.mipmap.ic_launcher);

        //设置滑动侧面布局的时候，主界面的颜色变化
        layout.setSliderFadeColor(Color.BLACK);


        layout.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {

            }

            @Override
            public void onPanelOpened(View panel) {
            }
            @Override
            public void onPanelClosed(View panel) {

            }
        });

    }

    //点击打开侧滑布局
    public void openSlidingLayout(View view){
        //打开侧滑布局
        layout.openPane();

        //关闭侧滑布局
       // layout.closePane();

        //侧滑布局是否打开
        //boolean isOpen = layout.isOpen();
    }
}
