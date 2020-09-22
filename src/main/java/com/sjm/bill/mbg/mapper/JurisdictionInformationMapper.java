package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.JurisdictionInformation;
import com.sjm.bill.mbg.model.JurisdictionInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JurisdictionInformationMapper {
    int countByExample(JurisdictionInformationExample example);

    int deleteByExample(JurisdictionInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JurisdictionInformation record);

    int insertSelective(JurisdictionInformation record);

    List<JurisdictionInformation> selectByExample(JurisdictionInformationExample example);

    JurisdictionInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JurisdictionInformation record, @Param("example") JurisdictionInformationExample example);

    int updateByExample(@Param("record") JurisdictionInformation record, @Param("example") JurisdictionInformationExample example);

    int updateByPrimaryKeySelective(JurisdictionInformation record);

    int updateByPrimaryKey(JurisdictionInformation record);

    /**
     * 查询该表的树形结构
     * @return
     */
    List<JurisdictionInformation> selectByTree();
}