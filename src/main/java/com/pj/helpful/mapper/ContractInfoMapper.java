package com.pj.helpful.mapper;

import com.pj.helpful.bean.ContractInfo;

public interface ContractInfoMapper {
    int deleteByPrimaryKey(String contractId);

    int insert(ContractInfo record);

    int insertSelective(ContractInfo record);

    ContractInfo selectByPrimaryKey(String contractId);

    int updateByPrimaryKeySelective(ContractInfo record);

    int updateByPrimaryKey(ContractInfo record);
}