package com.hlq.module_mine.enum

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.hlq.module_mine.R

/**
 * @author：HuangLinqing
 * @date ：2022/4/13
 * @desc："我的",菜单
 */
enum class MineMenu(
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val menuId: Int
) {

    /**
     * 更换主题
     */
    THEME(R.string.change_theme, R.mipmap.img_theme, MINE_MENU_ID_THEME),

    /**
     * 博客菜单
     */
    BLOG(R.string.blog, R.mipmap.img_blog, MINE_MENU_ID_BLOG),

    /**
     * 微信公众号
     */
    WEACHAT(R.string.weachat, R.mipmap.img_weachat, MINE_MENU_ID_WEACHAT)

}

const val MINE_MENU_ID_THEME = 1
const val MINE_MENU_ID_BLOG = 2
const val MINE_MENU_ID_WEACHAT = 3