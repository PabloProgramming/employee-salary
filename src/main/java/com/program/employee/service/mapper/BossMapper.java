package com.program.employee.service.mapper;

import com.program.employee.model.Boss;
import com.program.employee.model.dto.BossResponseDto;
import org.springframework.stereotype.Service;

@Service
public class BossMapper {
    public BossResponseDto bossToDto (final Boss boss){
        return BossResponseDto.builder()
                .id(boss.getId())
                .name(boss.getName())
                .surname(boss.getSurname())
                .age(boss.getAge())
                .joiningDate(boss.getJoiningDate())
                .salary(boss.getSalary())
                .salaryRaise(boss.getSalary() + boss.getSalaryRaise()*0.1)
                .incentive(boss.getIncentive())
                .build();

    }
}
