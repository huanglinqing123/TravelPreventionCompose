package com.hlq.travelpreventioncompose.ui.intent

import android.util.Log
import androidx.navigation.NavController
import com.hlq.appbase.routeConfig.TestAgencyRouteConfig

/**
 * @author：HuangLinqing
 * @date ：2022/4/11
 * @desc：用户意图
 */
class IntentAction(navController: NavController) {

    /**
     * 进入核酸检测机构
     */
    val enterTestAgency: () -> Unit = {
        Log.d("点击测试","走到方法里了")
        navController.navigate(TestAgencyRouteConfig.AGENCY_MAIN_PAGE)
    }
}