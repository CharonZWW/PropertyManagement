package com.wsw.management.service.impl;

import com.wsw.management.dao.IManagerDao;

import com.wsw.management.domain.ManagerBean;
import com.wsw.management.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements IHouseService{
    @Autowired
    private IManagerDao iManagerDao;
    @Override
    public boolean login(ManagerBean managerBean) {
        String realPass = iManagerDao.findPassByUser(managerBean.getM_username());
        System.out.println(realPass);
        return managerBean.getM_password().equals(realPass);
    }
}
