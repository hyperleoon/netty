package com.hyperleon.thinking.netty.test;

import io.netty.channel.EventLoop;
import io.netty.channel.ThreadPerChannelEventLoopGroup;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.oio.OioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.channel.socket.oio.OioServerSocketChannel;
import io.netty.channel.socket.oio.OioSocketChannel;

/**
 * @author leon
 * @date 2022-07-11 23:21
 **/
public class EventLoopTest {

    public static void main(String[] args) {
        // bio
        ThreadPerChannelEventLoopGroup oioEventLoopGroup = new OioEventLoopGroup();
        EventLoop bioLoop = oioEventLoopGroup.next();
        OioServerSocketChannel oioServerSocketChannel = new OioServerSocketChannel();
        OioSocketChannel oioSocketChannel = new OioSocketChannel();

        // nio
        NioEventLoopGroup eventExecutors = new NioEventLoopGroup(2);
        NioEventLoop nioLoop = (NioEventLoop)eventExecutors.next();
        NioSocketChannel nioSocketChannel = new NioSocketChannel();
        NioServerSocketChannel nioServerSocketChannel = new NioServerSocketChannel();
    }
}
