package com.hlq.travelpreventioncompose.ui.screen.mine

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hlq.travelpreventioncompose.R
import com.hlq.module_mine.enum.MineMenu
import com.hlq.travelpreventioncompose.ui.theme.lightGray

/**
 * @author：HuangLinqing
 * @date ：2022/4/13
 * @desc：item 菜单
 */


@Composable
fun ItemMenu(mineMenu: MineMenu) {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(10.dp)
        ) {

            Image(
                painter = painterResource(id = mineMenu.icon),
                contentDescription = null,
                Modifier.size(30.dp, 30.dp)
            )
            Text(
                text = stringResource(id = mineMenu.title),
                Modifier
                    .padding(start = 15.dp)
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            )

            Image(
                painter = painterResource(id = R.mipmap.img_enter), contentDescription = null,
                modifier = Modifier.align(Alignment.CenterVertically)
            )

        }
        Spacer(
            modifier = Modifier
                .height(0.5.dp)
                .background(lightGray)
                .fillMaxWidth()
        )
    }

}


@Preview
@Composable
fun PreviewMessage() {
    ItemMenu(MineMenu.BLOG)
}



