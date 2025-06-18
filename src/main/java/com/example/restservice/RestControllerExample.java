package com.example.restservice;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

//    @GetMapping(path = "/get/mapping")
//    public String getMapping(){
//        return "hello";
//    }

    @GetMapping(path = "/get/student")
    public Student getStudentDetails(){

        Student student = new Student();
        Address address = new Address();
        address.setStreetName("kotthuru");
        address.setHouseNo("2-107A");
        address.setCityName("pasupugallu");
        State state = new State();
        state.setStateName("Andhra pradesh");
        state.setStateCOde("523265");
        state.setDistrictName("prakasam");
        address.setState(state);
        student.setAddress(address);

        Contact contacts=new Contact();
        contacts.setEmail("sivakrishnareddyinduri@gmail.com");
        contacts.setPhoneNumber(91105580);
        contacts.setSocialMedia("instagram");
        student.setContact(contacts);
        Education educationinfo=new Education();
        educationinfo.setBtechPercentage(66);
        educationinfo.setInterPercentage(92);
        educationinfo.setSscPercentage(92);
        student.setEducation(educationinfo);
        return student;
    }


    @PostMapping(path = "/update/student")
    public Student updateStudent(@RequestBody Student student){
       System.out.println(student);
        return student;
    }


//    @PostMapping(path = "/update/student")
//    public Student updateStudent(@RequestBody Student student) {
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
//            System.out.println(json);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return student;
//    }

}
