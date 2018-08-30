package com.qingmei2.sample.main

import android.view.MenuItem
import com.qingmei2.rhine.base.viewdelegate.IViewDelegate

class MainViewDelegate(
        val viewModel: MainViewModel,
        val navigator: MainNavigator
) : IViewDelegate {

    fun onNavSelectChanged(menu: MenuItem) = navigator.switchFragment(menu)
}