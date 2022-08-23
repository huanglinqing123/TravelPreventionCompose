package com.hlq.module_risk_level.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hlq.appbase.network.HttpErrorDeal
import com.hlq.appbase.state.BaseViewState
import com.hlq.module_risk_level.respository.RiskLevelRespository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**

 * @author: HuangLinqing

 * @date: 2022/8/23

 * @desc:风险等级ViewModel

 */
class RiskLevelViewModel: ViewModel() {

    private val _state = MutableStateFlow<BaseViewState>(BaseViewState.Default)
    val state: StateFlow<BaseViewState>
        get() = _state

    /**
     * 加载风险等级地区数据
     */
    fun loadRiskLevelMessage() {
        _state.value = BaseViewState.IsLoading
        viewModelScope.launch {
            try {
                val data = RiskLevelRespository().loadRiskLevelMessage()
                data?.let {
                    if (data.error_code == 0) {
                        data.result?.let {
                            _state.value = BaseViewState.LoadSuccess(it)
                        }
                    } else {
                        _state.value = BaseViewState.LoadError(data.reason)
                    }
                }?: kotlin.run {
                    //无网络连接
                    _state.value = BaseViewState.LoadError("")
                }
            } catch (e: Exception) {
                HttpErrorDeal.dealHttpError(e)
            }
        }
    }


}