package com.lorian.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)//令getter setter方法返回对象this自身
public class UserInfoVo {
    //主键
    private Long id;
    //昵称
    private String nickName;
    //头像
    private String avatar;
    private String sex;
    private String email;
}