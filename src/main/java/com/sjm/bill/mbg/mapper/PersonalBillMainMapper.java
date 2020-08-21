package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.PersonalBillMain;
import com.sjm.bill.mbg.model.PersonalBillMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalBillMainMapper {
    int countByExample(PersonalBillMainExample example);

    int deleteByExample(PersonalBillMainExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PersonalBillMain record);

    int insertSelective(PersonalBillMain record);

    List<PersonalBillMain> selectByExample(PersonalBillMainExample example);

    PersonalBillMain selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PersonalBillMain record, @Param("example") PersonalBillMainExample example);

    int updateByExample(@Param("record") PersonalBillMain record, @Param("example") PersonalBillMainExample example);

    int updateByPrimaryKeySelective(PersonalBillMain record);

    int updateByPrimaryKey(PersonalBillMain record);
}