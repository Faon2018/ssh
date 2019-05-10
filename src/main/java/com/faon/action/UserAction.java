package com.faon.action;

import com.faon.entity.User;
import com.faon.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @author Faon
 * @Date 2019/5/10  17:18
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
    @Autowired
    private UserService userService;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() {
        if(userService.login(user)) {
            Map session = ActionContext.getContext().getSession();
            session.put("user", user);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

}
