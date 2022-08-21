package com.hlq.module_risk_level.api

import com.hlq.appbase.network.BaseApi
import com.hlq.appbase.network.BaseReqData
import com.hlq.module_risk_level.bean.reqbean.RiskLevelReqData
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author：HuangLinqing
 * @blog：https://huanglinqing.blog.csdn.net/?t=1
 * @公众号：Android 技术圈
 * @desc：风险等级api
 */
interface RiskLevelApi {

    /**
     * 查询风险等级数据
     * @param key 接口key值 无须传
     */
    @GET("risk")
    suspend fun loadRiskLevelMessage(
        @Query("key") key: String = BaseApi.KEY
    ): BaseReqData<RiskLevelReqData>
}