package com.hlq.module_test_agency.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hlq.module_test_agency.bean.reqbean.AgencyMessageReqData

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：核酸检测机构item ui
 */
@Composable
fun AgencyItem(agencyMessageBean: AgencyMessageReqData.Data) {
    Card(
        elevation = 10.dp, backgroundColor = Color.White,
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .fillMaxWidth()
            .padding(vertical = 10.dp)
    ) {
        Column(Modifier.padding(10.dp)) {
            Text(
                text = agencyMessageBean.name.toString(), fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "区域：${agencyMessageBean.city}", fontSize = 14.sp,
                modifier = Modifier.padding(top = 5.dp)
            )
            Text(
                text = "详细地址：${agencyMessageBean.address}", fontSize = 14.sp,
                modifier = Modifier.padding(top = 5.dp)
            )
            Text(
                text = "联系电话：${agencyMessageBean.phone}", fontSize = 14.sp,
                modifier = Modifier.padding(top = 5.dp)
            )
        }
    }
}