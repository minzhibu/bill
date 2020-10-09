package com.sjm.bill.server.impl;

import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.mbg.mapper.JurisdictionInformationMapper;
import com.sjm.bill.mbg.model.JurisdictionInformation;
import com.sjm.bill.server.JurisdictionInformationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class JurisdictionInformationServiceImpl implements JurisdictionInformationService {

    private final JurisdictionInformationMapper jurisdictionInformationMapper;

    public JurisdictionInformationServiceImpl(JurisdictionInformationMapper jurisdictionInformationMapper) {
        this.jurisdictionInformationMapper = jurisdictionInformationMapper;
    }

    @Override
    public List<JurisdictionInformationDTO> selectByTree() {
        return jurisdictionInformationMapper.selectByTree(null);
    }

    @Override
    public void insert(JurisdictionInformation jurisdictionInformation) {
        jurisdictionInformation.setIsModify(0);
        long mostSignificantBits = UUID.randomUUID().getMostSignificantBits();
        jurisdictionInformation.setId(mostSignificantBits + "");
        jurisdictionInformationMapper.insert(jurisdictionInformation);
    }

    @Override
    public void update(Long id, JurisdictionInformation jurisdictionInformation) {
        JurisdictionInformation jurisdictionInformation1 = jurisdictionInformationMapper.selectByPrimaryKey(id);
        jurisdictionInformation1.setIsShow(jurisdictionInformation.getIsShow());
        jurisdictionInformation1.setIsModify(jurisdictionInformation.getIsModify());
        jurisdictionInformation1.setJurisdictionName(jurisdictionInformation.getJurisdictionName());
        jurisdictionInformation1.setLabelName(jurisdictionInformation.getLabelName());
        jurisdictionInformation1.setLink(jurisdictionInformation.getLink());
        jurisdictionInformation1.setParentNodeId(jurisdictionInformation.getParentNodeId());
        jurisdictionInformation1.setPriority(jurisdictionInformation.getPriority());
        jurisdictionInformation1.setIsModify(0);
        jurisdictionInformationMapper.updateByPrimaryKey(jurisdictionInformation1);
    }

    @Override
    public boolean delete(Long id) {
        JurisdictionInformation jurisdictionInformation = new JurisdictionInformation();
        jurisdictionInformation.setId(id + "");
        List<JurisdictionInformationDTO> jurisdictionInformationDTOS = jurisdictionInformationMapper.selectByTree(jurisdictionInformation);
        if(jurisdictionInformationDTOS.size() == 0 || (jurisdictionInformationDTOS.size() == 1 || jurisdictionInformationDTOS.get(0).getChilds().size() == 0)){
            jurisdictionInformationMapper.deleteByPrimaryKey(id);
            return true;
        }
        return false;
    }


}
