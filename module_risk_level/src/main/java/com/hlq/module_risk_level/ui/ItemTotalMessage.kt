package com.hlq.module_risk_level.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hlq.module_risk_level.R
import com.hlq.module_risk_level.bean.reqbean.RiskLevelReqData

/**

 * @author: HuangLinqing

 * @date: 2022/8/23

 * @desc:整体统计数据UI

 */

@Preview
@Composable
fun preview(){
    ItemToatalMessage(data = RiskLevelReqData())
}

@Composable
fun ItemToatalMessage(data:RiskLevelReqData) {
    Card(elevation = 10.dp, backgroundColor = Color.White) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Text(text = "更新时间:${data.updated_date}")
            ItemRiskLevel(
                title = R.string.riskLevelHigh,
                icon = R.mipmap.img_high,
                count = data.high_count,
                textColor = R.color.red
            )
            ItemRiskLevel(
                title = R.string.riskLevelHigh,
                icon = R.mipmap.img_middle,
                count = data.middle_count,
                textColor = R.color.yellow
            )
        }
    }
}
