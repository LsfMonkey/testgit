/**
 * @(#)HelloWordServiceImpl.java, May 16, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.winwill.thrift.service;

import com.winwill.thrift.Request;
import com.winwill.thrift.RequestException;
import org.apache.commons.lang3.StringUtils;
import org.apache.thrift.TException;

import java.util.Date;

/**
 * @author liushuaifei
 */
public class HelloWordServiceImpl implements com.winwill.thrift.HelloWordService.Iface {
    @Override
    public String doAction(Request request) throws RequestException, TException {
        System.out.println("Get request: " + request);
        if (StringUtils.isBlank(request.getName()) || request.getType() == null) {
            throw new com.winwill.thrift.RequestException();
        }
        String result = "Hello, " + request.getName();
        if (request.getType() == com.winwill.thrift.RequestType.SAY_HELLO) {
            result += ", Welcome!";
        } else {
            result += ", Now is " + new Date().toLocaleString();
        }
        return result;
    }
}