package com.csy.libproject;

import android.os.Bundle;
import com.csy.lib_base.mvvm.BaseActivity;
import com.csy.libproject.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding,LoginViewModel> {


  @Override public int initContentView(Bundle savedInstanceState) {
    return R.layout.activity_main;
  }

  @Override public int initVariableId() {
    return BR.viewModel;
  }
}
