package com.yunuseker.rocket.base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import javax.inject.Inject;
import com.yunuseker.rocket.BR;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
@SuppressLint("Registered")
public abstract class BaseActivity<VM extends BaseViewModel, DB extends ViewDataBinding> extends AppCompatActivity  {

    public VM viewModel;
    public DB dataBinding;

    @Inject
    public ViewModelProvider.Factory viewModelFactory;

    protected abstract int layout();

    protected abstract Class<VM> getViewModel();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, layout());
        viewModel = ViewModelProviders.of(this,viewModelFactory).get(getViewModel());
        dataBinding.setVariable(BR.viewModel, viewModel);
        dataBinding.setLifecycleOwner(this);
    }

    protected void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void startActivityWithoutBackstack(Class activityClass) {
        Intent i = new Intent(this, activityClass);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
    }

    public void startActivityWithBackstack(Class activityClass) {
        Intent i = new Intent(this, activityClass);
        startActivity(i);
    }

    public void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) this.getSystemService(Activity.INPUT_METHOD_SERVICE);
        if (imm != null && getCurrentFocus() != null) {
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void loadFragment(int contanerId, Fragment fragment, boolean addToBackStack) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (addToBackStack) {
            ft.addToBackStack(fragment.getClass().getName());
        }
        ft.replace(contanerId, fragment);
        ft.commit();
    }
}
