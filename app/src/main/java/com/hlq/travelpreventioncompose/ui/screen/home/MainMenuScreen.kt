package com.hlq.travelpreventioncompose.ui.screen

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hlq.travelpreventioncompose.R
import com.hlq.travelpreventioncompose.ui.bean.enum.MainMenu

/**
 * @author：HuangLinqing
 * @date ：2022/4/12
 * @desc：主页面菜单布局
 */

@Composable
fun MainMenuUI(
    @StringRes title: Int,
    @DrawableRes icon: Int,
    menuId: Int,
    onClick: (Int) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp)
            .clickable {
                onClick(menuId)
            },
        elevation = 10.dp
    ) {
        Row(
            modifier = Modifier.padding(vertical = 30.dp)
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = Modifier.padding(start = 80.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = stringResource(id = title),
                fontSize = 16.sp,
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            )
            Image(
                painter = painterResource(id = R.mipmap.img_enter),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 20.dp)
                    .size(20.dp)
                    .align(Alignment.CenterVertically)
            )

        }
    }

}