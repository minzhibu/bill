package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.PersonalBillFrom;
import com.sjm.bill.mbg.model.PersonalBillFromExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonalBillFromMapper {
    int countByExample(PersonalBillFromExample example);

    int deleteByExample(PersonalBillFromExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PersonalBillFrom record);

    int insertSelective(PersonalBillFrom record);

    List<PersonalBillFrom> selectByExample(PersonalBillFromExample example);

    PersonalBillFrom selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PersonalBillFrom record, @Param("example") PersonalBillFromExample example);

    int updateByExample(@Param("record") PersonalBillFrom record, @Param("example") PersonalBillFromExample example);

    int updateByPrimaryKeySelective(PersonalBillFrom record);

    int updateByPrimaryKey(PersonalBillFrom record);
}