package com.detective.stone.groundwork.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.detective.stone.groundwork.service.PetService;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 宠物信息 前端控制器
 * </p>
 *
 * @author Detective Stone
 * Create time 2018-12-19
 */
@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;
}
