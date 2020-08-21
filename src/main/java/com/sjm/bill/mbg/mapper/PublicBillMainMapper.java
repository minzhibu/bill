package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.PublicBillMain;
import com.sjm.bill.mbg.model.PublicBillMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicBillMainMapper {
    int countByExample(PublicBillMainExample example);

    int deleteByExample(PublicBillMainExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PublicBillMain record);

    int insertSelective(PublicBillMain record);

    List<PublicBillMain> selectByExample(PublicBillMainExample example);

    PublicBillMain selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PublicBillMain record, @Param("example") PublicBillMainExample example);

    int updateByExample(@Param("record") PublicBillMain record, @Param("example") PublicBillMainExample example);

    int updateByPrimaryKeySelective(PublicBillMain record);

    int updateByPrimaryKey(PublicBillMain record);
}