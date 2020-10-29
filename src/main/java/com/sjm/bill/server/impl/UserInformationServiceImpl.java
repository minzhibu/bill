package com.sjm.bill.server.impl;

import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.dto.UserInformationDTO;
import com.sjm.bill.dto.UserRoleFromDTO;
import com.sjm.bill.mbg.mapper.UserInformationMapper;
import com.sjm.bill.mbg.mapper.UserRoleFromMapper;
import com.sjm.bill.mbg.model.UserInformation;
import com.sjm.bill.mbg.model.UserRoleFrom;
import com.sjm.bill.server.UserInformationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserInformationServiceImpl implements UserInformationService {

    private final UserInformationMapper userInformationMapper;
    private final UserRoleFromMapper userRoleFromMapper;

    public UserInformationServiceImpl(UserInformationMapper userInformationMapper, UserRoleFromMapper userRoleFromMapper) {
        this.userInformationMapper = userInformationMapper;
        this.userRoleFromMapper = userRoleFromMapper;
    }

    @Override
    public PaginationDTO<UserInformation> selectPage(int page, int size) {
        List<UserInformation> userInformations = userInformationMapper.selectPage((page - 1) * size, size);
        Integer count = userInformationMapper.count();
        PaginationDTO<UserInformation> paginationDTO = new PaginationDTO<>();
        paginationDTO.setPagination(count,page,size);
        paginationDTO.setQuestions(userInformations);
        return paginationDTO;
    }

    @Override
    @Transactional
    public void insert(UserInformationDTO userInformationDTO) {
        UserInformation userInformation = new UserInformation();
        long id = UUID.randomUUID().getMostSignificantBits();
        userInformation.setId(id + "");
        userInformationDtoToUserInformation(userInformation,userInformationDTO);
        List<UserRoleFrom> userRoleFroms = createUserRoleFrom(userInformationDTO.getRoleIdS(), id);
        userInformationMapper.insert(userInformation);
        userRoleFromMapper.insertBatch(userRoleFroms);
    }

    @Override
    @Transactional
    public void update(Long id, UserInformationDTO userInformationDTO) {
        UserInformation userInformation = userInformationMapper.selectByPrimaryKey(id);
        userInformationDtoToUserInformation(userInformation,userInformationDTO);
        userRoleFromMapper.deleteByUserId(id + "");
        List<UserRoleFrom> userRoleFroms = createUserRoleFrom(userInformationDTO.getRoleIdS(), id);
        userInformationMapper.updateByPrimaryKey(userInformation);
        userRoleFromMapper.insertBatch(userRoleFroms);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userInformationMapper.deleteByPrimaryKey(id);
        userRoleFromMapper.deleteByUserId(id + "");
    }

    @Override
    public List<UserRoleFromDTO> selectByIdToRole(Long id) {
        return userInformationMapper.selectByIdToRole(id);
    }

    @Override
    public List<JurisdictionInformationDTO> selectUserIdToAuthority(Long id) {
        return userInformationMapper.selectUserIdToAuthority(id);
    }

    /**
     * 通过DTO对象构造原始对象
     * @param userInformation
     * @param userInformationDTO
     */
    private void userInformationDtoToUserInformation(UserInformation userInformation,UserInformationDTO userInformationDTO){
        userInformation.setAccountNumber(userInformationDTO.getAccountNumber());
        userInformation.setCreateTime(userInformationDTO.getCreateTime());
        userInformation.setDefaultUser(userInformationDTO.getDefaultUser());
        userInformation.setExt1(userInformationDTO.getExt1());
        userInformation.setImgAddress(userInformationDTO.getImgAddress());
        userInformation.setPassword(userInformationDTO.getPassword());
        userInformation.setState(userInformationDTO.getState());
        userInformation.setUpdateTime(userInformationDTO.getCreateTime());
        userInformation.setUserName(userInformationDTO.getUserName());
        userInformation.setCreateTime(new Date());
        userInformation.setUpdateTime(new Date());
        userInformation.setDefaultUser(1);
        userInformation.setExt1("");
    }

    private List<UserRoleFrom> createUserRoleFrom(List<String> roleIdS,Long userId){
        List<UserRoleFrom> userRoleFroms = new ArrayList<>();
        for(String roleId: roleIdS){
            UserRoleFrom userRoleFrom = new UserRoleFrom();
            userRoleFrom.setId(UUID.randomUUID().getMostSignificantBits());
            userRoleFrom.setUserId(userId + "");
            userRoleFrom.setRoleId(Long.parseLong(roleId) + "");
            userRoleFroms.add(userRoleFrom);
        }
        return userRoleFroms;
    }
}
