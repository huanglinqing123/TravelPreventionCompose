package com.hlq.module_risk_level.ui

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hlq.module_risk_level.R
import com.hlq.module_risk_level.bean.reqbean.RiskLevelReqData

/**

 * @author: HuangLinqing

 * @date: 2022/8/23

 * @desc:风险等级item

 */

@Preview
@Composable
fun preview1(){
    ItemRiskLevel(
        title = R.string.riskLevelHigh,
        icon = R.mipmap.img_high,
        count = "3",
        textColor = R.color.red
    )
}

@Composable
fun ItemRiskLevel(
    @StringRes title: Int,
    @DrawableRes icon: Int,
    count: String?,
    @ColorRes textColor:Int
) {
    Row(modifier = Modifier.padding(top = 5.dp)) {
        Image(painter = painterResource(id = icon), contentDescription = null)
        Spacer(modifier = Modifier.width(20.dp))
        Row(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(text = stringResource(id = title))
            Text(text = "${count}个", color = colorResource(id = textColor))
        }

    }


}