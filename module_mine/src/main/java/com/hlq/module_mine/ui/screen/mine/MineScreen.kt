package com.hlq.module_mine.ui.screen.mine

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hlq.module_mine.intent.MineAction
import com.hlq.module_mine.R
import com.hlq.module_mine.enum.MineMenu
import com.hlq.module_mine.ui.theme.lightGray

/**
 * @author：HuangLinqing
 * @date ：2022/3/23
 * @desc：我的页面
 */
@Composable
fun MineScreen(mineIntent: MineAction) {
    Column(Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .background(color = Color.White)
                .height(200.dp)
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.mipmap.round_icon),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp, 60.dp)
                    .align(Alignment.CenterVertically)
                    .clip(shape = RoundedCornerShape(50))
            )

            Text(
                text = "黄林晴",
                Modifier
                    .padding(start = 10.dp)
                    .align(Alignment.CenterVertically)
            )
        }

        Spacer(
            modifier = Modifier
                .height(0.5.dp)
                .background(lightGray)
                .fillMaxWidth()
        )

        val mineMenu = MineMenu.values()
        LazyColumn(content = {
            item {
                mineMenu.forEachIndexed { _, mineMenu ->
                    ItemMenu(mineMenu = mineMenu) {
                        when (mineMenu.menuId) {
                            MineMenu.BLOG.menuId -> {
                                Log.d("点击菜单","--点击了这个菜单--")
                                mineIntent.toMyBlog()
                            }
                            MineMenu.WEACHAT.menuId -> {

                            }
                            MineMenu.THEME.menuId -> {

                            }
                        }
                    }
                }
            }
        })
    }
}

