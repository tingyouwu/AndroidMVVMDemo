package com.wty.app.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wty.app.mvvmdemo.databinding.ActivityDatabindingBinding;
import com.wty.app.mvvmdemo.model.User;
import com.wty.app.mvvmdemo.observable.ObservableUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDatabindingBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_databinding);
        ObservableUser user = new ObservableUser("wu","tingyou");
        binding.setUser(user);
        user.setFirstName("li");
    }
}
