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

package com.hlq.module_risk_level.respository

import com.google.gson.Gson
import com.hlq.appbase.network.BaseReqData
import com.hlq.appbase.network.RetrofirServiceBuilder
import com.hlq.module_risk_level.api.RiskLevelApi
import com.hlq.module_risk_level.bean.reqbean.RiskLevelReqData

/**
 * @author：HuangLinqing
 * @blog：https://huanglinqing.blog.csdn.net/?t=1
 * @公众号：Android 技术圈
 * @desc：数据仓库层
 */
class RiskLevelRespository {

    //创建service实例
    private var netWork = RetrofirServiceBuilder.createService(
        RiskLevelApi::class.java
    )

    /**
     * 查询风险等级地区
     */
    suspend fun loadRiskLevelMessage(): BaseReqData<RiskLevelReqData>?{
        netWork?.let {
            return it.loadRiskLevelMessage()
        }
        return null
    }

    var mstring = "{\n" +
        "\t\"reason\": \"success!\",\n" +
        "\t\"result\": {\n" +
        "\t\t\"updated_date\": \"2022-08-23 11:00:00\",\n" +
        "\t\t\"high_count\": \"1356\",\n" +
        "\t\t\"middle_count\": \"1158\",\n" +
        "\t\t\"low_count\": \"186\",\n" +
        "\t\t\"high_list\": [{\n" +
        "\t\t\t\"type\": \"2\",\n" +
        "\t\t\t\"province\": \"北京市\",\n" +
        "\t\t\t\"city\": \"顺义区\",\n" +
        "\t\t\t\"county\": \"双丰街道\",\n" +
        "\t\t\t\"area_name\": \"北京市 顺义区 双丰街道\",\n" +
        "\t\t\t\"communitys\": [\"鲁能7号院溪园36号楼\"],\n" +
        "\t\t\t\"county_code\": \"110113012\"\n" +
        "\t\t}],\n" +
        "\t\t\"middle_list\": [{\n" +
        "\t\t\t\"type\": \"2\",\n" +
        "\t\t\t\"province\": \"北京市\",\n" +
        "\t\t\t\"city\": \"顺义区\",\n" +
        "\t\t\t\"county\": \"双丰街道\",\n" +
        "\t\t\t\"area_name\": \"北京市 顺义区 双丰街道\",\n" +
        "\t\t\t\"communitys\": [\"鲁能7号院溪园36号楼\"],\n" +
        "\t\t\t\"county_code\": \"110113012\"\n" +
        "\t\t}]\n" +
        "\n" +
        "\n" +
        "\t}\n" +
        "}"

    val data = Gson().fromJson(mstring,BaseReqData<RiskLevelReqData>()::class.java)


}