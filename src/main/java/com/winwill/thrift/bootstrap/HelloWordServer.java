/**
 * @(#)HelloWordServer.java, May 16, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.winwill.thrift.bootstrap;

import com.winwill.thrift.service.HelloWordServiceImpl;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

import java.net.ServerSocket;

/**
 * @author liushuaifei
 */
public class HelloWordServer {
    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(7912);
        TServerSocket serverTransport = new TServerSocket(socket);
        com.winwill.thrift.HelloWordService.Processor processor = new com.winwill.thrift.HelloWordService.Processor(new HelloWordServiceImpl());
        TServer.Args tArgs = new TServer.Args(serverTransport);
        tArgs.processor(processor);
//        tArgs.protocolFactory(new TCompactProtocol.Factory());
        System.out.println("Running server...");
        TServer server = new TSimpleServer(tArgs);
        server.serve();
        System.out.println("HelloWorld TSimpleServer start ....");
//
////          TProcessor tprocessor = new HelloWorldService.Processor<HelloWorldService.Iface>(new  HelloWorldImpl());
//        HelloWorldService.Processor<HelloWorldService.Iface> tprocessor = new HelloWorldService.Processor<HelloWorldService.Iface>(new HelloWorldImpl());
//
//        // 简单的单线程服务模型，一般用于测试
//        TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
//        TServer.Args tArgs = new TServer.Args(serverTransport);
//        tArgs.processor(tprocessor);
////            tArgs.protocolFactory(new TBinaryProtocol.Factory());
//        tArgs.protocolFactory(new TCompactProtocol.Factory());
//        // tArgs.protocolFactory(new TJSONProtocol.Factory());
//        TServer server = new TSimpleServer(tArgs);
//        server.serve();

//        Processor<HelloWordServiceImpl> processor = new Processor<>(new HelloWordServiceImpl());
//        ServerSocket socket = new ServerSocket(7912);
//        TServerSocket serverTransport = new TServerSocket(socket);
//        TServer.Args tArgs = new TServer.Args(serverTransport);
//        tArgs.processor(processor);
//        tArgs.protocolFactory(new TCompactProtocol.Factory());
//        TServer server = new TSimpleServer(tArgs);
//        server.serve();
//        System.out.println("HelloWorld TSimpleServer start ....");
    }
}