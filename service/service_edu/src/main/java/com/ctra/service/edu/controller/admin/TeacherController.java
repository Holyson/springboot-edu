package com.ctra.service.edu.controller.admin;


import com.ctra.service.edu.entity.Teacher;
import com.ctra.service.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author wl
 * @since 2020-05-17
 */
@RestController
@RequestMapping("/admin/edu/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("list")
    //    获取所有老师
    public List<Teacher> listAll() {
        List<Teacher> teachers = teacherService.list();
        return teachers;
    }

    @DeleteMapping("remove/{id}")
    public boolean removeById(@PathVariable String id) { // @PathVariable 添加 路径参数
        return teacherService.removeById(id);
    }

}

