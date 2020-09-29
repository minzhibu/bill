package com.sjm.bill.server.impl;

import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.mbg.mapper.RoleInformationMapper;
import com.sjm.bill.mbg.model.RoleInformation;
import com.sjm.bill.server.RoleInformationServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RoleInformationServerImpl implements RoleInformationServer {
    private final RoleInformationMapper roleInformationMapper;

    public RoleInformationServerImpl(RoleInformationMapper roleInformationMapper) {
        this.roleInformationMapper = roleInformationMapper;
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
    public void insert(RoleInformation roleInformation) {
        roleInformationMapper.insert(roleInformation);
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
