package com.example_app.curd_operations.Controller;

import com.example_app.curd_operations.Dto.CallProgressDTO;
import com.example_app.curd_operations.Service.CallProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/call-progress")
public class CallProgressController {

    private final CallProgressService callProgressService;

    @Autowired
    public CallProgressController(CallProgressService callProgressService) {
        this.callProgressService = callProgressService;
    }

    public ResponseEntity<String> updateCallProgress(
            @PathVariable Long callProgressId,
            @RequestBody CallProgressDTO callProgressDTO
    ) {
        callProgressService.updateCallProgress(callProgressId, callProgressDTO);
        return ResponseEntity.status(HttpStatus.OK).body("Call Progress updated successfully");
    }
}
