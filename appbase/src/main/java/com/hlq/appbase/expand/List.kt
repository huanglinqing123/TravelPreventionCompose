package com.hlq.appbase.expand

/**
 * @author：HuangLinqing
 * @blog：https://huanglinqing.blog.csdn.net/?t=1
 * @公众号：Android 技术圈
 * @desc：List 扩展函数
 */

fun List<String>?.splitData(): String {
    val stringBuffer = StringBuffer()
    if (!isNullOrEmpty()) {
        for (i in this.indices) {
            stringBuffer.append(this[i] + "\n")
        }
    }
    return stringBuffer.toString()
}