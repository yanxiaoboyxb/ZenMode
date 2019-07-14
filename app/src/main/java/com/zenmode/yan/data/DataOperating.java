package com.zenmode.yan.data;

import android.database.sqlite.SQLiteDatabase;

import com.zenmode.yan.entity.DateEntity;

import org.litepal.LitePal;

import java.util.Date;
import java.util.List;

/***
 * @Description: 数据读写类
 * @ClassName: ReadWriteData
 * @Author: Mr.Yan
 * @Date: 2019/7/14 2:47
 * */
public class DataOperating {
    public void createData(){
        //创建数据库
        LitePal.getDatabase();

        //删除数据库中数据
        LitePal.deleteAll(DateEntity.class,"iszentime = ?" ,"0");

        DateEntity de = new DateEntity();
        de.setIsZenTime(0);
        de.setStartTime(System.currentTimeMillis());
        de.setEndTime(System.currentTimeMillis());
        de.setAtLastEndTime(System.currentTimeMillis());
        de.save();
    }
    public DateEntity QueryDate(){
        List<DateEntity> dateEntityList = LitePal.where("iszentime = ?", "1").find(DateEntity.class);
        return dateEntityList == null || dateEntityList.size() == 0 ? null : dateEntityList.get(0);
    }
}
