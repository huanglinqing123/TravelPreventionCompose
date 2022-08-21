package com.hlq.travelpreventioncompose.ui.navhost

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.hlq.appbase.routeConfig.AppRouteConfig
import com.hlq.module_mine.intent.MineAction
import com.hlq.travelpreventioncompose.ui.intent.IntentAction
import com.hlq.travelpreventioncompose.ui.screen.home.MainUI

/**
 * @author：HuangLinqing
 * @date ：2022/4/11
 * @desc：app模块路由管理
 */

fun NavGraphBuilder.appNavhost(navController: NavController) {
    val action = IntentAction(navController = navController)
    val mineAction = MineAction(navController = navController)
    navigation(startDestination = AppRouteConfig.MAIN_PAGE, route = AppRouteConfig.ROOT) {
        composable(AppRouteConfig.MAIN_PAGE) {
            MainUI(action,mineAction)
        }
    }
}