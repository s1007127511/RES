package com.chinasofti.canting.Control;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class serverControl {
	private ServerSocket server;
	public static final int PORT=9999;
	//创建线程池对象
	private ExecutorService ex;
	//创建被代理对象
	private RESService service;
	//构造方法
	public serverControl() {
		try {
			System.out.println("服务器开启中····");
			this.server=new ServerSocket(PORT);
			Thread.sleep(1000);
			System.out.println("服务器已开启····");
			//实例化线程池对象 缓冲池
			ex=Executors.newCachedThreadPool();
			this.service=new RESServiceImpl();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}

	//自定义方法，项目流程 方法
	public void start(){
		while(true){
			try {
				Socket client=this.server.accept();
				System.out.println("用户"+client.getInetAddress().getHostAddress()+"已连接");
				//创建线程对象
				ControlThread ct=new ControlThread(client,service);
				//将线程交给线程池
				ex.submit(ct);
				//返回线程池活跃数量
				int ac = ((ThreadPoolExecutor)ex).getActiveCount();
				System.out.println("当前活跃数量："+ac);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}


}