package com.ggr.service;

import com.ggr.dao.IElecTextDao;
import com.ggr.domain.ElecText;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by GuiRunning on 2017/5/23.
 */
@Transactional(readOnly=true)
@Service(IElecTextService.SERVER_NAME)
public class IElecTextServiceImpl implements IElecTextService{

    @Resource(name = IElecTextDao.SERVICE_NAME)
    private IElecTextDao iElecTextDao;

    @Transactional(isolation= Isolation.DEFAULT,propagation= Propagation.REQUIRED,readOnly=false)
    public void save(ElecText elecText) {

        iElecTextDao.save(elecText);
    }
}
