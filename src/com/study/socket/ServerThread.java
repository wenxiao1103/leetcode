package com.study.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author xiaowen
 * @date 2020/9/11 5:11 下午
 */
//public class ServerThread implements Runnable {

//    private Socket client = null;
//
//    public ServerThread(Socket client) {
//        this.client = client;
//    }
//    private final Logger log = LoggerFactory.getLogger(ServerThread.class);
//    @Override
//    public void run() {
//        try {
//            PrintStream sendResponse = new PrintStream(client.getOutputStream());
//            BufferedReader getRequest = new BufferedReader(new InputStreamReader(client.getInputStream()));
//            sendResponse.println("clientID:" + client.hashCode());
//            boolean flag = true;
//            while (flag) {
//                String req = getRequest.readLine();
//                if (req == null || "".equals(req)) {
//                    logger.info("获得空请求，关闭该连接：" + client.hashCode());
//                    break;
//                }
//                if ("disconnect".equals(req)) {
//                    flag = false;// 获得客户端终止标示的请求，则断开连接。
//                } else {
//                    logger.info(req);
//                    sendResponse.println("echo:" + req);
//                }
//            }
//            getRequest.close();
//            sendResponse.close();
//            client.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
