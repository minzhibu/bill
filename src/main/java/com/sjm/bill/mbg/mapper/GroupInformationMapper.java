package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.GroupInformation;
import com.sjm.bill.mbg.model.GroupInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupInformationMapper {
    int countByExample(GroupInformationExample example);

    int deleteByExample(GroupInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GroupInformation record);

    int insertSelective(GroupInformation record);

    List<GroupInformation> selectByExample(GroupInformationExample example);

    GroupInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GroupInformation record, @Param("example") GroupInformationExample example);

    int updateByExample(@Param("record") GroupInformation record, @Param("example") GroupInformationExample example);

    int updateByPrimaryKeySelective(GroupInformation record);

    int updateByPrimaryKey(GroupInformation record);
}