package org.runjing.widget_frame.utls;

import android.content.Context;
import android.view.View;

import org.runjing.widget_frame.widget.pop.BackPopupWindow;
import org.runjing.widget_frame.widget.pop.MiddlePopupWindow;


/**
 * 公共弹出框
 *
 * @author zm
 */
public class PopupWindowUtil {
    public PopupWindowUtil mPopUtils;
    public static MiddlePopupWindow middleWindow;
    private static PopupWindowUtil instance;

    /**
     * 显示文字信息的pop
     *
     * @param title
     * @param msg
     * @param imgShow
     * @param popWindowCallBack
     */
    public static void showPopWindow(Context context, String title, String msg, boolean imgShow, final MiddlePopupWindow.PopupWindowCallBack popWindowCallBack) {

        try {
            MiddlePopupWindow mWindow = new MiddlePopupWindow(context).builder().setTitle(title).setMsg(msg).setNeg("取消", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popWindowCallBack.onNegativeButtonClick();
                }
            });
            mWindow.setPos("确定", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popWindowCallBack.onPositiveButtonClick();
                }
            });


            mWindow.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param context
     * @param msg
     * @param popupWindowSingleCallBack
     */
    public static void showSingleWindow(Context context, String msg, final MiddlePopupWindow.PopupWindowSingleCallBack popupWindowSingleCallBack) {
        try {
            MiddlePopupWindow mWindow = new MiddlePopupWindow(context).builder().setTitle(msg).setNeg("确定", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popupWindowSingleCallBack.onSingleButtonClick();
                }
            });
            mWindow.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param context
     * @param msg
     * @param popupWindowSingleCallBack
     */
    public static void SingleWindow(Context context, String msg, final MiddlePopupWindow.PopupWindowSingleCallBack popupWindowSingleCallBack) {
        BackPopupWindow mWindow = new BackPopupWindow(context).builder().setTitle(msg).setNeg("确定", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindowSingleCallBack.onSingleButtonClick();
            }
        });
        mWindow.show();
    }

    /**
     * 显示文字信息的pop
     *
     * @param title
     * @param msg
     * @param imgShow
     * @param popWindowCallBack
     */
    public static void showPopWindow(Context context, String title, String msg, String sure, String cancel, boolean imgShow, final MiddlePopupWindow.PopupWindowCallBack popWindowCallBack) {

        try {
            MiddlePopupWindow mWindow = new MiddlePopupWindow(context).builder().setTitle(title).setMsg(msg).setNeg(cancel, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popWindowCallBack.onNegativeButtonClick();
                }
            });
            mWindow.setPos(sure, new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popWindowCallBack.onPositiveButtonClick();
                }
            });
            mWindow.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
