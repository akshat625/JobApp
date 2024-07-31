package com.akshat.jobapp;

import com.akshat.jobapp.model.JobPost;
import com.akshat.jobapp.service.JobService;
import com.fasterxml.jackson.annotation.JsonRawValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;

    @GetMapping({"/", "/home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m){
        List<JobPost> jobs = service.getALlJobs();
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

    @PostMapping("/handleForm")
    public String handleAddJobForm(JobPost jobPost, Model model) {
        model.addAttribute("jobPost", jobPost);
        service.addJob(jobPost);
        return "success";

    }
}
