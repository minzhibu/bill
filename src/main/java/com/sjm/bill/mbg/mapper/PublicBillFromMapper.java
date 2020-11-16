package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.PublicBillFrom;
import com.sjm.bill.mbg.model.PublicBillFromExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicBillFromMapper {
    int countByExample(PublicBillFromExample example);

    int deleteByExample(PublicBillFromExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PublicBillFrom record);

    int insertSelective(PublicBillFrom record);

    List<PublicBillFrom> selectByExample(PublicBillFromExample example);

    PublicBillFrom selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PublicBillFrom record, @Param("example") PublicBillFromExample example);

    int updateByExample(@Param("record") PublicBillFrom record, @Param("example") PublicBillFromExample example);

    int updateByPrimaryKeySelective(PublicBillFrom record);

    int updateByPrimaryKey(PublicBillFrom record);

    int insertBatch(@Param("publicBillFroms")List<PublicBillFrom> publicBillFroms);
}