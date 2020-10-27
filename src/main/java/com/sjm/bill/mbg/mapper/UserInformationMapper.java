package com.sjm.bill.mbg.mapper;

import com.sjm.bill.dto.UserRoleFromDTO;
import com.sjm.bill.mbg.model.UserInformation;
import com.sjm.bill.mbg.model.UserInformationExample;
import com.sjm.bill.mbg.model.UserRoleFrom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    List<UserInformation> selectPage(@Param("page")int page, @Param("size") int size);

    /**
     * 总记录条数
     * @return
     */
    Integer count();

    /**
     * 根据用户id查询角色
     * @param id
     * @return
     */
    List<UserRoleFromDTO> selectByIdToRole(@Param("id") Long id);
}