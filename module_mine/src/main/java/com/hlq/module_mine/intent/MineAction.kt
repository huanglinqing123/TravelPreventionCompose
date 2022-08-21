package com.hlq.module_mine.intent

import android.util.Log
import androidx.navigation.NavController
import com.hlq.appbase.routeConfig.MineRouteConfig
import com.hlq.appbase.routeConfig.TestAgencyRouteConfig

/**
 * @author：HuangLinqing
 * @date ：2022/4/14
 * @desc：我的
 */
class MineAction(navController: NavController) {

    /**
     * 返回
     */
    val back: () -> Unit = {
        navController.popBackStack()
    }

    /**
     * 跳转博客页面
     */
    val toMyBlog: () -> Unit = {
        navController.navigate(MineRouteConfig.BLOG)
    }

}