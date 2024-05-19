package com.program.employee.controller;

import com.program.employee.model.Boss;
import com.program.employee.model.dto.BossResponseDto;
import com.program.employee.service.BossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/boss")
public class BossController {

    @Autowired
    BossService bossService;

    @PostMapping
    private ResponseEntity<BossResponseDto> saveBoss(@RequestBody final Boss boss) {
        return ResponseEntity.ok(bossService.saveBoss(boss));
    }

    @PutMapping
    private ResponseEntity<BossResponseDto> changeBoss(@RequestBody final Boss boss) {
        return ResponseEntity.ok(bossService.modifyBossSalaray(boss));

    }
}
