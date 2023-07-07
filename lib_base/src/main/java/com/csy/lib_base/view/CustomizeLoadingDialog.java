package com.csy.lib_base.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.csy.lib_base.R;

public class CustomizeLoadingDialog extends AppCompatDialog {

  private ImageView mProgressBar;
  private TextView mTvMessage;
  private Context mContext;

  public CustomizeLoadingDialog(Context context) {
    super(context);
    this.mContext = context;
  }

  public CustomizeLoadingDialog(Context context, int theme) {
    super(context, theme);
    this.mContext = context;
  }

  protected CustomizeLoadingDialog(Context context, boolean cancelable,
      DialogInterface.OnCancelListener cancelListener) {
    super(context, cancelable, cancelListener);
    this.mContext = context;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.dialog_loading_customize);
    mProgressBar = findViewById(R.id.progress_bar);
    mTvMessage = findViewById(R.id.tv_message);
    RotateAnimation rotateAnimation =
        new RotateAnimation(0, 359, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
            0.5f);
    LinearInterpolator lin = new LinearInterpolator();
    rotateAnimation.setInterpolator(lin);
    rotateAnimation.setDuration(500);
    rotateAnimation.setRepeatCount(-1);
    rotateAnimation.setFillAfter(true);
    mProgressBar.setAnimation(rotateAnimation);
  }

  /**
   * 加载提示内容是否显示
   *
   * @param status true 显示(默认显示) false 隐藏
   */
  private void setVisibleMessage(boolean status) {
    if (mTvMessage != null) {
      mTvMessage.setVisibility(status ? View.VISIBLE : View.GONE);
    }
  }

  /**
   * 加载内容
   */
  public void setMessage(String message) {
    if (mTvMessage != null && !TextUtils.isEmpty(message)) {
      mTvMessage.setText(message);
    }
  }

  @Override public void dismiss() {
    super.dismiss();
    mProgressBar.clearAnimation();
  }
}
