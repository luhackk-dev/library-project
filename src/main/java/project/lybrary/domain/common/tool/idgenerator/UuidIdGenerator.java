package project.lybrary.domain.common.tool.idgenerator;

import java.util.UUID;

import org.springframework.stereotype.Service;

import project.lybrary.domain.common.tool.idgenerator.contract.IdGenerator;

@Service

public class UuidIdGenerator implements IdGenerator {
    
    public String generate() {
        UUID id = UUID.randomUUID();
        String idString = id.toString();
        return idString; 
    }
    
}
