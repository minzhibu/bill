package com.sjm.bill;

import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.mbg.mapper.JurisdictionInformationMapper;
import com.sjm.bill.mbg.mapper.RoleJurisdictionFromMapper;
import com.sjm.bill.mbg.model.RoleInformation;
import com.sjm.bill.mbg.model.RoleJurisdictionFrom;
import com.sjm.bill.server.RoleInformationServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class BillApplicationTests {
    @Autowired
    private JurisdictionInformationMapper jurisdictionInformationMapper;
    @Autowired
    private RoleInformationServer roleInformationServer;
    @Autowired
    RoleJurisdictionFromMapper roleJurisdictionFromMapper;
    @Test
    void contextLoads() {
    }


    @Test
    void TestRoleSelectPage(){
        PaginationDTO<RoleInformation> paginationDTO = roleInformationServer.selectPage(1, 1);
        List<JurisdictionInformationDTO> jurisdictionInformationDTOS = roleInformationServer.selectByIdToJurisdiction(1L);
        System.out.println(paginationDTO.isShowNext());
        System.out.println(paginationDTO.getTotalPage());

    }

    @Test
    void testInsertBatch(){
        List<RoleJurisdictionFrom> list = new ArrayList<>();
        RoleJurisdictionFrom roleJurisdictionFrom = new RoleJurisdictionFrom();
        roleJurisdictionFrom.setId(UUID.randomUUID().getMostSignificantBits()+"");
        roleJurisdictionFrom.setJurisdictionId(UUID.randomUUID().getMostSignificantBits());
        roleJurisdictionFrom.setRoleId(UUID.randomUUID().getMostSignificantBits());
        RoleJurisdictionFrom roleJurisdictionFrom1 = new RoleJurisdictionFrom();
        roleJurisdictionFrom1.setId(UUID.randomUUID().getMostSignificantBits()+"");
        roleJurisdictionFrom1.setJurisdictionId(UUID.randomUUID().getMostSignificantBits());
        roleJurisdictionFrom1.setRoleId(UUID.randomUUID().getMostSignificantBits());
        list.add(roleJurisdictionFrom);
        list.add(roleJurisdictionFrom1);
        int i = roleJurisdictionFromMapper.insertBatch(list);
        System.out.println(i);
    }
    @Test
    void delete(){
        roleJurisdictionFromMapper.deleteByRoleId(1+"");
    }
}
