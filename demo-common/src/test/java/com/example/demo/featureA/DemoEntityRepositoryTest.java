package com.example.demo.featureA;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.example.demo.featureA.entity.DemoEntity;
import com.example.demo.featureA.repository.DemoEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class DemoEntityRepositoryTest {
    @Autowired
    private DemoEntityRepository demoEntityRepository;

    @Test
    public void add() {
        demoEntityRepository.save(new DemoEntity(1L));
        DemoEntity saved = demoEntityRepository.findById(1L).get();
        assertThat(saved.getId(), is(1L));

    }
}
