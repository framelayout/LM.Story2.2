package com.dawn.lmstory22.Utils;


import android.os.Handler;
import android.util.Log;

import com.dawn.lmstory22.Activitys.MyStory;
import com.dawn.lmstory22.Bean.GetStory;
import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;


/**
 * Created by Administrator on 2017/2/25.
 */
public  class MYDwonload {

    private static Handler handler=new Handler();

    private static String result=null;

    public static void down(final String url,final Callback callback) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpUtils.get(url)
                        .params("type","new")
                        .params("page","1")
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(final String s, Call call, Response response) {
                                Log.e("TAG", "onSuccess:====> "+ Thread.currentThread().getId());
                                Log.e("TAG", "onSuccess:====> s:"+s);
                                Log.e("TAG", "onSuccess:====> call:"+call.toString());
                                Log.e("TAG", "onSuccess:====> response:"+response.toString());

                                handler.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        callback.doData(s);
                                    }
                                });

                            }
                        });
            }
        }).start();



    }

    public interface Callback{
        void doData(String result);
    }
}
