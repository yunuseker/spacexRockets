package com.yunuseker.rocket.viewmodel;
import android.arch.lifecycle.MutableLiveData;
import com.yunuseker.rocket.base.BaseViewModel;
import javax.inject.Inject;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class VMRocketDetailAct extends BaseViewModel {

    private MutableLiveData<String> username = new MutableLiveData<>();
    private MutableLiveData<String> password = new MutableLiveData<>();
    private MutableLiveData<Boolean> loginStatus = new MutableLiveData<>();

    @Inject
    public VMRocketDetailAct() {

    }

    public void doLogin(String token) {

    }

    public MutableLiveData<String> getPassword() {
        return password;
    }

    public MutableLiveData<String> getUsername() {
        return username;
    }

    public MutableLiveData<Boolean> getLoginStatus() {
        return loginStatus;
    }
}
