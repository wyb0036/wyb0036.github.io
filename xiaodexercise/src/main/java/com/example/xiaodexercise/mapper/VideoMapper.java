package com.example.xiaodexercise.mapper;

import com.example.xiaodexercise.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class VideoMapper {
    public static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1,new Video(1,"小A课堂",10));
        videoMap.put(2,new Video(2,"小B课堂",20));
        videoMap.put(3,new Video(3,"小C课堂",30));
        videoMap.put(4,new Video(4,"小D课堂",40));
        videoMap.put(5,new Video(5,"小E课堂",50));
    }

    public List<Video> listVideo(){
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }
}
