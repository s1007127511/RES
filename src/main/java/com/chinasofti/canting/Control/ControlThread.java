package com.chinasofti.canting.Control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

public class ControlThread implements Runnable{
	//客户端对象
	private Socket client;
	private Object o;
	
	public ControlThread(Socket client, Object o) {
		super();
		this.client = client;
		this.o = o;
	}

	@Override
	public void run() {
		try {
			ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
			String methodName = ois.readUTF();
			Class<?>[] methodTypes=(Class<?>[]) ois.readObject();
			Object[] methodParams=(Object[]) ois.readObject();
			Method method = o.getClass().getMethod(methodName,methodTypes);
			Object result=method.invoke(o, methodParams);
			ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
			oos.writeObject(result);
			oos.flush();
			
			
			
		} catch (IOException | ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}