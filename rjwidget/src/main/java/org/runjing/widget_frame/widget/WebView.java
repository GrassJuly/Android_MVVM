package org.runjing.widget_frame.widget;

import android.content.Context;

/**
 * @Created: qianxs  on 2020.07.09 16:40.
 * @Describe：解决webview使用autosize导致的适配问题
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2020.07.09 16:40.
 * @Remark:
 */
public class WebView extends android.webkit.WebView {

    public WebView(Context context) {
        super(context);
    }

    @Override
    public void setOverScrollMode(int mode) {
        super.setOverScrollMode(mode);
//        ScreenUtils.restoreAdaptScreen();
    }
}
