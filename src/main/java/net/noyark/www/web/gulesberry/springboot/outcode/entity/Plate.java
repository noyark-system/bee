package net.noyark.www.web.gulesberry.springboot.outcode.entity;

/**
 * 该实体类代表一个板块对象，板块的下层结构是模块
 *
 * 该类实现了序列化接口，继承自实体基类
 *
 * @author Magiclu550
 * @see BaseEntity
 */
public class Plate extends BaseEntity {
    /**
     * 板块的id
     */
    private int pid;
    /**
     * 板块的名称
     */
    private String plateName;
    /**
     * 管理员的uid
     */
    private int adminUid;
    /**
     * 板块的介绍等信息
     */
    private String comment;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
    }

    public int getAdminUid() {
        return adminUid;
    }

    public void setAdminUid(int adminUid) {
        this.adminUid = adminUid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
