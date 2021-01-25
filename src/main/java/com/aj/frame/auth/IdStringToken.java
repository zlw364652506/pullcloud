package com.aj.frame.auth;


import com.aj.frame.api.F;
import com.aj.frame.idstring.FormatedIdString;
import com.aj.frame.idstring.IdString;

/**
 * 服务端字符串ID定义接口
 *
 * @author linbo
 * Created on 2020.07.23
 */
public interface IdStringToken extends com.aj.frame.um.Ids {

    /**
     * <b>当前系统相关的ID字符串定义</b>
     */
    interface auth {

        /**
         * 缺省的用户模型处理器ID
         */
        enum DefaultProcessorIds {
            //测试
            DEMO,
            滤镜DEMO,

            // 用户模块
            管理平台用户登入,
            App用户登入,
            用户登入扩展处理器,
            获取政务微信用户信息,

            // chenzhirong 认证和鉴权
            验证用户凭证,
            
            获取用户的应用列表,
            获取应用的用户列表,
            获取应用的资源列表,
            获取资源的应用列表,
            鉴权用户应用,
            鉴权应用资源,
            导入用户应用权限,
            导入应用资源权限,
        }

        /**
         * 当前系统的错误ID定义
         */
        enum Errors implements IdString {
            无权限(20001),
            权限导入失败(20003),
            其他错误(20004),
            系统异常(20005),
            参数异常(20006),
            用户凭证认证失败(20008),
            应用凭证认证失败(20009),


            用户未授权(21023),
            用户已被禁止登入系统(21024),
            用户未登录(21030),
            警号不能重复(21031),
            部门不存在(21032),

            应用资源不存在_s(31001),
            授权码不存在(31002),
            授权码已失效(31003),
            授权码已过期(31004),

            //用户凭证票据验证
            用户ID为空(41001),
            身份证号为空(41002),
            组织机构代码为空(41003),
            用户姓名为空(41004),
            应用ID为空(41005),
            归属机构ID为空(41006),
            应用包名为空(41007),
            应用名称为空(41008),
            客户端服务端标识为空(41009),


            生效时间已过期(42001),
            用户不存在(42002),
            身份证号不匹配(42003),
            用户姓名不匹配(42004),
            组织机构代码不匹配(42005),
            应用信息不存在或不唯一(42006),
            
            
            业务对象不存在(42007),
            

            ;

            /**
             * id值
             */
            private int id;

            Errors(int id) {
                this.id = id;
            }

            @Override
            public int getId() {
                return this.id;
            }

            @Override
            public String getString() {
                return F.getIdStrings().getString(this);
            }

            @Override
            public String getName() {
                return this.name();
            }

            @Override
            public IdString format(Object... args) {
                return new FormatedIdString(this.getId(), this.getName(), args);
            }

            @Override
            public Object[] getFormatArgs() {
                return null;
            }
        }
    }
}
