package net.noyark.www.web.gulesberry.springboot.outcode.entity;

import java.util.Date;

/**
 * 该类代表了User实体类，一个实体类将代表着数据库交互和业务
 * 逻辑的唯一对象实体，其中信息依据数据库。
 *
 * 另外，本类实现了序列化接口，由实体基类继承
 *
 * @author Kevin. J
 * @author Magiclu550
 */
public class User extends BaseEntity{
    /**
     * 永久封禁
     */
    public static final int FOREVER_BAN = -1;

    /**
     * 用户的id码，用于标示对象
     */
    private Integer uid;
    /**
     * 用户的名字
     */
    private String username;
    /**
     * 用户的昵称
     */
    private String nickname;
    /**
     * 用户的密码，默认以加盐和加密处理
     */
    private String password;
    /**
     * 用户的性别
      */
    private Integer gender;
    /**
     * 用户的电话
     */
    private String phone;
    /**
     * 用户的盐值，用于加密密码
     */
    private String salt;
    /**
     * 用户的等级，会由此查询到等级信息
     */
    private Integer levelId;
    /**
     * 用户的地址
     */
    private String address;
    /**
     * 用户的生日
     */
    private Date birthday;
    /**
     * 用户是否被删除，事实上，信息即使被删除
     * 也是被保留的
     */
    private Integer isDelete;
    /**
     * 头像信息
     */
    private String avatar;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 是否为管理员，后期划分权限组
     */
    private Integer isAdmin;
    /**
     * 是否被封禁，封禁者则不能访问部分信息
     */
    private Integer isBan;
    /**
     * 封禁的最大期限，永久封禁则写入常量
     * FORERVER_BAN
     */
    private Date banDate;



    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", nickname='" + nickname + '\'' +
                ", address='" + address + '\'' +
                ", avatar='" + avatar + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", levelId=" + levelId +
                ", isDelete=" + isDelete +
                ", isAdmin=" + isAdmin +
                "} " + super.toString();
    }

    public Integer getIsBan() {
        return isBan;
    }

    public void setIsBan(Integer isBan) {
        this.isBan = isBan;
    }

    public Date getBanDate() {
        return banDate;
    }

    public void setBanDate(Date banDate) {
        this.banDate = banDate;
    }
}
