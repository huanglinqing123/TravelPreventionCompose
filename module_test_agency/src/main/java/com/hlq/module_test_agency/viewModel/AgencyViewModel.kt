package com.hlq.module_test_agency.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.hlq.appbase.network.HttpErrorDeal
import com.hlq.module_test_agency.bean.reqbean.AgencyMessageReqData
import com.hlq.module_test_agency.bean.state.TestAgencyState
import com.hlq.module_test_agency.respository.AgencyRespository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：核酸检测机构viewmodel
 */
class AgencyViewModel(application: Application) : AndroidViewModel(application) {

    private val _state = MutableStateFlow<TestAgencyState>(TestAgencyState.defaut)
    val state: StateFlow<TestAgencyState>
        get() = _state

    /**
     * 查询核酸检测机构信息
     * @param cityId 城市id
     */
    fun loadTestAgencyMessage(cityId: String) {
        _state.value = TestAgencyState.isLoading
        viewModelScope.launch {
            try {
                val data = AgencyRespository().loadTestAgencyMessage(cityId)
                data?.let {
                    if (it.error_code == 0) {
                        it.result?.data?.let { data ->
                            _state.value = TestAgencyState.OnSuccess(data)
                        }
                    } else {
                        _state.value = TestAgencyState.OnError(data.reason)
                    }
                }
            } catch (e: Exception) {
                HttpErrorDeal.dealHttpError(e)
            }


        }
    }
}