package com.sjm.bill.server;

import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.dto.UserInformationDTO;
import com.sjm.bill.dto.UserRoleFromDTO;
import com.sjm.bill.mbg.model.UserInformation;
import com.sjm.bill.mbg.model.UserRoleFrom;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserInformationService {
    /**
     * 分页查询
     * @param page 页数
     * @param size 一页的个数
     * @return
     */
    PaginationDTO<UserInformation> selectPage(int page, int size);

    /**
     * 添加一条记录
     * @param userInformationDTO
     */
    void insert(UserInformationDTO userInformationDTO);

    /**
     * 根据id修改一条数据
     * @param id 这条数据的id
     * @param userInformationDTO 实体类对象
     */
    void update(Long id,UserInformationDTO userInformationDTO);

    /**
     * 根据id删除一条数据
     * @param id 这条数据的id
     */
    void delete(Long id);

    List<UserRoleFromDTO> selectByIdToRole(Long id);

    /**
     * 根据用户id查询用户权限
     * @param id 用户id
     * @return
     */
    List<JurisdictionInformationDTO> selectUserIdToAuthority(Long id);
}
