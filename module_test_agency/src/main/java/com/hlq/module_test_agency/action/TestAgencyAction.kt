package com.hlq.module_test_agency.action

import android.os.Bundle
import androidx.navigation.NavController
import com.hlq.appbase.routeConfig.CityRouteConfig

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：核酸检测机构action
 */
class TestAgencyAction(navController: NavController) {

    /**
     * 返回
     */
    val back: () -> Unit = {
        navController.popBackStack()
    }

    /**
     * 进入选择城市页面
     */
    val goToSelectCity: () -> Unit = {
        navController.navigate(CityRouteConfig.CITY_ROOT)
    }

    /**
     * 获取bundle
     */
    private val getBundle: () -> Bundle? = {
        navController.currentBackStackEntry?.arguments
    }

    /**
     * 获取值
     */
    val getValue: (key: String) -> String? = { key ->
        getBundle()?.getString(key)
    }
}