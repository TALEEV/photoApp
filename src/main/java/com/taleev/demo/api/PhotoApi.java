package com.taleev.demo.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("photo")
public class PhotoApi {

    private List<String> listOfPhotos = new ArrayList<>();

    @GetMapping("")
    public String welcome(){
        return "Welcome to the photo App !!";
    }

    @PostMapping("/save/{photo1}/{photo2}")
    public HttpStatus savePhotos(@PathVariable("photo1") String photo1, @PathVariable("photo2") String photo2){
        listOfPhotos.add(photo1);
        listOfPhotos.add(photo2);
        return HttpStatus.OK;
    }


    @PostMapping("/save/{photo}")
    public String savePhoto(@PathVariable("photo") String photo){
        listOfPhotos.add(photo);
        return "Congrats you have saved "+ photo;
    }

    @GetMapping("/getAllPhotos")
    public List<String> savePhoto(){
        return listOfPhotos;
    }

}
