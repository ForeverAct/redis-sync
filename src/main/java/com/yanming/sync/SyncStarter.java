package com.yanming.sync;

import com.yanming.sync.client.NettyClient;
import com.yanming.sync.listener.SyncReplicateListener;

/**
 * Created by allan on 16/5/11.
 */
public class SyncStarter {
    public static void main(String[] args) {
        /**
         *
         if (args == null || args.length < 2) {
         System.err.println("usage: java SyncStarter host port");
         System.exit(1);
         }
         String host = args[0];
         int port = Integer.valueOf(args[1]);
         */
        String fHost = "10.36.40.82";
        int fPort = 6479;
        String tHost = "127.0.0.1";
        int tPort = 6379;
        //SyncReplicateListener listener = new SyncReplicateListener(tHost, tPort);
        //NettyClient from = new NettyClient(fHost, fPort, listener);
        NettyClient from = new NettyClient(fHost, fPort, null);
        from.start();
        from.auth("push");
        from.psync("ffe69c63f8b154d14f9010dbca3824abeecad99e",193141853);

    }
}
