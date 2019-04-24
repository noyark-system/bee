package net.noyark.www.web.gulesberry.springboot.outcode.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 该类规定了所有实体类共有的类型，在书写实体类时，必须继承
 * 这个抽象类，在使用时，则默认添加以下字段
 *
 * 本类实现了序列化接口，接下来所有实体类都默认实现序列化接口
 * 本类实现了clone接口，代表实体类可以被克隆出新对象，在后期
 * 需求中可能使用
 *
 * @author Kevin J.
 * @author Magiclu550
 */
public abstract class BaseEntity implements Serializable,Cloneable {
    /**
     * 创建者
     */
    private String createdUser;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 修改者
     */
    private String modifiedUser;
    /**
     * 修改时间
     */
    private Date modifiedTime;

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return " BaseEntity{" +
                "createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
