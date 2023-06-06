package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class QueryCourseParamsDto {

    @ApiModelProperty("审核状态")
    private String auditStatus;
    // 课程名称
    @ApiModelProperty("课程名称")
    private String courseName;
    // 发布状态
    @ApiModelProperty("发布状态")
    private String publishStatus;

}
