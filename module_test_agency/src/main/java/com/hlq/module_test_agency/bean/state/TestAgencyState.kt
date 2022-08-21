package com.hlq.module_test_agency.bean.state

import com.hlq.module_city.bean.reqbean.CityDataReqData
import com.hlq.module_test_agency.bean.reqbean.AgencyMessageReqData

/**
 * @author：HuangLinqing
 * @date ：2022/4/13
 * @desc：核酸检测机构 view state
 */
sealed class TestAgencyState {

    //默认状态
    object defaut : TestAgencyState()

    //正在加载
    object isLoading : TestAgencyState()

    //加载成功
    data class OnSuccess(val agencyMessageReqData: List<AgencyMessageReqData.Data>) :
        TestAgencyState()

    //加载失败
    data class OnError(val error: String) : TestAgencyState()

}
