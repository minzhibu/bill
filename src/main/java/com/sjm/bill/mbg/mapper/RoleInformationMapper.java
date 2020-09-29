package com.sjm.bill.mbg.mapper;

import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.mbg.model.RoleInformation;
import com.sjm.bill.mbg.model.RoleInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleInformationMapper {
    int countByExample(RoleInformationExample example);

    int deleteByExample(RoleInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleInformation record);

    int insertSelective(RoleInformation record);

    List<RoleInformation> selectByExample(RoleInformationExample example);

    RoleInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleInformation record, @Param("example") RoleInformationExample example);

    int updateByExample(@Param("record") RoleInformation record, @Param("example") RoleInformationExample example);

    int updateByPrimaryKeySelective(RoleInformation record);

    int updateByPrimaryKey(RoleInformation record);

    /**
     * 不带参数的分页查询
     * @param page 当前页
     * @param size 一页几条
     * @return
     */
    List<RoleInformation> selectPage(@Param("page") int page, @Param("size") int size);

    /**
     * 查询总记录条数
     * @return
     */
    Integer count();

    /**
     * 根据id查询该角色的权限
     * @param id
     * @return
     */
    List<JurisdictionInformationDTO> selectByIdToJurisdiction(Long id);
}