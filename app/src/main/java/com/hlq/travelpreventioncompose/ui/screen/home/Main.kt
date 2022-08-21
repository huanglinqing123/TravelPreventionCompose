package com.hlq.travelpreventioncompose.ui.screen.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.hlq.module_mine.intent.MineAction
import com.hlq.travelpreventioncompose.ui.bean.enum.TAB_ID_0
import com.hlq.travelpreventioncompose.ui.bean.enum.TAB_ID_1
import com.hlq.travelpreventioncompose.ui.bean.enum.Tabs
import com.hlq.travelpreventioncompose.ui.intent.IntentAction
import com.hlq.module_mine.ui.screen.mine.MineScreen
import com.hlq.travelpreventioncompose.ui.theme.Blue
import com.hlq.travelpreventioncompose.ui.theme.Dark

/**
 * @author：HuangLinqing
 * @date ：2022/3/23
 * @desc：main构造
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainUI(action: IntentAction, mineAction: MineAction) {
    var currentIndex by remember {
        mutableStateOf(TAB_ID_0)
    }
    val tabs = Tabs.values()

    Scaffold(bottomBar = {
        BottomNavigation() {
            tabs.forEachIndexed { index, tabs ->
                BottomNavigationItem(selected = currentIndex == index,
                    onClick = { currentIndex = index },
                    icon = {
                        Icon(
                            painter = painterResource(id = tabs.icon),
                            contentDescription = null,
                            modifier = Modifier
                                .height(30.dp)
                                .width(30.dp)
                        )
                    }, label = {
                        Text(text = stringResource(tabs.title))
                    }, selectedContentColor = Blue,
                    unselectedContentColor = Dark
                )
            }
        }
    }) {
        when (currentIndex) {
            TAB_ID_0 -> {
                HomeScreen(action)
            }
            TAB_ID_1 -> {
                MineScreen(mineIntent = mineAction)
            }
        }
    }
}