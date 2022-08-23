package com.hlq.module_risk_level.action

import androidx.navigation.NavController

/**
 * @author：HuangLinqing
 * @date ：2022/8/23
 * @desc：风险登记地区action
 */
class RiskLevelAction(navController: NavController) {

    /**
     * 返回
     */
    val back: () -> Unit = {
        navController.popBackStack()
    }

}