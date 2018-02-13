package com.visal_suos.rxjava2_dagger2_mvp_room.util.mapper;

import com.visal_suos.rxjava2_dagger2_mvp_room.data.room.entity.DataTestEntity;
import com.visal_suos.rxjava2_dagger2_mvp_room.mvp.model.DataTestModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by v.suos on 2/7/2018.
 */

public class TestMapper {


    public static List<DataTestEntity> map(List<DataTestModel> shortInfoHeroes) {
        List<DataTestEntity> list = new ArrayList<>();
        for (DataTestModel sh : shortInfoHeroes) {
            DataTestEntity hero = new DataTestEntity(
                    sh.getAttackType(),
                    sh.getImg(),
                    sh.getLocalizedName(),
                    sh.getPrimaryAttr()
            );
            list.add(hero);
        }
        return list;
    }

    public static List<DataTestModel> convert(List<DataTestEntity> shortInfoHeroes) {
        List<DataTestModel> list = new ArrayList<>();
        for (DataTestEntity sh : shortInfoHeroes) {
            DataTestModel hero = new DataTestModel();
            hero.setAttackType(sh.getAttackType());
            hero.setImg(sh.getImg());
            hero.setLocalizedName(sh.getLocalizedName());
            hero.setPrimaryAttr(sh.getPrimaryAttr());
            list.add(hero);
        }
        return list;
    }

}
