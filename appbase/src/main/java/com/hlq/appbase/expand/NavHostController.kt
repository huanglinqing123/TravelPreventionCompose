package com.hlq.appbase.expand

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavHostController

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：导航扩展封装
 */

/**
 * 返回指定的route并回调参数
 */
fun NavController.goBackRouteWithParams(
    route: String,
    autoPop: Boolean = true,
    callback: (Bundle.() -> Unit)? = null,
) {
    getBackStackEntry(route).arguments?.let {
        callback?.invoke(it)
    }
    if (autoPop) {
        popBackStack()
    }
}

/**
 * 回到上级页面，并回调参数
 */
fun NavController.goBackWithParams(
    autoPop: Boolean = true,
    callback: (Bundle.() -> Unit)? = null,
) {
    previousBackStackEntry?.arguments?.let {
        callback?.invoke(it)
    }
    if (autoPop) {
        popBackStack()
    }
}
