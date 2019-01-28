package com.yunuseker.rocket.viewmodel;

import android.arch.lifecycle.MutableLiveData;

import com.yunuseker.rocket.base.BaseViewModel;
import com.yunuseker.rocket.ui.viewentity.RocketViewEntity;
import com.yunuseker.rocket.usecase.RocketUsecase;
import java.util.List;
import javax.inject.Inject;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class VMMainAct extends BaseViewModel {
    private MutableLiveData<List<RocketViewEntity>> rocketList = new MutableLiveData<>();
    private MutableLiveData<Boolean> isLoading=new MutableLiveData<>();
    private int pageOffset = 1;

    @Inject
    public VMMainAct(RocketUsecase rocketUsecase) {
        isLoading.postValue(true);
        Disposable disposable = rocketUsecase.getRockets(pageOffset)
                .subscribeOn(Schedulers.io())
                .subscribe(value -> {
                    isLoading.postValue(false);
                    rocketList.postValue(value);
                    pageOffset += 1;
                }, this::handleError);
        super.disposable.add(disposable);
    }

    public MutableLiveData<List<RocketViewEntity>> getRocketList() {
        return rocketList;
    }

    public MutableLiveData<Boolean> getIsLoading() {
        return isLoading;
    }
}
