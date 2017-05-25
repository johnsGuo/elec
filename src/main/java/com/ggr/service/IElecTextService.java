package com.ggr.service;

import com.ggr.domain.ElecText;

/**
 * Created by GuiRunning on 2017/5/23.
 */
public interface IElecTextService {

    public static final String SERVER_NAME="com.ggr.service.IElecTextServiceImpl";

    public void save(ElecText elecText);
}
