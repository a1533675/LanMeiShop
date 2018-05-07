package org.lanmei.common.syslog.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_log
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SysLog {
    /**
     * Database Column Remarks:
     *   日志ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.log_id
     *
     * @mbg.generated
     */
    private Integer logId;

    /**
     * Database Column Remarks:
     *   执行方法
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.method
     *
     * @mbg.generated
     */
    private String method;

    /**
     * Database Column Remarks:
     *   0：正常日志，1：异常日志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.LogType
     *
     * @mbg.generated
     */
    private Byte logtype;

    /**
     * Database Column Remarks:
     *   请求IP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.request_ip
     *
     * @mbg.generated
     */
    private String requestIp;

    /**
     * Database Column Remarks:
     *   异常代码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.exception_code
     *
     * @mbg.generated
     */
    private String exceptionCode;

    /**
     * Database Column Remarks:
     *   异常信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.exception_detail
     *
     * @mbg.generated
     */
    private String exceptionDetail;

    /**
     * Database Column Remarks:
     *   请求参数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.params
     *
     * @mbg.generated
     */
    private String params;

    /**
     * Database Column Remarks:
     *   操作人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.create_by
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     * Database Column Remarks:
     *   操作时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   日志描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.log_id
     *
     * @return the value of sys_log.log_id
     *
     * @mbg.generated
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.log_id
     *
     * @param logId the value for sys_log.log_id
     *
     * @mbg.generated
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.method
     *
     * @return the value of sys_log.method
     *
     * @mbg.generated
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.method
     *
     * @param method the value for sys_log.method
     *
     * @mbg.generated
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.LogType
     *
     * @return the value of sys_log.LogType
     *
     * @mbg.generated
     */
    public Byte getLogtype() {
        return logtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.LogType
     *
     * @param logtype the value for sys_log.LogType
     *
     * @mbg.generated
     */
    public void setLogtype(Byte logtype) {
        this.logtype = logtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.request_ip
     *
     * @return the value of sys_log.request_ip
     *
     * @mbg.generated
     */
    public String getRequestIp() {
        return requestIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.request_ip
     *
     * @param requestIp the value for sys_log.request_ip
     *
     * @mbg.generated
     */
    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.exception_code
     *
     * @return the value of sys_log.exception_code
     *
     * @mbg.generated
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.exception_code
     *
     * @param exceptionCode the value for sys_log.exception_code
     *
     * @mbg.generated
     */
    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.exception_detail
     *
     * @return the value of sys_log.exception_detail
     *
     * @mbg.generated
     */
    public String getExceptionDetail() {
        return exceptionDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.exception_detail
     *
     * @param exceptionDetail the value for sys_log.exception_detail
     *
     * @mbg.generated
     */
    public void setExceptionDetail(String exceptionDetail) {
        this.exceptionDetail = exceptionDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.params
     *
     * @return the value of sys_log.params
     *
     * @mbg.generated
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.params
     *
     * @param params the value for sys_log.params
     *
     * @mbg.generated
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.create_by
     *
     * @return the value of sys_log.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.create_by
     *
     * @param createBy the value for sys_log.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.create_date
     *
     * @return the value of sys_log.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.create_date
     *
     * @param createDate the value for sys_log.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.description
     *
     * @return the value of sys_log.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.description
     *
     * @param description the value for sys_log.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }
}