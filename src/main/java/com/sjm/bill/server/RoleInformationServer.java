package com.sjm.bill.server;

import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.mbg.model.RoleInformation;

public interface RoleInformationServer {
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
    void insert(RoleInformation roleInformation);

    /**
     * 根据id修改一条数据
     * @param id 这条数据的id
     * @param roleInformation 实体类对象
     */
    void update(Long id,RoleInformation roleInformation);

    /**
     * 根据id删除一条数据
     * @param id 这条数据的id
     */
    void delete(Long id);


}
