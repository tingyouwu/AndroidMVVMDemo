package com.wty.app.mvvmlib;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wty.app.mvvmlib.viewmodel.IViewModel;


/**
 * @Desc 基础 MVVM activity
 **/
public abstract class BaseActivity<VM extends IViewModel,B extends ViewDataBinding> extends AppCompatActivity implements IBase{

    protected VM viewModel;
    protected B  binding;
    protected View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,getLayoutResource());
        viewModel = initViewModel();
        bindViewModel();
        onInitView(savedInstanceState);
    }

    @Override
    public View getView() {
        if(view ==null){
            view = binding.getRoot();
        }
        return view;
    }

    protected void setViewModel(VM viewModel) {
        this.viewModel = viewModel;
    }

    protected abstract VM initViewModel();
}
