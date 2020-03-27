package com.oyxh.stock.controller;

import org.springframework.stereotype.Controller;

import com.oyxh.stock.common.utils.ShiroUtils;
import com.oyxh.stock.domain.UserDO;


@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}

}