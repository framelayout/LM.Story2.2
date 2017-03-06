package com.dawn.lmstory22.Activitys;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.dawn.lmstory22.R;
import com.dawn.lmstory22.Utils.AllPath;
import com.lzy.okhttputils.OkHttpUtils;
import com.lzy.okhttputils.callback.StringCallback;
import com.squareup.picasso.Picasso;

import java.io.File;

import okhttp3.Call;
import okhttp3.Response;


public class Regist extends AppCompatActivity {

    private ImageView img;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        img= (ImageView) findViewById(R.id.img_regist);

//        Picasso.with(this).load(Environment.getExternalStorageDirectory().getPath()+"/xiaoming.jpg").into(img);

        Picasso.with(this).load(new File(Environment.getExternalStorageDirectory().getPath()+"/xiaoming.jpg"))
                .into(img);



    }

    /**
     *
     * 点击按钮进行注册
     * @param view
     */
    public void Regist(View view) {
        OkHttpUtils.post(AllPath.REGISTPATH)
                .params("nikename","xiaominger1")
                .params("username","lmtest1")
                .params("password","123456")
                .params("portrait",new File(Environment.getExternalStorageDirectory().getPath()+"/xiaoming.jpg"))
//               .params("portrait",new File(uri.getPath()))
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        Log.i("post", "onSuccess:=====> "+s);

                    }
                });


        Toast.makeText(Regist.this, Environment.getExternalStorageDirectory().getPath(), Toast.LENGTH_SHORT).show();


    }

    /**
     * 点击头像进行拍照或从相册中选择
     * @param view
     */
    public void selectPIC(View view) {
        String dir=Environment.getExternalStorageDirectory().getPath();
        String fname="p"+System.currentTimeMillis()+".jpg";
        uri = Uri.parse("file://"+dir+"/"+fname);
        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        intent.putExtra("uri", uri.getPath());
        startActivityForResult(intent,100);
    }

    /**
     * 拍完照后返回
     * @param requestCode  上个页面的请求码
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==100)
        {
            /**
             * 系统定义的键名是data
             */
            if (data!=null)
            {
                if (data.hasExtra("data"))
                {
                    Toast.makeText(Regist.this, "has", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(Regist.this, "data==null!", Toast.LENGTH_SHORT).show();
            }

            Bitmap bitmap=BitmapFactory.decodeFile(uri.getPath());
            img.setImageBitmap(bitmap);
            //使资源图片占满ImageView
            img.setScaleType(ImageView.ScaleType.FIT_XY);
        }
    }

    public void goBack(View view) {
        Intent intent=new Intent(Regist.this,Login.class);
        startActivity(intent);
    }
}
