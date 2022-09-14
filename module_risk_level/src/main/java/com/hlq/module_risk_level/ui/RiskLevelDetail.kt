package com.hlq.module_risk_level.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hlq.module_risk_level.bean.reqbean.RiskLevelDetailBean

/**

 * @author: HuangLinqing

 * @date: 2022/9/13

 * @desc:数据详情

 */

@Composable
fun RiskLevelDetail(riskLevelDetailBean: RiskLevelDetailBean) {
    Card(
        elevation = 10.dp, backgroundColor = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column(
            modifier = Modifier
                .height(100.dp)
                .padding(10.dp)
        ) {
            Text(text = riskLevelDetailBean.area_name + "", fontSize = 16.sp, color = Color.Black)
            riskLevelDetailBean.communitys?.forEachIndexed { index, _ ->
                Text(text = riskLevelDetailBean.communitys?.get(index) + "", fontSize = 14.sp)
            }
        }
    }
}