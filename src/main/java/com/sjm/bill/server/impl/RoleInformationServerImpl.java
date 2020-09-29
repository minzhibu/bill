package com.sjm.bill.server.impl;

import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.dto.RoleInformationDTO;
import com.sjm.bill.mbg.mapper.RoleInformationMapper;
import com.sjm.bill.mbg.mapper.RoleJurisdictionFromMapper;
import com.sjm.bill.mbg.model.RoleInformation;
import com.sjm.bill.mbg.model.RoleJurisdictionFrom;
import com.sjm.bill.server.RoleInformationServer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class RoleInformationServerImpl implements RoleInformationServer {
    private final RoleInformationMapper roleInformationMapper;
    private final RoleJurisdictionFromMapper roleJurisdictionFromMapper;

    public RoleInformationServerImpl(RoleInformationMapper roleInformationMapper, RoleJurisdictionFromMapper roleJurisdictionFromMapper) {
        this.roleInformationMapper = roleInformationMapper;
        this.roleJurisdictionFromMapper = roleJurisdictionFromMapper;
    }


    @Override
    public PaginationDTO<RoleInformation> selectPage(int page, int size) {
        List<RoleInformation> roleInformations = roleInformationMapper.selectPage((page - 1), size);
        Integer count = roleInformationMapper.count();
        PaginationDTO<RoleInformation> paginationDTO = new PaginationDTO<>();
        paginationDTO.setPagination(count,page,size);
        paginationDTO.setQuestions(roleInformations);
        return paginationDTO;
    }

    @Override
    @Transactional
    public void insert(RoleInformationDTO roleInformationDTO) {
        RoleInformation roleInformation = new RoleInformation();
        String roleId = UUID.randomUUID().getMostSignificantBits()+"";
        roleInformation.setId(roleId);
        roleInformation.setRoleName(roleInformationDTO.getRoleName());
        roleInformation.setState(roleInformationDTO.getState());
        roleInformation.setExt1("");
        roleInformation.setDefaultRole(1);
        roleInformation.setUpdateTime(new Date());
        roleInformation.setCreateTime(new Date());
        List<String> authoritys = roleInformationDTO.getAuthoritys();
        List<RoleJurisdictionFrom> RoleJurisdictionFroms = new ArrayList<>();
        for(String jurisdictions: authoritys){
            RoleJurisdictionFrom roleJurisdictionFrom = new RoleJurisdictionFrom();
            roleJurisdictionFrom.setId(UUID.randomUUID().getMostSignificantBits() + "");
            roleJurisdictionFrom.setRoleId(Long.parseLong(roleId));
            roleJurisdictionFrom.setJurisdictionId(Long.parseLong(jurisdictions));
            RoleJurisdictionFroms.add(roleJurisdictionFrom);
        }
        roleInformationMapper.insert(roleInformation);
        roleJurisdictionFromMapper.insertBatch(RoleJurisdictionFroms);
    }

    @Override
    public void update(Long id, RoleInformation roleInformation) {
        RoleInformation roleInformation1 = roleInformationMapper.selectByPrimaryKey(id);
        roleInformation1.setUpdateTime(new Date());
        roleInformation1.setDefaultRole(roleInformation.getDefaultRole());
        roleInformation1.setExt1(roleInformation.getExt1());
        roleInformation1.setRoleName(roleInformation.getRoleName());
        roleInformation1.setState(roleInformation.getState());
        roleInformationMapper.updateByPrimaryKey(roleInformation1);
    }

    @Override
    public void delete(Long id) {
        roleInformationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<JurisdictionInformationDTO> selectByIdToJurisdiction(Long id) {
        return roleInformationMapper.selectByIdToJurisdiction(id);
    }
}
