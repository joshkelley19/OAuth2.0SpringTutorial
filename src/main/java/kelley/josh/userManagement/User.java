package kelley.josh.userManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by joshuakelley on 11/3/16.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;

//    gender:"male"
//    id:"105837906563288"
//    link:"https://www.facebook.com/app_scoped_user_id/105837906563288/"
//    name:"Leroy Jenkins"
//    updated_time:"2016-11-02T21:27:29+0000"



//    gravatar_id:""
//    hireable:null
//    html_url:"https://github.com/joshkelley19"
//    id:17916927
//    location:null
//    login:"joshkelley19"
//    name:"Josh Kelley"
//    updated_at:"2016-09-28T21:07:42Z"


    public User(){

    }

    public User(String user, String pass){
        this.userName=user;this.password=pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
