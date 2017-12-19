package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "m_stopwords")
public class MStopwordsDO implements Serializable {
    /**
     * 禁用词id
     */
    @Id
    @Column(name = "STOPWORDS_ID")
    private Long stopwordsId;

    /**
     * 禁用词类型
     */
    @Column(name = "STOPWORDS_TYPE")
    private String stopwordsType;

    /**
     * 禁用词
     */
    @Column(name = "STOPWORDS_WORD")
    private String stopwordsWord;

    /**
     * 禁用词标志
     */
    @Column(name = "STOPWORDS_FLAG")
    private String stopwordsFlag;

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
     * 获取禁用词id
     *
     * @return STOPWORDS_ID - 禁用词id
     */
    public Long getStopwordsId() {
        return stopwordsId;
    }

    /**
     * 设置禁用词id
     *
     * @param stopwordsId 禁用词id
     */
    public void setStopwordsId(Long stopwordsId) {
        this.stopwordsId = stopwordsId;
    }

    /**
     * 获取禁用词类型
     *
     * @return STOPWORDS_TYPE - 禁用词类型
     */
    public String getStopwordsType() {
        return stopwordsType;
    }

    /**
     * 设置禁用词类型
     *
     * @param stopwordsType 禁用词类型
     */
    public void setStopwordsType(String stopwordsType) {
        this.stopwordsType = stopwordsType;
    }

    /**
     * 获取禁用词
     *
     * @return STOPWORDS_WORD - 禁用词
     */
    public String getStopwordsWord() {
        return stopwordsWord;
    }

    /**
     * 设置禁用词
     *
     * @param stopwordsWord 禁用词
     */
    public void setStopwordsWord(String stopwordsWord) {
        this.stopwordsWord = stopwordsWord;
    }

    /**
     * 获取禁用词标志
     *
     * @return STOPWORDS_FLAG - 禁用词标志
     */
    public String getStopwordsFlag() {
        return stopwordsFlag;
    }

    /**
     * 设置禁用词标志
     *
     * @param stopwordsFlag 禁用词标志
     */
    public void setStopwordsFlag(String stopwordsFlag) {
        this.stopwordsFlag = stopwordsFlag;
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
        sb.append(", stopwordsId=").append(stopwordsId);
        sb.append(", stopwordsType=").append(stopwordsType);
        sb.append(", stopwordsWord=").append(stopwordsWord);
        sb.append(", stopwordsFlag=").append(stopwordsFlag);
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