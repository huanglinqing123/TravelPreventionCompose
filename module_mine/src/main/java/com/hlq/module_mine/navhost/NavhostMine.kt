package com.hlq.module_mine.navhost

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.hlq.appbase.routeConfig.MineRouteConfig
import com.hlq.appbase.routeConfig.MineRouteConfig.BLOG
import com.hlq.module_mine.intent.MineAction
import com.hlq.module_mine.ui.screen.mine.MineScreen
import com.hlq.module_mine.ui.screen.mine.MyBlog

/**
 * @author：HuangLinqing
 * @date ：2022/4/11
 * @desc：app模块路由管理
 */

fun NavGraphBuilder.mineNavhost(navController: NavController) {
    val action = MineAction(navController = navController)
    navigation(startDestination = MineRouteConfig.MAIN_PAGE, route = MineRouteConfig.ROOT) {
        composable(MineRouteConfig.MAIN_PAGE) {
            MineScreen(action)
        }

        composable(BLOG) {
            MyBlog(mineAction = action)
        }
    }
}