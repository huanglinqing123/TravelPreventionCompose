package com.hlq.moudle_city.navhost

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.hlq.appbase.routeConfig.CityRouteConfig
import com.hlq.appbase.routeConfig.TestAgencyRouteConfig
import com.hlq.moudle_city.action.CityAction
import com.hlq.moudle_city.ui.screen.CityMainUI

/**
 * @author：HuangLinqing
 * @date ：2022/4/11
 * @desc：查询核酸检测机构 模块路由管理
 */

fun NavGraphBuilder.cityNavhost(navController: NavController) {
    val action = CityAction(navController = navController)
    navigation(
        startDestination = CityRouteConfig.CITY_MAIN_PAGE,
        route = CityRouteConfig.CITY_ROOT
    ) {
        composable(CityRouteConfig.CITY_MAIN_PAGE) {
            CityMainUI(action)
        }
    }
}