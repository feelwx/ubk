package com.example.appdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.appdemo.R;
import com.feelwx.ubk.sdk.ui.component.api.AdRequest;
import com.feelwx.ubk.sdk.ui.component.api.UBKAd;

public class MainActivity extends Activity implements OnClickListener {

    String TAG = "MainActivity";

    Button ad_banner_btn = null;
    Button ad_injection_btn = null;
    Button ad_injection_full_btn = null;
    Button ad_notification_btn = null;
    Button ad_h5_btn = null;
    Button show_device_btn = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ad_banner_btn = (Button) this.findViewById(R.id.ad_banner_btn);
        ad_injection_btn = (Button) this.findViewById(R.id.ad_injection_btn);
        ad_injection_full_btn = (Button) this.findViewById(R.id.ad_injection_full_btn);
        ad_notification_btn = (Button) this.findViewById(R.id.ad_notification_btn);
        ad_h5_btn = (Button) this.findViewById(R.id.ad_h5_btn);
        show_device_btn = (Button) this.findViewById(R.id.show_device);

        ad_banner_btn.setOnClickListener(this);
        ad_injection_btn.setOnClickListener(this);
        ad_injection_full_btn.setOnClickListener(this);
        ad_notification_btn.setOnClickListener(this);
        ad_h5_btn.setOnClickListener(this);
        show_device_btn.setOnClickListener(this);

    }

    @Override
    protected void onDestroy() {
        // VolleyQueue.release();
        super.onDestroy();
    }

    // 广告banner演示
    void ad_banner_btn() {
        AdRequest adReq = new AdRequest(this, AdRequest.AD_TYPE_BANNER, "Banner演示");
        adReq.setBannerType(AdRequest.AD_BANNER_BOTTOM);
        UBKAd.requestAd(adReq);

    }

    // 广告插屏演示
    void ad_injection_btn() {
        AdRequest adReq = new AdRequest(this, AdRequest.AD_TYPE_INJECTION_HALF, "half_screen");
        UBKAd.requestAd(adReq);
    }

    // 广告全屏演示
    void ad_injection_full_btn() {
        AdRequest adReq = new AdRequest(this, AdRequest.AD_TYPE_INJECTION_FULL, "full_screen");
        UBKAd.requestAd(adReq);
    }

    // 广告通知演示
    void ad_notification_btn() {
        AdRequest adReq = new AdRequest(this, AdRequest.AD_TYPE_NOTIFICATION, "app_push");
        UBKAd.requestAd(adReq);

    }

    // 广告H5演示
    void ad_h5_btn() {
        AdRequest adReq = new AdRequest(this, AdRequest.AD_TYPE_RECOMMEND_WALL, "appDemo_click_h5");
        UBKAd.requestAd(adReq);
    }

    @Override
    public void onClick(View arg0) {
        int id = arg0.getId();
        switch (id) {
            case R.id.show_device:
                SharedPreferences sp = this.getSharedPreferences("appubk_config", 0);
                long devid = sp.getLong("device", 0L);
                showDialog("设备号", String.valueOf(devid));
                break;
            case R.id.ad_banner_btn:
                ad_banner_btn();
                break;
            case R.id.ad_injection_btn:
                ad_injection_btn();
                break;
            case R.id.ad_injection_full_btn:
                ad_injection_full_btn();
                break;
            case R.id.ad_notification_btn:
                ad_notification_btn();
                break;
            case R.id.ad_h5_btn:
                ad_h5_btn();
                break;
        }
    }

    void showDialog(String title, String message) {
        new AlertDialog.Builder(this).setTitle(title).setMessage(message).setPositiveButton("确定", null).show();
    }
}
