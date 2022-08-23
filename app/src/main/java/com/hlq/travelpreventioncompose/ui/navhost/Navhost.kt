package com.hlq.travelpreventioncompose.ui.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.hlq.appbase.routeConfig.AppRouteConfig
import com.hlq.module_mine.navhost.mineNavhost
import com.hlq.module_risk_level.navhost.riskLevelNavhost
import com.hlq.module_test_agency.navhost.testAgencyNavhost
import com.hlq.moudle_city.navhost.cityNavhost

/**
 * @author：HuangLinqing
 * @date ：2022/4/11
 * @desc：主导航结构
 */
@Composable
fun MainNavhost() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppRouteConfig.ROOT) {
        //app模块
        appNavhost(navController = navController)
        //查询核酸检测机构模块
        testAgencyNavhost(navController = navController)
        //查询城市数据模块
        cityNavhost(navController = navController)
        //mine 模块
        mineNavhost(navController = navController)
        //风险登记 模块
        riskLevelNavhost(navController = navController)
    }
}