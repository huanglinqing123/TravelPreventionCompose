package com.hlq.moudle_city.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hlq.module_city.bean.reqbean.CityDataReqData
import com.hlq.moudle_city.action.CityAction
import com.hlq.moudle_city.ui.theme.lightGray
import com.hlq.moudle_city.viewmodel.CityDataViewModel

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：城市数据主页面
 */
@Composable
fun CityMainUI(cityAction: CityAction) {
    Scaffold(backgroundColor = lightGray, topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "查询城市数据",
                    fontSize = 16.sp,
                    style = TextStyle(textAlign = TextAlign.Center)
                )
            },
            navigationIcon = {
                Icon(
                    imageVector = Icons.Default.ArrowBack, contentDescription = null,
                    modifier = Modifier
                        .clickable(onClick = {
                            cityAction.back()
                        }, indication = null, interactionSource = remember {
                            MutableInteractionSource()
                        })

                )
            })
    }) {
        cityBody(cityAction)
    }

}