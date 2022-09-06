package com.example.xiaodexercise.service.impl;

import com.example.xiaodexercise.domain.Video;
import com.example.xiaodexercise.mapper.VideoMapper;
import com.example.xiaodexercise.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    public VideoMapper videoMapper;

    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}
