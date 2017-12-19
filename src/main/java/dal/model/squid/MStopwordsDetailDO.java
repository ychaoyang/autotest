package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_stopwords_detail")
public class MStopwordsDetailDO implements Serializable {
    /**
     * 禁用词汇详情表id
     */
    @Id
    @Column(name = "DETAIL_ID")
    private Long detailId;

    /**
     * 禁用词汇id
     */
    @Column(name = "STOPWORDS_ID")
    private Long stopwordsId;

    /**
     * 禁用词汇类型 code
     */
    @Column(name = "STOPWORDS_TYPE")
    private String stopwordsType;

    /**
     * 启用、禁用 code
     */
    @Column(name = "STOPWORDS_FLAG")
    private String stopwordsFlag;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    /**
     * 修改时间
     */
    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    /**
     * 创建用户
     */
    @Column(name = "CREATED_USER")
    private String createdUser;

    /**
     * 修改用户
     */
    @Column(name = "UPDATED_USER")
    private String updatedUser;

    /**
     * 版本ID
     */
    @Column(name = "VERSION_ID")
    private Long versionId;

    /**
     * 删除标记
     */
    @Column(name = "MARK_DELETE")
    private String markDelete;

    private static final long serialVersionUID = 1L;

    /**
     * 获取禁用词汇详情表id
     *
     * @return DETAIL_ID - 禁用词汇详情表id
     */
    public Long getDetailId() {
        return detailId;
    }

    /**
     * 设置禁用词汇详情表id
     *
     * @param detailId 禁用词汇详情表id
     */
    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    /**
     * 获取禁用词汇id
     *
     * @return STOPWORDS_ID - 禁用词汇id
     */
    public Long getStopwordsId() {
        return stopwordsId;
    }

    /**
     * 设置禁用词汇id
     *
     * @param stopwordsId 禁用词汇id
     */
    public void setStopwordsId(Long stopwordsId) {
        this.stopwordsId = stopwordsId;
    }

    /**
     * 获取禁用词汇类型 code
     *
     * @return STOPWORDS_TYPE - 禁用词汇类型 code
     */
    public String getStopwordsType() {
        return stopwordsType;
    }

    /**
     * 设置禁用词汇类型 code
     *
     * @param stopwordsType 禁用词汇类型 code
     */
    public void setStopwordsType(String stopwordsType) {
        this.stopwordsType = stopwordsType;
    }

    /**
     * 获取启用、禁用 code
     *
     * @return STOPWORDS_FLAG - 启用、禁用 code
     */
    public String getStopwordsFlag() {
        return stopwordsFlag;
    }

    /**
     * 设置启用、禁用 code
     *
     * @param stopwordsFlag 启用、禁用 code
     */
    public void setStopwordsFlag(String stopwordsFlag) {
        this.stopwordsFlag = stopwordsFlag;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED_DATE - 创建时间
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置创建时间
     *
     * @param createdDate 创建时间
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 获取修改时间
     *
     * @return MODIFIED_DATE - 修改时间
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 设置修改时间
     *
     * @param modifiedDate 修改时间
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * 获取创建用户
     *
     * @return CREATED_USER - 创建用户
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置创建用户
     *
     * @param createdUser 创建用户
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 获取修改用户
     *
     * @return UPDATED_USER - 修改用户
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * 设置修改用户
     *
     * @param updatedUser 修改用户
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * 获取版本ID
     *
     * @return VERSION_ID - 版本ID
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 设置版本ID
     *
     * @param versionId 版本ID
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    /**
     * 获取删除标记
     *
     * @return MARK_DELETE - 删除标记
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * 设置删除标记
     *
     * @param markDelete 删除标记
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", detailId=").append(detailId);
        sb.append(", stopwordsId=").append(stopwordsId);
        sb.append(", stopwordsType=").append(stopwordsType);
        sb.append(", stopwordsFlag=").append(stopwordsFlag);
        sb.append(", remark=").append(remark);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}