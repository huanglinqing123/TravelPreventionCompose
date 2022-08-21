package com.hlq.module_risk_level.bean.reqbean

import com.hlq.appbase.expand.splitData
import com.hlq.module_risk_level.bean.enum.DataTypeEnum

/**
 * @author：HuangLinqing
 * @blog：https://huanglinqing.blog.csdn.net/?t=1
 * @公众号：Android 技术圈
 * @desc：风险等级数据详细信息
 */
class RiskLevelDetailBean {

    var type: String? = null
    var province: String? = null
    var city: String? = null
    var county: String? = null
    var area_name: String? = null
    var communitys: List<String>? = null
    val communitysString: String
        get() {
            return communitys.splitData()
        }
    var county_code: String? = null

    //数据类型默认是0 为1 即为标题 高风险标题 2是 中风险标题
    var dataType = DataTypeEnum.DATA_IS_RISKLEVEL.ordinal

}