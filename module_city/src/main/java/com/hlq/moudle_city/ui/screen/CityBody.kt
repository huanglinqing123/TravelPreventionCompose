package com.hlq.moudle_city.ui.screen

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hlq.appbase.state.BaseViewState
import com.hlq.appbase.ui.BasePage
import com.hlq.appbase.ui.Loading
import com.hlq.module_city.bean.reqbean.CityDataReqData
import com.hlq.moudle_city.action.CityAction
import com.hlq.moudle_city.viewmodel.CityDataViewModel

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：城市数据内容
 */
@Composable
fun cityBody(cityAction: CityAction) {

    val viewModel: CityDataViewModel = viewModel()
    val state = viewModel.state.collectAsState(BaseViewState.default)
    LaunchedEffect(state.value) {
        if (state.value == BaseViewState.default) {
            Log.d("网络请求", "--出发请求--")
            viewModel.loadCityData()
        }
    }
    BasePage(baseViewState = state.value, onErrorClick = {
        viewModel.loadCityData()
    }) {
        when (state.value) {
            is BaseViewState.loadSuccess<*> -> {
                val list = (state.value as BaseViewState.loadSuccess<List<CityDataReqData>>).data
                //城市数据
                val cityList = mutableListOf<CityDataReqData.CitysData>()
                list.let { it ->
                    for (i in it.indices) {
                        val data = it[i].citys
                        data?.let { data ->
                            for (index in data.indices) {
                                cityList.add(data[index])
                            }
                        }
                    }
                    cityList.sort()
                }
                LazyColumn() {
                    item {
                        //显示数据
                        for (i in cityList.indices) {
                            val firstLetterIsShow = if (i == 0) {
                                true
                            } else {
                                cityList[i].firstLetter != cityList[i - 1].firstLetter
                            }
                            CityUI(citysData = cityList[i], onClick = {
                                cityAction.backWithParams(it)
                            }, firstLetterIsShow = firstLetterIsShow)
                        }
                    }
                }

            }
            else -> {}
        }
    }


}