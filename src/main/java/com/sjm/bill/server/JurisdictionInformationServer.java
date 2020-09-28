package com.sjm.bill.server;

import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.mbg.model.JurisdictionInformation;

import java.util.List;

public interface JurisdictionInformationServer {

    /**
     * 查询该表的树形结构
     * @return
     */
    List<JurisdictionInformationDTO> selectByTree();

    /**
     * 向表中插入一条数据
     * @return
     */
    void insert(JurisdictionInformation jurisdictionInformation);

    /**
     * 修改一条数据
     * @param id
     * @param jurisdictionInformation
     */
    void update(Long id, JurisdictionInformation jurisdictionInformation);

    /**
     * 删除一条数据
     * @param id
     * @return 删除是否成功
     */
    boolean delete(Long id);
}
