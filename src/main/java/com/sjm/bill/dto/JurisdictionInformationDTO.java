package com.sjm.bill.dto;

import com.sjm.bill.mbg.model.JurisdictionInformation;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class JurisdictionInformationDTO {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 权限结点名称
     *
     * @mbggenerated
     */
    private String jurisdictionName;

    /**
     * 结点的父结点ID 为-1时为根结点
     *
     * @mbggenerated
     */
    private Long parentNodeId;

    /**
     * 除了管理员外是否允许修改 0-不允许 1-允许
     *
     * @mbggenerated
     */
    private Integer isModify;

    /**
     * 结点关联的URL
     *
     * @mbggenerated
     */
    private String link;

    /**
     * 图标
     *
     * @mbggenerated
     */
    private String labelName;

    private Boolean isShow;

    private Integer priority;


    private List<JurisdictionInformation> childs;

}
