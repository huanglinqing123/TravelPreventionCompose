package com.hlq.module_risk_level.ui

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hlq.appbase.state.BaseViewState
import com.hlq.appbase.ui.BasePage
import com.hlq.module_risk_level.R
import com.hlq.module_risk_level.action.RiskLevelAction
import com.hlq.module_risk_level.bean.enum.DataTypeEnum
import com.hlq.module_risk_level.bean.reqbean.RiskLevelDetailBean
import com.hlq.module_risk_level.bean.reqbean.RiskLevelReqData
import com.hlq.module_risk_level.ui.theme.lightGray
import com.hlq.module_risk_level.viewmodel.RiskLevelViewModel

/**

 * @author: HuangLinqing

 * @date: 2022/8/23

 * @desc:风险等级主页面

 */
@Composable
fun RiskLevelMainUI(riskLevelAction: RiskLevelAction) {

    Scaffold(backgroundColor = lightGray, topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "风险等级地区查询",
                    fontSize = 16.sp,
                    style = TextStyle(textAlign = TextAlign.Center)
                )
            },
            navigationIcon = {
                Icon(
                    imageVector = Icons.Default.ArrowBack, contentDescription = null,
                    modifier = Modifier
                        .clickable(onClick = {
                            riskLevelAction.back()
                        }, indication = null, interactionSource = remember {
                            MutableInteractionSource()
                        })

                )
            })
    }) {
        body()
    }
}

/**
 * 内容主体
 */
@Composable
fun body() {

    val viewModel: RiskLevelViewModel = viewModel()
    val state = viewModel.state.collectAsState(BaseViewState.Default)

    LaunchedEffect(state.value) {
        if (state.value == BaseViewState.Default) {
            viewModel.loadRiskLevelMessage()
        }
    }

    BasePage(baseViewState = state.value, onErrorClick = {
        viewModel.loadRiskLevelMessage()
    }) {
        val data = (state.value as BaseViewState.LoadSuccess<RiskLevelReqData>).data
        val list = mutableListOf<RiskLevelDetailBean>()

        data.high_list?.let {
            //添加高风险数据
            val highTitle = RiskLevelDetailBean()
            highTitle.dataType = DataTypeEnum.DATA_IS_HIGH_TITLE.ordinal
            list.add(highTitle)
            list.addAll(it)
        }

        data.middle_list?.let {
            //添加中风险数据
            val middleTitle = RiskLevelDetailBean()
            middleTitle.dataType = DataTypeEnum.DATA_IS_MIDDLE_TITLE.ordinal
            list.add(middleTitle)
            list.addAll(it)
        }
        Column() {
            LazyColumn(content = {
                item {
                    ItemToatalMessage(data)
                }
                item {
                    list.forEachIndexed { _, riskLevelDetailBean ->
                        when (riskLevelDetailBean.dataType) {
                            DataTypeEnum.DATA_IS_HIGH_TITLE.ordinal -> {
                                //高风险数据标题
                                RiskTitle(
                                    title = R.string.risk_high_area_message,
                                    icon = R.mipmap.img_high
                                )
                            }
                            DataTypeEnum.DATA_IS_MIDDLE_TITLE.ordinal -> {
                                //中风险数据标题
                                RiskTitle(
                                    title = R.string.risk_middle_area_message,
                                    icon = R.mipmap.img_middle
                                )
                            }
                            else -> {
                                //数据
                                RiskLevelDetail(riskLevelDetailBean = riskLevelDetailBean)
                            }
                        }
                    }
                }
            })
        }
    }
}