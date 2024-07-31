package com.akshat.jobapp.service;

import com.akshat.jobapp.model.JobPost;
import com.akshat.jobapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public List<JobPost> getALlJobs() {
        return repo.getAllJobs();
    }

}
