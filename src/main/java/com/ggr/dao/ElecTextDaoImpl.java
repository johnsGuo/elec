package com.ggr.dao;

import com.ggr.domain.ElecText;
import org.springframework.stereotype.Repository;

/**
 * Created by GuiRunning on 2017/5/23.
 */
@Repository(IElecTextDao.SERVICE_NAME)
public class ElecTextDaoImpl extends CommonDaoImpl<ElecText> implements IElecTextDao{

}
