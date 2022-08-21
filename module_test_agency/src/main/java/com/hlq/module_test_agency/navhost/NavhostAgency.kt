package com.hlq.module_test_agency.navhost

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.hlq.appbase.routeConfig.TestAgencyRouteConfig
import com.hlq.module_test_agency.action.TestAgencyAction
import com.hlq.module_test_agency.ui.TestAgencyMainUI

/**
 * @author：HuangLinqing
 * @date ：2022/4/11
 * @desc：查询核酸检测机构 模块路由管理
 */

fun NavGraphBuilder.testAgencyNavhost(navController: NavController) {
    val action = TestAgencyAction(navController = navController)
    navigation(
        startDestination = TestAgencyRouteConfig.AGENCY_MAIN_PAGE,
        route = TestAgencyRouteConfig.AGENCY_ROOT
    ) {
        composable(TestAgencyRouteConfig.AGENCY_MAIN_PAGE) {
            TestAgencyMainUI(action)
        }
    }
}