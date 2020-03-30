package com.pj.helpful.service;

import com.pj.helpful.bean.ContractInfo;
import com.pj.helpful.mapper.ContractInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContraServiceImpl implements IContraService {
    @Autowired
    private ContractInfoMapper mapper;
    @Override
    public ContractInfo findByPrimaryKey(String s) {
        return mapper.selectByPrimaryKey(s);
    }
}
