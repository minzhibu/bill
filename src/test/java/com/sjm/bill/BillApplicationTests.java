package com.sjm.bill;

import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.mbg.mapper.JurisdictionInformationMapper;
import com.sjm.bill.mbg.model.RoleInformation;
import com.sjm.bill.server.RoleInformationServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BillApplicationTests {
    @Autowired
    private JurisdictionInformationMapper jurisdictionInformationMapper;
    @Autowired
    private RoleInformationServer roleInformationServer;
    @Test
    void contextLoads() {
    }


    @Test
    void TestRoleSelectPage(){
        PaginationDTO<RoleInformation> paginationDTO = roleInformationServer.selectPage(1, 1);
        System.out.println(paginationDTO.isShowNext());
        System.out.println(paginationDTO.getTotalPage());
    }
}
