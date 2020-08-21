package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.RoleInformation;
import com.sjm.bill.mbg.model.RoleInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleInformationMapper {
    int countByExample(RoleInformationExample example);

    int deleteByExample(RoleInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleInformation record);

    int insertSelective(RoleInformation record);

    List<RoleInformation> selectByExample(RoleInformationExample example);

    RoleInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleInformation record, @Param("example") RoleInformationExample example);

    int updateByExample(@Param("record") RoleInformation record, @Param("example") RoleInformationExample example);

    int updateByPrimaryKeySelective(RoleInformation record);

    int updateByPrimaryKey(RoleInformation record);
}