package com.csy.libproject;

import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import com.csy.lib_base.command.BindingAction;
import com.csy.lib_base.command.BindingCommand;
import com.csy.lib_base.mvvm.BaseViewModel;

/**
 * 作者:admin
 * 描述:
 * 时间:2023/7/5
 */
public class LoginViewModel extends BaseViewModel {
  public BindingCommand testCommand = new BindingCommand(new BindingAction() {
    @Override public void call() {
      int length = 0;

      for (int i = 0; i < 10; i++) {
        StringBuilder sb = new StringBuilder();
        length++;
        if (length < 10) {
          sb.append(""+length);
        } else {
          sb.append("最后一行");
        }
        Log.e("aaa0",sb.toString());
      }
    }
  });
  public LoginViewModel(@NonNull Application application) {
    super(application);
  }
}
