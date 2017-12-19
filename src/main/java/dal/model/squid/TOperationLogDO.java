package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_operation_log")
public class TOperationLogDO implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 操作人登录名
     */
    @Column(name = "OPERATION_PERSON")
    private String operationPerson;

    /**
     * 操作人真实姓名
     */
    @Column(name = "OPERATION_PERSON_REAL_NAME")
    private String operationPersonRealName;

    /**
     * 操作时间
     */
    @Column(name = "OPERATION_TIME")
    private Date operationTime;

    /**
     * 操作IP
     */
    @Column(name = "OPERATION_IP")
    private String operationIp;

    /**
     * 操作描述
     */
    @Column(name = "OPERATION_DIS")
    private String operationDis;

    /**
     * 日志类型；LOGIN登录日志,LOGOUT登出日志,ACCESS资源访问日志,THIRD第三方日志
     */
    @Column(name = "LOG_TYPE")
    private String logType;

    /**
     * 请求地址
     */
    @Column(name = "REQ_URL")
    private String reqUrl;

    /**
     * 请求参数：json数据
     */
    @Column(name = "REQ_PARAMS")
    private String reqParams;

    /**
     * POST、GET等
     */
    @Column(name = "REQ_METHOD")
    private String reqMethod;

    /**
     * 请求耗时
     */
    @Column(name = "REQ_CONSUME")
    private Long reqConsume;

    /**
     * 请求结果：json数据
     */
    @Column(name = "REQ_RESULT")
    private String reqResult;

    /**
     * 服务器IP
     */
    @Column(name = "SERVER_IP")
    private String serverIp;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ENTITY_ID - 主键
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * 设置主键
     *
     * @param entityId 主键
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取操作人登录名
     *
     * @return OPERATION_PERSON - 操作人登录名
     */
    public String getOperationPerson() {
        return operationPerson;
    }

    /**
     * 设置操作人登录名
     *
     * @param operationPerson 操作人登录名
     */
    public void setOperationPerson(String operationPerson) {
        this.operationPerson = operationPerson;
    }

    /**
     * 获取操作人真实姓名
     *
     * @return OPERATION_PERSON_REAL_NAME - 操作人真实姓名
     */
    public String getOperationPersonRealName() {
        return operationPersonRealName;
    }

    /**
     * 设置操作人真实姓名
     *
     * @param operationPersonRealName 操作人真实姓名
     */
    public void setOperationPersonRealName(String operationPersonRealName) {
        this.operationPersonRealName = operationPersonRealName;
    }

    /**
     * 获取操作时间
     *
     * @return OPERATION_TIME - 操作时间
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * 设置操作时间
     *
     * @param operationTime 操作时间
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    /**
     * 获取操作IP
     *
     * @return OPERATION_IP - 操作IP
     */
    public String getOperationIp() {
        return operationIp;
    }

    /**
     * 设置操作IP
     *
     * @param operationIp 操作IP
     */
    public void setOperationIp(String operationIp) {
        this.operationIp = operationIp;
    }

    /**
     * 获取操作描述
     *
     * @return OPERATION_DIS - 操作描述
     */
    public String getOperationDis() {
        return operationDis;
    }

    /**
     * 设置操作描述
     *
     * @param operationDis 操作描述
     */
    public void setOperationDis(String operationDis) {
        this.operationDis = operationDis;
    }

    /**
     * 获取日志类型；LOGIN登录日志,LOGOUT登出日志,ACCESS资源访问日志,THIRD第三方日志
     *
     * @return LOG_TYPE - 日志类型；LOGIN登录日志,LOGOUT登出日志,ACCESS资源访问日志,THIRD第三方日志
     */
    public String getLogType() {
        return logType;
    }

    /**
     * 设置日志类型；LOGIN登录日志,LOGOUT登出日志,ACCESS资源访问日志,THIRD第三方日志
     *
     * @param logType 日志类型；LOGIN登录日志,LOGOUT登出日志,ACCESS资源访问日志,THIRD第三方日志
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * 获取请求地址
     *
     * @return REQ_URL - 请求地址
     */
    public String getReqUrl() {
        return reqUrl;
    }

    /**
     * 设置请求地址
     *
     * @param reqUrl 请求地址
     */
    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl;
    }

    /**
     * 获取请求参数：json数据
     *
     * @return REQ_PARAMS - 请求参数：json数据
     */
    public String getReqParams() {
        return reqParams;
    }

    /**
     * 设置请求参数：json数据
     *
     * @param reqParams 请求参数：json数据
     */
    public void setReqParams(String reqParams) {
        this.reqParams = reqParams;
    }

    /**
     * 获取POST、GET等
     *
     * @return REQ_METHOD - POST、GET等
     */
    public String getReqMethod() {
        return reqMethod;
    }

    /**
     * 设置POST、GET等
     *
     * @param reqMethod POST、GET等
     */
    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }

    /**
     * 获取请求耗时
     *
     * @return REQ_CONSUME - 请求耗时
     */
    public Long getReqConsume() {
        return reqConsume;
    }

    /**
     * 设置请求耗时
     *
     * @param reqConsume 请求耗时
     */
    public void setReqConsume(Long reqConsume) {
        this.reqConsume = reqConsume;
    }

    /**
     * 获取请求结果：json数据
     *
     * @return REQ_RESULT - 请求结果：json数据
     */
    public String getReqResult() {
        return reqResult;
    }

    /**
     * 设置请求结果：json数据
     *
     * @param reqResult 请求结果：json数据
     */
    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }

    /**
     * 获取服务器IP
     *
     * @return SERVER_IP - 服务器IP
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * 设置服务器IP
     *
     * @param serverIp 服务器IP
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", operationPerson=").append(operationPerson);
        sb.append(", operationPersonRealName=").append(operationPersonRealName);
        sb.append(", operationTime=").append(operationTime);
        sb.append(", operationIp=").append(operationIp);
        sb.append(", operationDis=").append(operationDis);
        sb.append(", logType=").append(logType);
        sb.append(", reqUrl=").append(reqUrl);
        sb.append(", reqParams=").append(reqParams);
        sb.append(", reqMethod=").append(reqMethod);
        sb.append(", reqConsume=").append(reqConsume);
        sb.append(", reqResult=").append(reqResult);
        sb.append(", serverIp=").append(serverIp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}