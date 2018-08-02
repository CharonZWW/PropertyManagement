package com.wsw.management.controller;

import com.wsw.management.domain.ManagerBean;
import com.wsw.management.service.impl.HouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 住户管理Controller
 *
 */

@RestController
@RequestMapping(value = "/house")
public class HouseController {
    @Autowired
    private HouseServiceImpl houseService;

    /**
     * 处理登录请求
     * @param managerBean
     * @return
     */
    @PostMapping(value = "/login")
    public boolean login(ManagerBean managerBean){
        return houseService.login(managerBean);
    }

}
