package com.ddd.client.api;

import com.ddd.client.dto.result.ApplicationServiceResult;
import com.ddd.client.dto.valueobject.ApplicationServiceVO;

/**
 * application service
 */
public interface ApplicationService {

    /**
     *  
     */
    ApplicationServiceResult execute(ApplicationServiceVO applicationServiceVO);

    
}
