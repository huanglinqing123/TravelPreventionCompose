package com.hlq.module_risk_level.navhost

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.hlq.appbase.routeConfig.RiskLevelRouteConfig
import com.hlq.module_risk_level.action.RiskLevelAction
import com.hlq.module_risk_level.ui.RiskLevelMainUI

/**
 * @author：HuangLinqing
 * @date ：2022/8/23
 * @desc：风险等级地区 模块路由管理
 */

fun NavGraphBuilder.riskLevelNavhost(navController: NavController) {
    val action = RiskLevelAction(navController = navController)
    navigation(
        startDestination = RiskLevelRouteConfig.RISKLEVEL_MAIN_PAGE,
        route = RiskLevelRouteConfig.RISKLEVEL_ROOT
    ) {
        composable(RiskLevelRouteConfig.RISKLEVEL_MAIN_PAGE) {
            RiskLevelMainUI(riskLevelAction = action)
        }
    }
}