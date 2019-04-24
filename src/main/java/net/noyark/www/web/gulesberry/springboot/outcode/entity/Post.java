package net.noyark.www.web.gulesberry.springboot.outcode.entity;

/**
 * 该类规定了帖子实体的数据结构，帖子数据结构的应用
 * <BR> 在网站主页或者模块中列出帖子
 * <BR> 在个人主页或者推荐部分列出帖子
 *
 * 该类实现了序列化接口，继承自实体基类
 *
 * @author Magiclu550
 * @see BaseEntity
 */
public class Post extends BaseEntity {
    /**
     * 帖子的id号
     */
    private int sid;
    /**
     * 帖子的创建者的id，即楼主
     */
    private int uid;
    /**
     * 帖子所属模块的id
     */
    private int moduleId;
    /**
     * 帖子的标题信息
     */
    private String title;
    /**
     * 帖子是否被删除，如果被删除，则为0,没有删除，则为1
     */
    private Integer isDelete;
    /**
     * 帖子的楼主内容
     */
    private String content;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
