package com.yugy.v2ex.daily.sdk;

/**
 * Created by yulu on 16/9/12.
 */
public class AsyncHttpClient extends com.loopj.android.http.AsyncHttpClient {
    public AsyncHttpClient() {
        super(true, 80, 443);
    }
}
