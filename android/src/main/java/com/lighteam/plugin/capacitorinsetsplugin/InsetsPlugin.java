package com.lighteam.plugin.capacitorinsetsplugin;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin
public class InsetsPlugin extends Plugin {

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", value);
        call.success(ret);
    }

    @PluginMethod
    public void top(PluginCall call) {
        Rect rectangle = new Rect();

        Activity currentActivity = ((Activity)getContext());
        currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rectangle);
        DisplayMetrics metrics = currentActivity.getResources().getDisplayMetrics();

        float statusBarHeight = rectangle.top / metrics.density;

        JSObject ret = new JSObject();
        ret.put("value", statusBarHeight);
        call.success(ret);
    }
}
