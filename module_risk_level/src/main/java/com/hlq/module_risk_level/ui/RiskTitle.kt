package com.hlq.module_risk_level.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

/**

 * @author: HuangLinqing

 * @date: 2022/8/23

 * @desc:标题

 */

@Composable
fun RiskTitle(
    @StringRes title: Int,
    @DrawableRes icon: Int
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Image(painter = painterResource(id = icon), contentDescription = null)
        Spacer(modifier = Modifier.width(20.dp))
        Row(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(text = stringResource(id = title))
        }
    }
}
