package br.com.denysnatanael.certification.modules.students.useCases;

import br.com.denysnatanael.certification.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyHasCertificationUseCase {

    public boolean execute (VerifyHasCertificationDTO dto) {
        if(dto.getEmail().equals("denys@email.com") && dto.getTechnology().equals("java")) {
            return true;
        }
        return false;
    }

}
