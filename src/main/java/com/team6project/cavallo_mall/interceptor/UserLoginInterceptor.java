package com.team6project.cavallo_mall.interceptor;

import com.team6project.cavallo_mall.constants.CavalloConstant;
import com.team6project.cavallo_mall.exception.UserLoginException;
import com.team6project.cavallo_mall.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/18 1:28
 */
@Slf4j
public class UserLoginInterceptor implements HandlerInterceptor {

    /**
     *
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)  {
        log.info("preHandle");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute(CavalloConstant.CURRENT_USER);
        if (user == null) {
            log.info("user == null");
            throw new UserLoginException();
        }
        return true;
    }
}
