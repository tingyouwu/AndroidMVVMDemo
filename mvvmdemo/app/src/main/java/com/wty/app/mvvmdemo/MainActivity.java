package com.wty.app.mvvmdemo;

import android.os.Bundle;

import com.wty.app.mvvmdemo.databinding.ActivityDatabindingBinding;
import com.wty.app.mvvmdemo.observable.ObservableUser;
import com.wty.app.mvvmlib.BaseActivity;

public class MainActivity extends BaseActivity<ObservableUser,ActivityDatabindingBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected ObservableUser initViewModel() {
        return new ObservableUser("wu","tingyou");
    }

    @Override
    public void onInitView(Bundle savedInstanceState) {
        viewModel.setFirstName("1111111");
        viewModel.setFirstName("22222");
    }

    @Override
    public void bindViewModel() {
        binding.setUser(viewModel);
    }

    @Override
    public int getLayoutResource() {
        return R.layout.activity_databinding;
    }
}
