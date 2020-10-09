package com.sjm.bill.server;

import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.dto.RoleInformationDTO;
import com.sjm.bill.mbg.model.RoleInformation;

import java.util.List;

public interface RoleInformationService {
    /**
     * 分页查询
     * @param page 页数
     * @param size 一页的个数
     * @return
     */
    PaginationDTO<RoleInformation> selectPage(int page, int size);

    /**
     * 添加一条记录
     * @param roleInformation
     */
    void insert(RoleInformationDTO roleInformationDTO);

    /**
     * 根据id修改一条数据
     * @param id 这条数据的id
     * @param roleInformation 实体类对象
     */
    void update(Long id,RoleInformationDTO roleInformationDTO);

    /**
     * 根据id删除一条数据
     * @param id 这条数据的id
     */
    void delete(Long id);


    /**
     * 根据id查询该角色的权限
     * @return
     */
    List<JurisdictionInformationDTO> selectByIdToJurisdiction(Long id);

}
