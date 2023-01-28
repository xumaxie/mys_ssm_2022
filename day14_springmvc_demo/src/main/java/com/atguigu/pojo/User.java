package com.atguigu.pojo;

/**
 * @author xujian
 * @create 2023-01-13 17:12
 * <form th:action="@{/testpojo}" method="post">
 *     用户名：<input type="text" name="username"><br>
 *     密码：<input type="password" name="password"><br>
 *     性别：<input type="radio" name="sex" value="男">男<input type="radio"name="sex" value="女">女<br>
 *     年龄：<input type="text" name="age"><br>
 *     邮箱：<input type="text" name="email"><br>
 *     <input type="submit">
 * </form>
 */
public class User {
    private String username;
    private String password;
    private String sex;
    private Integer age;
    private String email;

    public User(){}

    public User(String username, String password, String sex, Integer age, String email) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.email = email;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
