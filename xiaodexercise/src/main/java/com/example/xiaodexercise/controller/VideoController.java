package com.example.xiaodexercise.controller;

import com.example.xiaodexercise.domain.Video;
import com.example.xiaodexercise.service.VideoService;
import com.example.xiaodexercise.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    public VideoService videoService;

    @RequestMapping ("/list")
    public Object list(){
        return JsonData.buildSuccess(videoService.listVideo());
    }
}
