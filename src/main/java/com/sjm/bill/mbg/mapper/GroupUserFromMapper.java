package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.GroupUserFrom;
import com.sjm.bill.mbg.model.GroupUserFromExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupUserFromMapper {
    int countByExample(GroupUserFromExample example);

    int deleteByExample(GroupUserFromExample example);

    int insert(GroupUserFrom record);

    int insertSelective(GroupUserFrom record);

    List<GroupUserFrom> selectByExample(GroupUserFromExample example);

    int updateByExampleSelective(@Param("record") GroupUserFrom record, @Param("example") GroupUserFromExample example);

    int updateByExample(@Param("record") GroupUserFrom record, @Param("example") GroupUserFromExample example);
}