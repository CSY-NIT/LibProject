package com.csy.lib_base.mvvm.viewadapter;

import androidx.databinding.ViewDataBinding;

/**
 * Created by goldze on 2017/6/15.
 */
public interface IBindingItemViewModel<V extends ViewDataBinding> {
    void injecDataBinding(V binding);
}
