package com.sjm.bill.mbg.mapper;

import com.sjm.bill.mbg.model.PublicBillUser;
import com.sjm.bill.mbg.model.PublicBillUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicBillUserMapper {
    int countByExample(PublicBillUserExample example);

    int deleteByExample(PublicBillUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PublicBillUser record);

    int insertSelective(PublicBillUser record);

    List<PublicBillUser> selectByExample(PublicBillUserExample example);

    PublicBillUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PublicBillUser record, @Param("example") PublicBillUserExample example);

    int updateByExample(@Param("record") PublicBillUser record, @Param("example") PublicBillUserExample example);

    int updateByPrimaryKeySelective(PublicBillUser record);

    int updateByPrimaryKey(PublicBillUser record);

    int insertBatch(@Param("publicBillUsers") List<PublicBillUser> publicBillUsers);
}