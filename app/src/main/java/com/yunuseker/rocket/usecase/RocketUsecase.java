package com.yunuseker.rocket.usecase;

import com.yunuseker.rocket.base.BaseUsecase;
import com.yunuseker.rocket.data.repository.RocketRepository;
import com.yunuseker.rocket.ui.viewentity.RocketViewEntity;
import com.yunuseker.rocket.utils.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import io.reactivex.Single;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class RocketUsecase extends BaseUsecase {

    private RocketRepository rocketRepository;
    private DateUtils dateUtils;


    public RocketUsecase(RocketRepository rocketRepository,DateUtils dateUtils) {
        this.rocketRepository = rocketRepository;
        this.dateUtils=dateUtils;
    }

    public Single<List<RocketViewEntity>> getRockets(int offset) {
        return rocketRepository.getRockets(offset)
                .flatMapIterable(item -> item)
                .map(it -> {
                    RocketViewEntity rocketViewEntity = new RocketViewEntity();
                    rocketViewEntity.setId(it.getRocketId());
                    rocketViewEntity.setName(it.getRocketName());
                    if (!it.getImages().isEmpty()) rocketViewEntity.setImage(it.getImages().get(0));
                    rocketViewEntity.setDescription(it.getDescription());
                    rocketViewEntity.setMass(it.getMass().getKg().toString()+" Kg");
                    rocketViewEntity.setMeters(it.getHeight().getMeters().toString()+" Meter");
                    rocketViewEntity.setFirstDate(dateUtils.convertDate(it.getFirstFlight()));
                    return rocketViewEntity;
                })
                .toList();


    }
}
