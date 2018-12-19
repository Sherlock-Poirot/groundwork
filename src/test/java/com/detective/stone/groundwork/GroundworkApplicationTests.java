package com.detective.stone.groundwork;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.detective.stone.groundwork.model.Pet;
import com.detective.stone.groundwork.service.PetService;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class GroundworkApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private PetService petService;

    @Test
    public void insert() {
        Pet pet = Pet.builder().name("木木").age(new BigDecimal(0.5))
                .ownerName("纪委").ownerAge(23).build();
        petService.save(pet);
    }

    @Test
    public void delete() {
        //petService.removeById(2L);
        List<Long> ids = Lists.newArrayList();
        ids.add(3L);
        ids.add(4L);
        petService.removeByIds(ids);
    }

    @Test
    public void select() {
        List<Long> ids = Lists.newArrayList();
        ids.add(5L);
        ids.add(6L);
        List<Pet> pets = (ArrayList) petService.listByIds(ids);
        log.info(pets.size());
    }
}

