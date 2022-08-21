package com.hlq.module_risk_level.bean.reqbean

/**
 * @author：HuangLinqing
 * @blog：https://huanglinqing.blog.csdn.net/?t=1
 * @公众号：Android 技术圈
 * @desc： 风险等级返回数据结构
 */
class RiskLevelReqData {
    var updated_date: String? = null
    var high_count: String? = null
    var middle_count: String? = null
    var high_list: List<RiskLevelDetailBean>? = null
    var middle_list: List<RiskLevelDetailBean>? = null
    var list: List<RiskLevelDetailBean>? = null
}