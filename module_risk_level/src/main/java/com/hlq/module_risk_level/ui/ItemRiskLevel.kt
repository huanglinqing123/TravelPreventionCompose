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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

/**

 * @author: HuangLinqing

 * @date: 2022/8/23

 * @desc:风险等级item

 */

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
        Text(text = stringResource(id = title))
        Text(text = "${count}个", color = colorResource(id = textColor))
    }


}