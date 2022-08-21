/*
 *
 *  * Copyright (C)  HuangLinqing, TravelPrevention Open Source Project
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.hlq.moudle_city.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hlq.appbase.network.HttpErrorDeal
import com.hlq.appbase.state.BaseViewState
import com.hlq.moudle_city.respository.CityRespository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * @author：HuangLinqing
 * @blog：https://huanglinqing.blog.csdn.net/?t=1
 * @公众号：Android 技术圈
 * @desc：CityDataViewModel
 */
class CityDataViewModel : ViewModel() {


    private val _state = MutableStateFlow<BaseViewState>(BaseViewState.default)
    val state: StateFlow<BaseViewState>
        get() = _state


    /**
     * 加载城市数据清单
     */
    fun loadCityData() {
        _state.value = BaseViewState.isLoading
        viewModelScope.launch {
            try {
                val data = CityRespository().loadCityData()
                data?.let {
                    if (data.error_code == 0) {
                        data.result?.let {
                            delay(2000)
                            _state.value = BaseViewState.loadSuccess(it)
                        }
                    } else {
                        _state.value = BaseViewState.loadError(data.reason)
                    }
                }?: kotlin.run {
                    //无网络连接
                    _state.value = BaseViewState.loadError("")
                }
            } catch (e: Exception) {
                HttpErrorDeal.dealHttpError(e)
            }
        }
    }
}