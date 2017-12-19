package dal.model.squid;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_news_flash")
public class TNewsFlashDO implements Serializable {
    /**
     * 激光推送ID
     */
    @Id
    @Column(name = "ENTITY_ID")
    private Long entityId;

    /**
     * 消息内容
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 消息类型
     */
    @Column(name = "NEWS_TYPE")
    private String newsType;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "CREATED_USER")
    private String createdUser;

    @Column(name = "VERSION_ID")
    private Integer versionId;

    @Column(name = "UPDATED_USER")
    private String updatedUser;

    @Column(name = "MARK_DELETE")
    private String markDelete;

    private static final long serialVersionUID = 1L;

    /**
     * 获取激光推送ID
     *
     * @return ENTITY_ID - 激光推送ID
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * 设置激光推送ID
     *
     * @param entityId 激光推送ID
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * 获取消息内容
     *
     * @return CONTENT - 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置消息内容
     *
     * @param content 消息内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取消息类型
     *
     * @return NEWS_TYPE - 消息类型
     */
    public String getNewsType() {
        return newsType;
    }

    /**
     * 设置消息类型
     *
     * @param newsType 消息类型
     */
    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    /**
     * @return CREATED_DATE
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * @param modifiedDate
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * @return CREATED_USER
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * @param createdUser
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * @return VERSION_ID
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * @param versionId
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * @return UPDATED_USER
     */
    public String getUpdatedUser() {
        return updatedUser;
    }

    /**
     * @param updatedUser
     */
    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    /**
     * @return MARK_DELETE
     */
    public String getMarkDelete() {
        return markDelete;
    }

    /**
     * @param markDelete
     */
    public void setMarkDelete(String markDelete) {
        this.markDelete = markDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", entityId=").append(entityId);
        sb.append(", content=").append(content);
        sb.append(", newsType=").append(newsType);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", versionId=").append(versionId);
        sb.append(", updatedUser=").append(updatedUser);
        sb.append(", markDelete=").append(markDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}