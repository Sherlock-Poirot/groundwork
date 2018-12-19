package com.detective.stone.groundwork.service.impl;

import com.detective.stone.groundwork.model.Pet;
import com.detective.stone.groundwork.dao.PetMapper;
import com.detective.stone.groundwork.service.PetService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 宠物信息 服务实现类
 * </p>
 *
 * @author Detective Stone
 * @since 2018-12-19
 */
@Service
public class PetServiceImpl extends ServiceImpl<PetMapper, Pet> implements PetService {
}
