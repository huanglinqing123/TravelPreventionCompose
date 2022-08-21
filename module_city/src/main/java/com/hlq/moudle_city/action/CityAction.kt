package com.hlq.moudle_city.action

import androidx.navigation.NavController
import com.google.gson.Gson
import com.hlq.appbase.expand.goBackWithParams
import com.hlq.appbase.routeConfig.ParamsConfig.KEY
import com.hlq.module_city.bean.reqbean.CityDataReqData

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：城市数据action
 */
class CityAction(navController: NavController) {

    /**
     * 返回
     */
    val back: () -> Unit = {
        navController.popBackStack()
    }

    /**
     * 返回并传参
     */
    val backWithParams: (data: CityDataReqData.CitysData) -> Unit = { data ->
        navController.goBackWithParams {
            putString(KEY, Gson().toJson(data))
        }
    }
}