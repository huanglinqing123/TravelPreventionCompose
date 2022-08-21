package com.hlq.travelpreventioncompose.ui.screen.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hlq.travelpreventioncompose.R
import com.hlq.travelpreventioncompose.ui.bean.enum.MENU_ID_1
import com.hlq.travelpreventioncompose.ui.bean.enum.MENU_ID_2
import com.hlq.travelpreventioncompose.ui.bean.enum.MENU_ID_3
import com.hlq.travelpreventioncompose.ui.bean.enum.MainMenu
import com.hlq.travelpreventioncompose.ui.intent.IntentAction
import com.hlq.travelpreventioncompose.ui.screen.MainMenuUI

/**
 * @author：HuangLinqing
 * @date ：2022/3/23
 * @desc：首页页面
 */
@Composable
fun HomeScreen(action: IntentAction) {
    Column(modifier = Modifier.padding(10.dp)) {
        Text(
            text = stringResource(id = R.string.main_string_head), fontSize = 14.sp,
            modifier = Modifier.padding(vertical = 20.dp)
        )
        val mainMenu = MainMenu.values()
        mainMenu.forEachIndexed { _, item ->
            MainMenuUI(title = item.title, icon = item.icon, menuId = item.menuId) {
                //点击事件监听
                when (it) {
                    MENU_ID_1 -> {
                        Log.d("点击测试","-----")
                        //查询核酸检测机构
                        action.enterTestAgency()
                    }
                    MENU_ID_2 -> {
                        //查询风险等级地区
                    }
                    MENU_ID_3 -> {
                        //查询健康出行政策
                    }
                    else -> {

                    }
                }
            }
        }
    }
}