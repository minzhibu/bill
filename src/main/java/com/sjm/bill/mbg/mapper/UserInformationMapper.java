package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.UserInformation;
import com.sjm.bill.mbg.model.UserInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInformationMapper {
    int countByExample(UserInformationExample example);

    int deleteByExample(UserInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    List<UserInformation> selectByExample(UserInformationExample example);

    UserInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    int updateByExample(@Param("record") UserInformation record, @Param("example") UserInformationExample example);

    int updateByPrimaryKeySelective(UserInformation record);

    int updateByPrimaryKey(UserInformation record);
}