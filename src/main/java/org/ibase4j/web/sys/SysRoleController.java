package org.ibase4j.web.sys;

import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.ibase4j.model.sys.SysRole;
import org.ibase4j.service.sys.SysRoleService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import top.ibase4j.core.base.BaseController;

/**
 * 角色管理
 *
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:15:43
 */
@RestController
@Api(value = "角色管理", description = "角色管理")
@RequestMapping(value = "role")
public class SysRoleController extends BaseController<SysRole, SysRoleService> {
    @Override
    @ApiOperation(value = "查询角色")
    @RequiresPermissions("sys.base.role.read")
    @GetMapping(value = "/read/page")
    public Object query(ModelMap modelMap, Map<String, Object> param) {
        return super.query(modelMap, param);
    }

    @ApiOperation(value = "查询角色")
    @RequiresPermissions("sys.base.role.read")
    @GetMapping(value = "/read/list")
    public Object list(ModelMap modelMap, Map<String, Object> param) {
        return super.queryList(modelMap, param);
    }

    @ApiOperation(value = "角色详情")
    @RequiresPermissions("sys.base.role.read")
    @GetMapping(value = "/read/detail")
    public Object get(ModelMap modelMap, SysRole param) {
        return super.get(modelMap, param);
    }

    @Override
    @PostMapping
    @ApiOperation(value = "修改角色")
    @RequiresPermissions("sys.base.role.update")
    public Object update(ModelMap modelMap, SysRole param) {
        return super.update(modelMap, param);
    }

    @Override
    @DeleteMapping
    @ApiOperation(value = "删除角色")
    @RequiresPermissions("sys.base.role.delete")
    public Object delete(ModelMap modelMap, SysRole param) {
        return super.delete(modelMap, param);
    }
}