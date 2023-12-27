package com.cms.content_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer uId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pId")
    private Post post;
    private String username;
    private String email;





//    public User(){
//
//    }
//    @OneToMany(mappedBy = "user",cascade = CascadeType.MERGE)
//    private List<Post> posts;

//    public Integer getuId() {
//        return uId;
//    }

   // public void setuId(Integer uId) {
    //    this.uId = uId;
   // }

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public User(Integer uId, String username, String email) {
//        this.uId = uId;
//        this.username = username;
//        this.email = email;
//    }
}
