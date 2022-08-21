package com.hlq.travelpreventioncompose.ui.bean.enum

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.hlq.travelpreventioncompose.R

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：主页面菜单数据
 */
enum class MainMenu(
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val menuId: Int
) {
    /**
     * 查询核酸检测机构
     */
    MENU_TEST_AGENCY(R.string.menu_one, R.mipmap.img_agency, MENU_ID_1),


    /**
     * 查询风险等级地区
     */
    MENU_RISK_LEVEL(R.string.menu_two, R.mipmap.img_risk_level, MENU_ID_2),

    /**
     * 查询健康出行政策
     */
    MENU_TRAVEL_POLICY(R.string.menu_three, R.mipmap.img_travel, MENU_ID_3)
}


const val MENU_ID_1 = 1
const val MENU_ID_2 = 2
const val MENU_ID_3 = 3