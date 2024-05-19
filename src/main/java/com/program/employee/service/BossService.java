package com.program.employee.service;

import com.program.employee.model.Boss;
import com.program.employee.model.dto.BossResponseDto;
import com.program.employee.repository.BossRepository;
import com.program.employee.service.mapper.BossMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BossService {

    @Autowired
    BossRepository bossRepository;

    @Autowired
    BossMapper bossMapper;

   public BossResponseDto saveBoss(final Boss boss){
       Boss boss1 = bossRepository.save(boss);
       return bossMapper.bossToDto(boss1);
   }

   public BossResponseDto modifyBossSalaray(final Boss boss){
       Optional<Boss> boss1 = bossRepository.findById(boss.getId());
       if (boss1.isPresent()){
           Boss modifiedBoss = bossRepository.save(boss);
           return bossMapper.bossToDto(modifiedBoss);
       }
       return null;


   }




}
