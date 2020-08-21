package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.UserRoleFrom;
import com.sjm.bill.mbg.model.UserRoleFromExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleFromMapper {
    int countByExample(UserRoleFromExample example);

    int deleteByExample(UserRoleFromExample example);

    int insert(UserRoleFrom record);

    int insertSelective(UserRoleFrom record);

    List<UserRoleFrom> selectByExample(UserRoleFromExample example);

    int updateByExampleSelective(@Param("record") UserRoleFrom record, @Param("example") UserRoleFromExample example);

    int updateByExample(@Param("record") UserRoleFrom record, @Param("example") UserRoleFromExample example);
}