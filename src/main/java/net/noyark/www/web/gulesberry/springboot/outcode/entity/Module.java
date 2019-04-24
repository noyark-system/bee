package net.noyark.www.web.gulesberry.springboot.outcode.entity;

/**
 * 关于模块的实体类，属于帖子实体类的上层结构部分，
 * 具体的结构就是一个模块-帖子，模块的上层则是板块，
 * 即Plate
 *
 * @author Magiclu550
 */
public class Module extends BaseEntity{
    /**
     * 模块的id
     */
    private int mid;
    /**
     * 模块的名字
     */
    private String moduleName;
    /**
     * 模块的图片
     */
    private String picture;
    /**
     * 模块的介绍等内容
     */
    private String comment;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
