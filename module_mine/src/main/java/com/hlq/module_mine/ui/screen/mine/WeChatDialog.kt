package com.hlq.module_mine.ui.screen.mine

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

/**

 * @author: HuangLinqing

 * @date: 2022/9/13

 * @desc:微信dialog

 */

@Composable
fun WeChatDialog(showDialog: Boolean, onChange: (Boolean) -> Unit) {
    if (showDialog) {
        Dialog(onDismissRequest = { onChange.invoke(false) }) {
            Card(elevation = 10.dp) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(170.dp)
                        .padding(20.dp)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "欢迎关注公众号“Android技术圈”",
                            textAlign = TextAlign.Center
                        )
                    }

                    Text(
                        text = "知道了", modifier = Modifier
                            .clickable(indication = null, interactionSource = remember {
                                MutableInteractionSource()
                            }, onClick = {
                                onChange.invoke(false)
                            })
                            .fillMaxWidth(), textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

}