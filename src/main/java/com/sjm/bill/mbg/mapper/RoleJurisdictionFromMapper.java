package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.RoleJurisdictionFrom;
import com.sjm.bill.mbg.model.RoleJurisdictionFromExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleJurisdictionFromMapper {
    int countByExample(RoleJurisdictionFromExample example);

    int deleteByExample(RoleJurisdictionFromExample example);

    int insert(RoleJurisdictionFrom record);

    int insertSelective(RoleJurisdictionFrom record);

    List<RoleJurisdictionFrom> selectByExample(RoleJurisdictionFromExample example);

    int updateByExampleSelective(@Param("record") RoleJurisdictionFrom record, @Param("example") RoleJurisdictionFromExample example);

    int updateByExample(@Param("record") RoleJurisdictionFrom record, @Param("example") RoleJurisdictionFromExample example);

    int insertBatch(@Param("roleJurisdictionFroms") List<RoleJurisdictionFrom> roleJurisdictionFroms);

    int deleteByRoleId(@Param("roleId") String roleId);
}