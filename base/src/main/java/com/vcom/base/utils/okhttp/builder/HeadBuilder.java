package com.vcom.base.utils.okhttp.builder;


import com.vcom.base.utils.okhttp.OkHttpUtils;
import com.vcom.base.utils.okhttp.request.OtherRequest;
import com.vcom.base.utils.okhttp.request.RequestCall;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers).build();
    }
}
