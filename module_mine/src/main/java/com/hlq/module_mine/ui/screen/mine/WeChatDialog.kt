package com.hlq.module_mine.ui.screen.mine

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                    Text(
                        text = "欢迎关注公众号“Android技术圈”",
                        modifier = Modifier
                            .weight(1f)
                            .align(Alignment.CenterHorizontally),
                    )

                    Text(
                        text = "我知道了", modifier = Modifier
                            .clickable {
                                onChange.invoke(false)
                            }
                            .fillMaxWidth(), textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

}