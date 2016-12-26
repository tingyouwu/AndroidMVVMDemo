package com.wty.app.mvvmlib;

import android.os.Bundle;
import android.view.View;

import com.wty.app.mvvmlib.viewmodel.IViewModel;

/**
 * @author wty
 * 基础事件
 */
public interface IBase<VM extends IViewModel> {

    /**
     * 功能描述：给view绑定数据
     **/
    void onInitView(Bundle savedInstanceState);

    /**
     * 功能描述：获得当前页面最顶层的view
     **/
    View getView();

    /**
     * 功能描述：把view和viewModel绑定起来
     * 如:binding.setXXX(viewmodel)
     **/
    void bindViewModel();

    /**
     * 功能描述：获得布局文件Id
     **/
    int getLayoutResource();
}
