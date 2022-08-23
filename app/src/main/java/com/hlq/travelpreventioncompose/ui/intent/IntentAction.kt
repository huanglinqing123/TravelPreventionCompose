package com.hlq.travelpreventioncompose.ui.intent

import android.util.Log
import androidx.navigation.NavController
import com.hlq.appbase.routeConfig.RiskLevelRouteConfig
import com.hlq.appbase.routeConfig.TestAgencyRouteConfig

/**
 * @author：HuangLinqing
 * @date ：2022/4/11
 * @desc：用户意图
 */
class IntentAction(navController: NavController) {

    /**
     * 进入核酸检测机构 页面
     */
    val enterTestAgency: () -> Unit = {
        navController.navigate(TestAgencyRouteConfig.AGENCY_MAIN_PAGE)
    }

    /**
     * 进入风险登记地区 页面
     */
    val enterRiskLevel: () -> Unit = {
        navController.navigate(RiskLevelRouteConfig.RISKLEVEL_MAIN_PAGE)
    }


}