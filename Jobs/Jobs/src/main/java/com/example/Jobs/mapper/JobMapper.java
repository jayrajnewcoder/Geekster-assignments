package com.example.Jobs.mapper;

import org.mapstruct.Mapper;

import com.example.Jobs.Domain.Job;
import com.example.Jobs.dao.JobDao;


@Mapper(componentModel = "spring", uses = {})
public interface JobMapper extends EntityMapper<JobDao, Job>{
	

    default Job fromId(Long id) {
        if (id == null) {
            return null;
        }
        Job job = new Job();
        job.setId(id);
        return job;
    }
	
}

