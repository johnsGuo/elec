package com.ggr.web;

import com.ggr.domain.ElecText;
import com.ggr.service.IElecTextService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by GuiRunning on 2017/5/23.
 */
@Controller
@RequestMapping("/test")
public class ElecTestController {

    @Resource(name=IElecTextService.SERVER_NAME)
    private IElecTextService iElecTextService;

    @RequestMapping(value = "/add")
    public @ResponseBody ElecText add(){
        System.out.println("进来了");
        ElecText elecText = new ElecText();
        elecText.setTextName("测试Hibernate名称");
        elecText.setTextDate(new Date());
        elecText.setTextRemark("测试Hibernate备注");
        iElecTextService.save(elecText);
        return elecText;
    }
}
