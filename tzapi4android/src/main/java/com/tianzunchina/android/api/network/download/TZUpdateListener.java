package com.tianzunchina.android.api.network.download;

import com.tianzunchina.android.api.network.TZRequest;

import org.json.JSONObject;

/**
 * 版本更新监听
 * Created by zwt on 2017/1/17.
 */

public interface TZUpdateListener {
    /**
     * 获取最新版本信息失败时
     * @param err
     * @param request
     */
    public void err(String err, TZRequest request);

    /**
     * 获取最新版本信息成功时
     *
     * 此方法暂时想不到怎么个用法
     * @param str
     */
    public void success(String str);

    /**
     * 下载中
     * @param percent 进度百分比
     */
    public void downloading(int percent);

    /**
     * 下载成功
     */
    public void downloadSuccess();

    /**
     * 下载失败
     */
    public void downloadErr();

    /**
     * 将接口获取的值转化为TZAppVersion
     * @param object 接口返回值
     * @return TZAppVersion类
     */
    public TZAppVersion json2obj(JSONObject object);

    /**
     * 是否需要更新
     *
     * 每一个app都会有自己判定更新的标准，因此开放此方法进行定义
     * @param newVersion
     * @param oldVersion
     * @return
     */
    public boolean needUpdate(TZAppVersion newVersion, TZAppVersion oldVersion);
}
