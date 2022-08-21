package com.hlq.travelpreventioncompose.ui.bean.enum

import android.telecom.CallScreeningService
import androidx.annotation.DrawableRes
import androidx.annotation.StringDef
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import com.hlq.travelpreventioncompose.R

/**
 * @author：HuangLinqing
 * @date ：2022/3/23
 * @desc：选项卡数据
 */
enum class Tabs(
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val tabId: Int
) {

    /**
     * 首页
     */
    HOME_PAGE(R.string.home, R.mipmap.home_dark, TAB_ID_0),


    /**
     * 我的
     */
    MINE_PAGE(R.string.mine, R.mipmap.mine_dark, TAB_ID_1)

}

/**
 * tabId 0
 */
const val TAB_ID_0 = 0

/**
 * tabId 1
 */
const val TAB_ID_1 = 1