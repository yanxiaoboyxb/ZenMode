package com.zenmode.yan.activity;

import android.os.Bundle;

import com.zenmode.yan.R;
import com.zenmode.yan.base.BaseActivity;
import com.zenmode.yan.data.DataOperating;
import com.zenmode.yan.entity.DateEntity;
import com.zenmode.yan.utils.LogUtil;


/***
 * @Description:
 * @ClassName: MainActivity
 * @Author: Mr.Yan
 * @Date: 2019/7/13 18:56
 * */
public class MainActivity extends BaseActivity {
    private static final String LOG_TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataOperating dop = new DataOperating();
        dop.createData();
        DateEntity dateEntity = dop.QueryDate();

        if (null != dateEntity){
            LogUtil.d(LOG_TAG, dateEntity.toString());
        }
    }
}
