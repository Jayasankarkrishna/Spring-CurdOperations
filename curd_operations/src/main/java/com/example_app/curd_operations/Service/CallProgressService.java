package com.example_app.curd_operations.Service;

import com.example_app.curd_operations.Dao.CallProgressRepository;
import com.example_app.curd_operations.Dto.CallProgressDTO;
import com.example_app.curd_operations.Entity.CallProgress;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallProgressService {

    private final CallProgressRepository callProgressRepository;

    @Autowired
    public CallProgressService(CallProgressRepository callProgressRepository) {
        this.callProgressRepository = callProgressRepository;
    }

    public void updateCallProgress(Long callProgressId, CallProgressDTO callProgressDTO) {
        CallProgress existingCallProgress = callProgressRepository.findById(callProgressId)
                .orElseThrow(() -> new EntityNotFoundException("Call Progress not found with ID: " + callProgressId));

        // Update fields
        existingCallProgress.setStatusId(callProgressDTO.getStatusId());
        existingCallProgress.setComments(callProgressDTO.getComments());

        callProgressRepository.save(existingCallProgress);
    }
}
