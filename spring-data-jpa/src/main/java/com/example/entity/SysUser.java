package com.example.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class SysUser implements Serializable{
    @Id
    @GeneratedValue
    @ApiModelProperty("序号")
    private Long id ;

    @ApiModelProperty("账号")
    @Column(nullable = false)
    private String account ;

    @ApiModelProperty("密码")
    @Column(nullable = false)
    private String password ;

    @ApiModelProperty("昵称")
    private String nickname ;
    private Integer fans ;
    public SysUser(String account, String password, String nickname, Integer fans) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.fans = fans;
    }

    public SysUser() {
    }
}
