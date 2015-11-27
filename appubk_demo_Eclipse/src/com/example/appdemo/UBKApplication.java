package com.example.appdemo;

import android.app.Application;

import com.feelwx.ubk.sdk.ui.component.api.UBKAd;

public class UBKApplication extends Application  {

	@Override
	public void onCreate() {
		super.onCreate();
		UBKAd.initialize(this);
		UBKAd.setDebug(true);  // 调试模式，正式发布注释改行
	}

	@Override
	public void onTerminate() {
		UBKAd.destory();
		super.onTerminate();
	}	
}
