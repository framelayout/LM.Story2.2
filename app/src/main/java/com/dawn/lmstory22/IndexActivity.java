package com.dawn.lmstory22;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.dawn.lmstory22.Activitys.MyStory;
import com.dawn.lmstory22.Activitys.PersonCenter;
import com.dawn.lmstory22.Activitys.Settings;
import com.dawn.lmstory22.Activitys.WriteStory;
import com.dawn.lmstory22.Adapter.AD_IndexLv;
import com.dawn.lmstory22.Bean.GetStory;
import com.dawn.lmstory22.Utils.AllPath;
import com.dawn.lmstory22.Utils.MYDwonload;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class IndexActivity extends AppCompatActivity{

    private SlidingPaneLayout sidelayout;

    /**
     * 侧边栏是否打开
     */
    private boolean Isclose;
    private String ss=null;
    private ListView index_lv;
    private AD_IndexLv adapter;
    private GetStory getStory;

    private Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        sidelayout = (SlidingPaneLayout) findViewById(R.id.sidelayout);
//        final LinearLayout overindex = (LinearLayout) findViewById(R.id.overindexlayout);

        //设置滑动侧面布局的时候，主界面的颜色变化
        sidelayout.setSliderFadeColor(Color.BLACK);
        Isclose=true;

        //侧滑监听事件
        /*
        sidelayout.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
//                if(slideOffset<0.4f){
//                    overindex.setAlpha(slideOffset);
//                }
                overindex.setAlpha((float)(slideOffset*0.3));
            }

            @Override
            public void onPanelOpened(View panel) {

            }

            @Override
            public void onPanelClosed(View panel) {

                overindex.setAlpha(0);
            }
        });
        */

        Log.e("TAG", "onCreate:====> "+Thread.currentThread().getId());

        try {
            MYDwonload.down(AllPath.GETSTORYPATH, new MYDwonload.Callback() {
                @Override
                public void doData(String result) {
                    ss=result;
                    Log.e("TAG", "doData:====> "+ss);

                    Gson gson=new Gson();
                    getStory=gson.fromJson(ss.toString(),GetStory.class);

                    Message message=handler.obtainMessage();
                    message.obj=1;
                    handler.sendMessage(message);

                    Log.e("TAG", "doData:====> "+getStory.getMsg());
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if ((int)(msg.obj)==1)
                {
                    index_lv = (ListView) findViewById(R.id.index_lv);
                    Log.e("TAG", "onCreate:====> "+(getStory==null));
                    adapter=new AD_IndexLv(getStory.getData(),IndexActivity.this);

                    index_lv.setAdapter(adapter);
                }
            }
        };


    }


    public void goBack(View view) {
        finish();
    }

    public void toMyStory(View view) {
        startActivity(new Intent(this, MyStory.class));
    }

    public void toPersonCenter(View view) {
        startActivity(new Intent(this, PersonCenter.class));
    }

    public void toSettings(View view) {
        startActivity(new Intent(this, Settings.class));
    }

    public void quit(View view) {
        super.finish();
    }

    /**
     * 点击图片按钮打开或关闭侧边页面
     * @param view
     */
    public void showSide(View view) {
        sidelayout.openPane();
        if(!sidelayout.isOpen()){
            sidelayout.openPane();
            Isclose=false;
        }
        else{
            sidelayout.closePane();
            Isclose=true;
        }

    }  //点击按钮打开或关闭侧边栏

    //点击图片发表新文
    public void toWrite(View view) {
        startActivity(new Intent(this, WriteStory.class));
    }
}
