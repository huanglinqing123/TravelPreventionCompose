package com.hlq.module_test_agency.ui

import android.annotation.SuppressLint
import android.text.TextUtils
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.gson.Gson
import com.hlq.appbase.routeConfig.ParamsConfig
import com.hlq.appbase.ui.Loading
import com.hlq.module_city.bean.reqbean.CityDataReqData
import com.hlq.module_test_agency.action.TestAgencyAction
import com.hlq.module_test_agency.bean.state.TestAgencyState
import com.hlq.module_test_agency.ui.theme.lightGray
import com.hlq.module_test_agency.viewModel.AgencyViewModel

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：查询核酸检测机构主页面
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TestAgencyMainUI(testAgencyAction: TestAgencyAction) {
    Scaffold(backgroundColor = lightGray, topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "核酸检测机构",
                    fontSize = 16.sp,
                    style = TextStyle(textAlign = TextAlign.Center)
                )
            },
            navigationIcon = {
                Icon(
                    imageVector = Icons.Default.ArrowBack, contentDescription = null,
                    modifier = Modifier
                        .clickable(onClick = {
                            testAgencyAction.back()
                        }, indication = null, interactionSource = remember {
                            MutableInteractionSource()
                        })

                )
            })
    }) {
        body(testAgencyAction = testAgencyAction)
    }
}

/**
 * body 内容区域
 */
@Composable
fun body(testAgencyAction: TestAgencyAction) {
    val viewModel: AgencyViewModel = viewModel()
    Column {
        Row(
            modifier = Modifier
                .padding(vertical = 10.dp)
                .height(50.dp)
                .background(Color.White)
                .clickable {
                    testAgencyAction.goToSelectCity()
                }
        ) {
            var cityId = "";
            val cityName = remember {
                mutableStateOf("请选择")
            }
            testAgencyAction.getValue(ParamsConfig.KEY)?.let {
                val cityData =
                    Gson().fromJson(
                        it,
                        CityDataReqData.CitysData::class.java
                    )
                cityId = cityData.city_id!!
                cityName.value = cityData.city.toString()
            }

            Text(
                text = cityName.value,
                Modifier
                    .weight(1f)
                    .padding(start = 10.dp)
                    .align(Alignment.CenterVertically)
            )
            Image(
                painter = painterResource(id = com.hlq.appbase.R.mipmap.img_enter),
                contentDescription = null,
                Modifier
                    .padding(end = 5.dp)
                    .align(Alignment.CenterVertically)
            )
            LaunchedEffect(cityId) {
                if (!TextUtils.isEmpty(cityId)) {
                    viewModel.loadTestAgencyMessage(cityId = cityId)
                }
            }

        }

        val uiState = viewModel.state.collectAsState()
        when (uiState.value) {
            is TestAgencyState.isLoading -> {
                Loading()
            }
            is TestAgencyState.OnSuccess -> {
                val list = (uiState.value as TestAgencyState.OnSuccess).agencyMessageReqData
                LazyColumn(content = {
                    item {
                        list.forEachIndexed { index, data ->
                            AgencyItem(data)
                        }
                    }
                })
            }
            is TestAgencyState.OnError -> {

            }
            else -> {}
        }
    }

}